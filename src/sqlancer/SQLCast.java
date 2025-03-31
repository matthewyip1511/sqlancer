package sqlancer;

import sqlancer.clickhouse.ast.constant.ClickHouseCreateConstant;
import sqlancer.common.ast.newast.Expression;
import sqlancer.common.schema.AbstractTableColumn;
import sqlancer.sqlite3.ast.SQLite3Constant;

import java.math.BigDecimal;
import java.util.function.Function;
import java.util.regex.Pattern;

public final class SQLCast {

    private static final byte FILE_SEPARATOR = 0x1c;
    private static final byte GROUP_SEPARATOR = 0x1d;
    private static final byte RECORD_SEPARATOR = 0x1e;
    private static final byte UNIT_SEPARATOR = 0x1f;
    private static final byte SYNCHRONOUS_IDLE = 0x16;

    private static final double MAX_INT_FOR_WHICH_CONVERSION_TO_INT_IS_TRIED = Math.pow(2, 51 - 1) - 1;
    private static final double MIN_INT_FOR_WHICH_CONVERSION_TO_INT_IS_TRIED = -Math.pow(2, 51 - 1);

    private SQLCast() {

    }

    public static <T> T castToIntText(String asString, Function<Long, T> createConstant) {
        while (startsWithWhitespace(asString)) {
            asString = asString.substring(1);
        }
        if (!asString.isEmpty() && unprintAbleCharThatLetsBecomeNumberZero(asString)) {
            return createConstant.apply(0L);
        }
        for (int i = asString.length(); i >= 0; i--) {
            try {
                String substring = asString.substring(0, i);
                Pattern p = Pattern.compile("[+-]?\\d\\d*");
                if (p.matcher(substring).matches()) {
                    BigDecimal bg = new BigDecimal(substring);
                    long result;
                    try {
                        result = bg.longValueExact();
                    } catch (ArithmeticException e) {
                        if (substring.startsWith("-")) {
                            result = Long.MIN_VALUE;
                        } else {
                            result = Long.MAX_VALUE;
                        }
                    }
                    return createConstant.apply(result);
                }
            } catch (Exception e) {

            }
        }
        return createConstant.apply(0L);
    }

    public static <T> T convertInternal(String asString, boolean convertRealToInt, boolean noNumIsRealZero,
            boolean convertIntToReal, Function<Long, T> createConstant1, Function<Double, T> createConstant2) {
        while (startsWithWhitespace(asString)) {
            asString = asString.substring(1);
        }
        if (!asString.isEmpty() && unprintAbleCharThatLetsBecomeNumberZero(asString)) {
            return createConstant1.apply(0L);
        }
        if (asString.toLowerCase().startsWith("-infinity") || asString.toLowerCase().startsWith("infinity")
                || asString.startsWith("NaN")) {
            return createConstant1.apply(0L);
        }
        for (int i = asString.length(); i >= 0; i--) {
            try {
                String substring = asString.substring(0, i);
                double d = Double.parseDouble(substring);
                BigDecimal first = new BigDecimal(substring);
                long longValue = first.longValue();
                BigDecimal second = BigDecimal.valueOf(longValue);
                boolean isWithinConvertibleRange = longValue >= MIN_INT_FOR_WHICH_CONVERSION_TO_INT_IS_TRIED
                        && longValue <= MAX_INT_FOR_WHICH_CONVERSION_TO_INT_IS_TRIED && convertRealToInt;
                boolean isFloatingPointNumber = substring.contains(".") || substring.toUpperCase().contains("E");
                boolean doubleShouldBeConvertedToInt = isFloatingPointNumber && first.compareTo(second) == 0
                        && isWithinConvertibleRange;
                boolean isInteger = !isFloatingPointNumber && first.compareTo(second) == 0;
                if (doubleShouldBeConvertedToInt || isInteger && !convertIntToReal) {
                    // see https://www.sqlite.org/src/tktview/afdc5a29dc
                    return createConstant1.apply(first.longValue());
                } else {
                    return createConstant2.apply(d);
                }
            } catch (Exception e) {
            }
        }
        if (noNumIsRealZero) {
            return createConstant2.apply(0.0);
        } else {
            return createConstant1.apply(0L);
        }
    }

    private static boolean startsWithWhitespace(String asString) {
        if (asString.isEmpty()) {
            return false;
        }
        char c = asString.charAt(0);
        switch (c) {
        case ' ':
        case '\t':
        case 0x0b:
        case '\f':
        case '\n':
        case '\r':
            return true;
        default:
            return false;
        }
    }

    private static boolean unprintAbleCharThatLetsBecomeNumberZero(String s) {
        // non-printable characters are ignored by Double.valueOf
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            if (!Character.isISOControl(charAt) && !Character.isWhitespace(charAt)) {
                return false;
            }
            switch (charAt) {
            case GROUP_SEPARATOR:
            case FILE_SEPARATOR:
            case RECORD_SEPARATOR:
            case UNIT_SEPARATOR:
            case SYNCHRONOUS_IDLE:
                return true;
            default:
                // fall through
            }

            if (Character.isWhitespace(charAt)) {
                continue;
            } else {
                return true;
            }
        }
        return false;
    }

}

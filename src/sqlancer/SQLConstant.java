package sqlancer;

import sqlancer.common.ast.newast.Expression;
import sqlancer.mysql.ast.MySQLConstant;

public final class SQLConstant {
    private SQLConstant() {
    }

    public enum CastType {
        SIGNED, UNSIGNED;

        public static CastType getRandom() {
            return SIGNED;
            // return Randomly.fromOptions(CastType.values());
        }

    }

    public static <T extends Number> String clickhouseFloatToString(T value) {
        double doubleVal = value.doubleValue();
        if (doubleVal == Double.POSITIVE_INFINITY) {
            return "'+Inf'";
        } else if (doubleVal == Double.NEGATIVE_INFINITY) {
            return "'-Inf'";
        }
        return String.valueOf(value);
    }

    public static boolean asBooleanNotNullConstantHelper(String value, int limit) {
        for (int i = value.length(); i >= limit; i--) {
            try {
                String substring = value.substring(0, i);
                Double val = Double.valueOf(substring);
                return val != 0 && !Double.isNaN(val);
            } catch (NumberFormatException e) {
                // ignore
            }
        }
        return false;
    }

    public static String getTextRepresentationText(String value, boolean singleQuotes) {
        StringBuilder sb = new StringBuilder();
        String quotes = singleQuotes ? "'" : "\"";
        sb.append(quotes);
        String text = value.replace(quotes, quotes + quotes).replace("\\", "\\\\");
        sb.append(text);
        sb.append(quotes);
        return sb.toString();
    }

    public static String getTextRepresentationNumeric(double val) {
        if (Double.isFinite(val)) {
            return String.valueOf(val);
        } else {
            return "'" + val + "'";
        }
    }

    public static String getTextRepresentationRange(long left, boolean leftIsInclusive, long right, boolean rightIsInclusive) {
        StringBuilder sb = new StringBuilder();
        sb.append("'");
        if (leftIsInclusive) {
            sb.append("[");
        } else {
            sb.append("(");
        }
        sb.append(left);
        sb.append(",");
        sb.append(right);
        if (rightIsInclusive) {
            sb.append("]");
        } else {
            sb.append(")");
        }
        sb.append("'");
        sb.append("::int4range");
        return sb.toString();
    }

    public static Expression<?> castAsHelper(String v, int limit, Enum<?> type) {
        if (type.name().equals(CastType.SIGNED.name()) || type.name().equals(CastType.UNSIGNED.name())) {
            String value = v;
            while (value.startsWith(" ") || value.startsWith("\t") || value.startsWith("\n")) {
                if (value.startsWith("\n")) {
                    /* workaround for https://bugs.mysql.com/bug.php?id=96294 */
                    throw new IgnoreMeException();
                }
                value = value.substring(1);
            }
            for (int i = value.length(); i >= limit; i--) {
                try {
                    String substring = value.substring(0, i);
                    long val = Long.parseLong(substring);
                    return MySQLConstant.createIntConstant(val, type.name().equals(CastType.SIGNED.name()));
                } catch (NumberFormatException e) {
                    // ignore
                }
            }
            return MySQLConstant.createIntConstant(0, type.name().equals(CastType.SIGNED.name()));
        } else {
            throw new AssertionError();
        }
    }

    public static String duckTiDBYCQLHelper(double value) {
        if (value == Double.POSITIVE_INFINITY) {
            return "'+Inf'";
        } else if (value == Double.NEGATIVE_INFINITY) {
            return "'-Inf'";
        }
        return String.valueOf(value);
    }
}

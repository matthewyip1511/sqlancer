package sqlancer;

public final class SQLConstant {
    private SQLConstant() {
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
}

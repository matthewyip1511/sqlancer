package sqlancer;

public class SQLCommon {
    public static boolean appendIntDataType(StringBuilder sb, boolean allowSerial) {
        boolean serial = false;
        if (Randomly.getBoolean() && allowSerial) {
            serial = true;
            sb.append(Randomly.fromOptions("serial", "bigserial"));
        } else {
            sb.append(Randomly.fromOptions("smallint", "integer", "bigint"));
        }
        return serial;
    }

    public static void appendBitDataType(StringBuilder sb) {
        sb.append("BIT");
        // if (Randomly.getBoolean()) {
        sb.append(" VARYING");
        // }
        sb.append("(");
        sb.append(Randomly.getNotCachedInteger(1, 500));
        sb.append(")");
    }

    public static void appendInetDataType(StringBuilder sb) {
        sb.append("inet");
    }
}

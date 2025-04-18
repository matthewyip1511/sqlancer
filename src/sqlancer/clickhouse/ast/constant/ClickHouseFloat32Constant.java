package sqlancer.clickhouse.ast.constant;

import com.clickhouse.client.ClickHouseDataType;

import sqlancer.SQLConstantUtils;
import sqlancer.clickhouse.ast.ClickHouseNumericConstant;

public class ClickHouseFloat32Constant extends ClickHouseNumericConstant<Float> {

    public ClickHouseFloat32Constant(float value) {
        super(value);
    }

    @Override
    public String toString() {
        return SQLConstantUtils.clickhouseFloatToString(value);
    }

    @Override
    public boolean compareInternal(Object val) {
        return Float.compare(value, (float) val) == 0;
    }

    @Override
    public boolean asBooleanNotNull() {
        return Float.compare(value, (float) 0) == 0;
    }

    @Override
    public ClickHouseDataType getDataType() {
        return ClickHouseDataType.Float32;
    }

    @Override
    public double asDouble() {
        return value;
    }
}

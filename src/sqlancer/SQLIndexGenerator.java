package sqlancer;

public class SQLIndexGenerator {

    protected SQLIndexGenerator() {
    }

    public enum IndexType {
        BTREE, HASH, GIST, GIN
    }

}

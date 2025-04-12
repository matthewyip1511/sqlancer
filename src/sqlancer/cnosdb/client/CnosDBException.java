package sqlancer.cnosdb.client;

public class CnosDBException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public CnosDBException(String message) {
        super(message);
    }
}

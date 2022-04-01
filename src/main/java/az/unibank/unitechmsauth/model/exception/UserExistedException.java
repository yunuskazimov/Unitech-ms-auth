package az.unibank.unitechmsauth.model.exception;

public class UserExistedException extends RuntimeException {
    public UserExistedException(String message) {
        super(message);
    }
}

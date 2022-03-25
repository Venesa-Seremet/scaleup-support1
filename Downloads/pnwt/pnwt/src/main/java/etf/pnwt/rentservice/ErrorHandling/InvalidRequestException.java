package etf.pnwt.rentservice.ErrorHandling;

public class InvalidRequestException extends Exception {
    public InvalidRequestException(String error) {
        super(error);
    }
}
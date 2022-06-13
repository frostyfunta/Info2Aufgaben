package S22_b4;

public class IllegalLoanException extends Exception{
    public IllegalLoanException(String errorMessage){
        super(errorMessage);
    }
}

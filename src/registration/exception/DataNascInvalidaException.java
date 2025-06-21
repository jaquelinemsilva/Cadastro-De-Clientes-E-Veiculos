package registration.exception;

public class DataNascInvalidaException extends Exception{
    public DataNascInvalidaException(){
        super ("Digite no formato DD/MM/YYYY: ");
    }
}

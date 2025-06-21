package registration.exception;

public class PlacaInvalidaException extends Exception {
    public PlacaInvalidaException() {

        super("Digite uma placa no formato AAA-0000 ou AAA1B22!");
    }
}

package registration.exception;

public class EmailInvalidoException extends Exception {
    public EmailInvalidoException(){

        super("Domínio do e-mail é inválido!");
    }
}

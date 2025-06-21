package registration.exception;

public class TelefoneInvalidoException extends Exception {
    public TelefoneInvalidoException(){

        super ("Digite um telefone válido com DDD (00) e o número!");
    }
}

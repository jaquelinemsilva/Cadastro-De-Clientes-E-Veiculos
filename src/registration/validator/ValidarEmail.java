package registration.validator;

import registration.exception.EmailInvalidoException;

public class ValidarEmail {
    public static void validarEmail(String email) throws EmailInvalidoException {

        if (!email.contains("@")){
            throw new EmailInvalidoException();
        }
    }
}
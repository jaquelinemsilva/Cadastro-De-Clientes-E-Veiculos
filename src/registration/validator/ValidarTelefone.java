package registration.validator;

import registration.exception.TelefoneInvalidoException;

public class ValidarTelefone {
    public static void validarTelefone (String telefone) throws TelefoneInvalidoException {

        if (telefone.length() < 10 || telefone.length() > 11){
            throw new TelefoneInvalidoException();
        }

        for (int i = 0; i < telefone.length(); i++){
            if (Character.isLetter(telefone.charAt(i))){
                throw new TelefoneInvalidoException();
            }
        }
    }
}

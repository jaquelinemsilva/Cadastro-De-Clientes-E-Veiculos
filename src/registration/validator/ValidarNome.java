package registration.validator;

import registration.exception.NomeInvalidoException;

public class ValidarNome {
    public static void validarNome(String nome) throws NomeInvalidoException {
        if (nome.length() < 5 || nome.length() > 50) {
            throw new NomeInvalidoException("O nome deve ter entre 5 e 50 caracteres.");
        }

        char caractere = ' ';

        for (int i = 0; i < nome.length(); i++) {
            caractere = nome.charAt(i);

            if (Character.isDigit(caractere)) {
                throw new NomeInvalidoException("O nome não pode conter números.");
            }
        }
    }
}

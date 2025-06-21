package registration.validator;

import registration.exception.MarcaInvalidaException;

public class ValidarMarcaCarro {
    public static void validarMarca(String marca) throws MarcaInvalidaException {

        for (int i = 0; i < marca.length(); i++){
            if (Character.isDigit(marca.charAt(i))){
                throw new MarcaInvalidaException();
            }
        }
    }
}
package registration.validator;

import registration.exception.ModeloInvalidoException;

public class ValidarModeloCarro {
    public static void validarModelo(String modelo) throws ModeloInvalidoException {

        if (modelo.isEmpty()){
            throw new ModeloInvalidoException();
        }
    }
}

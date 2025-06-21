package registration.validator;

import registration.exception.PlacaInvalidaException;

public class ValidarPlaca {
    public static void validarPlaca(String placa) throws PlacaInvalidaException {

        if (!placa.contains("-")) {
            if (placa.length() != 7) {
                throw new PlacaInvalidaException();
            }

            for (int i = 0; i <= 2; i++) {
                if (!Character.isLetter(placa.charAt(i))) {
                    throw new PlacaInvalidaException();
                }
            }

            if (!Character.isDigit(placa.charAt(3))) {
                throw new PlacaInvalidaException();
            }

            if (!Character.isLetter(placa.charAt(4))) {
                throw new PlacaInvalidaException();
            }

            for (int i = 5; i <= 6; i++) {
                if (!Character.isDigit(placa.charAt(i))) {
                    throw new PlacaInvalidaException();
                }
            }
        } else {

            if ((placa.length() != 8) || (placa.charAt(3) != '-')) {
                throw new PlacaInvalidaException();
            }

            for (int i = 0; i <= 2; i++) {
                if (!Character.isLetter(placa.charAt(i))) {
                    throw new PlacaInvalidaException();
                }
            }

            for (int i = 4; i <= 7; i++) {
                if (!Character.isDigit(placa.charAt(i))) {
                    throw new PlacaInvalidaException();
                }
            }

        }
    }
}

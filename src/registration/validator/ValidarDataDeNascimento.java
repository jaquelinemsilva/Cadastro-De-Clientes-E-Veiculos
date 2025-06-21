package registration.validator;

import registration.exception.DataNascInvalidaException;
import registration.exception.MenorDeIdadeException;

public class ValidarDataDeNascimento {
    public static void validarNascimento (String nascimento) throws DataNascInvalidaException, MenorDeIdadeException {

        if (nascimento.length()>10){
            throw new DataNascInvalidaException();
        }

        if (nascimento.charAt(2) != '/' || nascimento.charAt(5) != '/'){
            throw new DataNascInvalidaException();
        }

        String [] separarAno = nascimento.split("/");

        for (int i = 0; i<separarAno.length; i++);

        int anoNascimento = Integer.parseInt(separarAno[2]);
        int anoAtual = 2025;
        int validarIdade = anoAtual - anoNascimento;

        if (validarIdade < 18){
            throw new MenorDeIdadeException();
        }
    }
}

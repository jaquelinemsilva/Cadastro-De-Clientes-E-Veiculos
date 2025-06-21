package registration.main;

import registration.exception.*;
import registration.model.CadastroCliente;
import registration.model.CadastroVeiculo;
import registration.validator.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CadastroCliente cliente = new CadastroCliente();
        CadastroVeiculo veiculo = new CadastroVeiculo();

        boolean infoInvalida = true;

        while (infoInvalida) {

            try {
                System.out.print("Por favor, digite seu nome: ");
                cliente.setNome(scanner.nextLine());
                ValidarNome.validarNome(cliente.getNome());
                infoInvalida = false;
            } catch (NomeInvalidoException e) {
                System.out.println(e.getMessage());
            }
        }

        infoInvalida = true;

        while (infoInvalida) {

            try {
                System.out.print("Agora digite o seu e-mail: ");
                cliente.setEmail(scanner.nextLine());
                ValidarEmail.validarEmail(cliente.getEmail());
                infoInvalida = false;
            } catch (EmailInvalidoException e) {
                System.out.println(e.getMessage());
            }
        }

        infoInvalida = true;

        while (infoInvalida) {

            try {
                System.out.print("Digite sua data de nascimento: ");
                cliente.setDataNascimento(scanner.nextLine());
                ValidarDataDeNascimento.validarNascimento(cliente.getDataNascimento());
                infoInvalida = false;
            } catch (DataNascInvalidaException e) {
                System.out.println(e.getMessage());
            } catch (MenorDeIdadeException e) {
                System.out.println(e.getMessage());
            }
        }

        infoInvalida = true;

        while (infoInvalida) {

            try {
                System.out.print("Digite um telefone para contato: ");
                cliente.setTelefone(scanner.nextLine());
                ValidarTelefone.validarTelefone(cliente.getTelefone());
                infoInvalida = false;
            } catch (TelefoneInvalidoException e) {
                System.out.println(e.getMessage());
            }
        }

        infoInvalida = true;

        while (infoInvalida) {

            try {
                System.out.print("Digite o modelo do seu carro: ");
                veiculo.setModelo(scanner.nextLine());
                ValidarModeloCarro.validarModelo(veiculo.getModelo());
                infoInvalida = false;
            } catch (ModeloInvalidoException e) {
                System.out.println(e.getMessage());
            }
        }
        infoInvalida = true;

        while (infoInvalida) {

            try {
                System.out.print("Digite a marca do carro: ");
                veiculo.setMarca(scanner.nextLine());
                ValidarMarcaCarro.validarMarca(veiculo.getMarca());
                infoInvalida = false;
            } catch (MarcaInvalidaException e) {
                System.out.print(e.getMessage());
            }
        }

        infoInvalida = true;

        while (infoInvalida) {

            try {
                System.out.print("Digite a placa do carro: ");
                veiculo.setPlaca(scanner.nextLine());
                ValidarPlaca.validarPlaca(veiculo.getPlaca());
                infoInvalida = false;
            } catch (PlacaInvalidaException e) {
                System.out.println(e.getMessage());
            }

        }

        exibirResumoCadastro(cliente,veiculo);

        scanner.close();
    }

    public static void exibirResumoCadastro(CadastroCliente cliente, CadastroVeiculo veiculo) {
        System.out.println("\n--- Cadastro realizado com sucesso! ---\n");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Modelo do carro: " + veiculo.getModelo());
        System.out.println("Marca do carro: " + veiculo.getMarca());
        System.out.println("Placa do carro: " + veiculo.getPlaca());
    }
}

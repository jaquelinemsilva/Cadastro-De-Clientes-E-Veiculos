# Cadastro de Cliente e Veículo
Esse projeto em Java tem como objetivo realizar o cadastro de clientes e veículos, com validações personalizadas utilizando exceções (Exceptions) específicas para cada situação, garantindo a integridade dos dados digitados pelo usuário.

## Funcionalidades:

### Validações de cliente:

- **Nome**: deve conter entre 5 e 50 caracteres e não pode conter números.
- **E-mail**: deve conter o caractere `@`.
- **Data de Nascimento**: deve estar no formato `DD/MM/YYYY`.
- **Idade Mínima**: o cliente deve ser maior de idade, ou seja, ter mais que 18 anos.
- **Telefone**: deve estar no formato brasileiro aceitando números com ou sem o 9º dígito. O DDD precisa ser digitado com 2 dígitos.

### Validações de veículo:

- **Modelo**: o modelo não pode ficar em branco.
- **Marca**: não pode ter caracteres numéricos.
- **Placa**: aceita os dois formatos válidos no brasil: **Antigo** - `AAA-1234` ou **Mercosul** - `AAA1B22`.

## Exceções:

O projeto define oito exceções para as validações citadas anteriormente.

- **DataNascInvalidaException**: lançada quando o formato da data é digitado incorretamente.
- **EmailInvalidoException**: lançada quando o e-mail é digitado sem `@`.
- **MarcaInvalidaException**: lançada quando a marca é digitada com caracteres numéricos.
- **MenorDeIdadeException**: lançada quando o usuário digita uma data de nascimento menor que 18 anos.
- **ModeloInvalidoException**: lançada quando o usuário deixa o campo em branco.
- **NomeInvalidoException**: lançada quando o nome digitado possui caracteres numéricos ou quando não possui a quantidade de caracteres solicitada na validação.
- **PlacaInvalidaException**: lançada quando a placa digitada não segue nenhum dos modelos.
- **TelefoneInvalidoException**: lançada quando o telefone digitado não corresponde ao formato brasileiro.

## Tecnologias utilizadas:

- Java 21+
- Paradigma Orientado a Objetos (POO).

## Como executar:

   ```bash
   git clone https://github.com/jaquelinemsilva/Cadastro-de-Clientes-e-Veiculos.git
```
- Compile e execute no terminal:
  ```bash
  javac Main.java
  java Main
  
Caso utilize o Intellij, pode executar o arquivo dentro do pacote `registration.main`.

# Autora:

Jaqueline Maria da Silva

- LinkedIn: https://www.linkedin.com/in/jaquelinemariadev/

- GitHub: https://github.com/jaquelinemsilva
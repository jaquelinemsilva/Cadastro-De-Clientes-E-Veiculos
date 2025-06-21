package registration.model;

public class CadastroCliente {
    private String nome;
    private String email;
    private String dataNascimento;
    private String telefone;


    public CadastroCliente() {
        this.nome = " ";
        this.email = " ";
        this.dataNascimento = " ";
        this.telefone = " ";
    }

    public CadastroCliente(String nomeCliente, String emailCliente, String nascimentoCliente, String telefoneCliente){
        nome = nomeCliente;
        email = emailCliente;
        dataNascimento = nascimentoCliente;
        telefone = telefoneCliente;
    }

    public CadastroCliente (CadastroCliente cliente1){
        nome = cliente1.nome;
        email = cliente1.email;
        dataNascimento = cliente1.dataNascimento;
        telefone = cliente1.telefone;
    }

    public String getNome (){
        return nome;
    }

    public String getEmail (){
        return email;
    }

    public String getDataNascimento (){
        return dataNascimento;
    }

    public String getTelefone (){
        return telefone;
    }

    public void setNome (String nomeCliente){
        nome = nomeCliente;
    }

    public void setEmail (String emailCliente){
        email = emailCliente;
    }

    public void setDataNascimento (String nascimentoCliente){
        dataNascimento = nascimentoCliente;
    }

    public void setTelefone (String telefoneCliente){
        telefone = telefoneCliente;
    }

}

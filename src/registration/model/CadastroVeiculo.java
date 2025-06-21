package registration.model;

public class CadastroVeiculo {
    private String placa;
    private String modelo;
    private String marca;


    public CadastroVeiculo() {
        this.placa = " ";
        this.modelo = " ";
        this.marca = " ";
    }

    public CadastroVeiculo(String placaVeiculo, String modeloVeiculo, String marcaVeiculo){
        placa = placaVeiculo;
        modelo = modeloVeiculo;
        marca = marcaVeiculo;
    }

    public CadastroVeiculo (CadastroVeiculo veiculo1){
        placa = veiculo1.placa;
        modelo = veiculo1.modelo;
        marca = veiculo1.marca;
    }

    public String getPlaca (){
        return placa;
    }

    public String getModelo (){
        return modelo;
    }

    public String getMarca (){
        return marca;
    }

    public void setPlaca (String placaVeiculo){
        placa = placaVeiculo;
    }

    public void setModelo (String modeloVeiculo){
        modelo = modeloVeiculo;
    }

    public void setMarca (String marcaVeiculo){
        marca = marcaVeiculo;
    }

}


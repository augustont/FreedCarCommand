package br.com.freedomcarsat.freedcar.modelo;

/**
 * Created by Neto on 06/11/2015.
 */
public class Veiculo {
    private String modulo;
    private String senha;
    private String telefone;
    private String placa;
    private String marcaDoVeiculo;
    private String modelo;

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarcaDoVeiculo() {
        return marcaDoVeiculo;
    }

    public void setMarcaDoVeiculo(String marcaDoVeiculo) {
        this.marcaDoVeiculo = marcaDoVeiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

package br.com.freedomcarsat.freedcar;

import android.widget.EditText;

import br.com.freedomcarsat.freedcar.modelo.Veiculo;

/**
 * Created by Neto on 06/11/2015.
 */
public class FormularioHeper {
    private final EditText campoModulo;
    private final EditText campoSenha;
    private final EditText campoPlaca;
    private final EditText campoTelefone;
    private final EditText campoMarca;
    private final EditText campoModelo;

    public FormularioHeper (Formulario activity){
        campoModulo = (EditText) activity.findViewById(R.id.formulario_modulo);
        campoSenha = (EditText) activity.findViewById(R.id.formulario_senha);
        campoTelefone = (EditText) activity.findViewById(R.id.formulario_numerocell);
        campoPlaca = (EditText) activity.findViewById(R.id.formulario_placa);
        campoMarca = (EditText) activity.findViewById(R.id.formulario_marca);
        campoModelo = (EditText) activity.findViewById(R.id.formulario_modelo);

    }

    public Veiculo pegaVeiculo() {
        Veiculo veiculo = new Veiculo();
        veiculo.setModulo(campoModulo.getText().toString());
        veiculo.setSenha(campoSenha.getText().toString());
        veiculo.setTelefone(campoTelefone.getText().toString());
        veiculo.setPlaca(campoPlaca.getText().toString());
        veiculo.setMarcaDoVeiculo(campoMarca.getText().toString());
        veiculo.setModelo(campoModelo.getText().toString());

        return veiculo;
    }
}

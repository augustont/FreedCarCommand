package br.com.freedomcarsat.freedcar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import br.com.freedomcarsat.freedcar.dao.VeiculoDAO;
import br.com.freedomcarsat.freedcar.modelo.Veiculo;

public class Formulario extends AppCompatActivity {

    private FormularioHeper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        helper = new FormularioHeper(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_fomulario, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_formulario_ok:
                Intent intentVaiPraMain = new Intent(Formulario.this, MainActivity.class);
                startActivity(intentVaiPraMain);

                Veiculo veiculo = helper.pegaVeiculo();
                VeiculoDAO dao = new VeiculoDAO(this);
                dao.insere(veiculo);
                dao.close();

                Toast.makeText(Formulario.this, "Veículo " + veiculo.getPlaca()+ " Salvo!", Toast.LENGTH_SHORT).show();

                finish();
                break;

            case R.id.menu_formulario_cancel:
                Intent intentCancelVaiPraMain = new Intent(Formulario.this, MainActivity.class);
                startActivity(intentCancelVaiPraMain);
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}

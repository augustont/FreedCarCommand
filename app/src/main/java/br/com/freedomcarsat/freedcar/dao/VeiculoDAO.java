package br.com.freedomcarsat.freedcar.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import br.com.freedomcarsat.freedcar.modelo.Veiculo;

/**
 * Created by Neto on 17/11/2015.
 */
public class VeiculoDAO extends SQLiteOpenHelper{
    public VeiculoDAO(Context context) {
        super(context, "Cadastro", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Veiculos(id INTEGER PRIMARY KEY, modulo TEXT NOT NULL, senha TEXT NOT FULL, telefone TEXT NOT NULL, placa TEXT NOT NULL, marca TEXT, modelo TEXT);";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS Veiculos";
        db.execSQL(sql);
        onCreate(db);
    }

    public void insere(Veiculo veiculo) {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues dados = new ContentValues();
        dados.put("modulo", veiculo.getModulo());
        dados.put("senha", veiculo.getSenha());
        dados.put("telefone", veiculo.getTelefone());
        dados.put("placa", veiculo.getPlaca());
        dados.put("marca", veiculo.getMarcaDoVeiculo());
        dados.put("modelo", veiculo.getModelo());

        db.insert("Veiculos", null, dados);
    }
}

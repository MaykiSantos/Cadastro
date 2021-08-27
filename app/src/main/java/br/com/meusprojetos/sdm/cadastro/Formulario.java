package br.com.meusprojetos.sdm.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Formulario extends AppCompatActivity implements View.OnClickListener {

    private EditText nomeCompleto;
    private EditText telefone;
    private EditText email;
    private CheckBox addListaEmail;
    private RadioGroup sexo;
    private RadioButton sexoMasculino;
    private EditText cidade;
    private Spinner uf;
    private Button limpar;
    private Button salvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeCompleto = findViewById(R.id.inputNomeCompletoEt);
        telefone = findViewById(R.id.inputNumeroTelefoneEt);
        email = findViewById(R.id.inputEmailEt);
        addListaEmail = findViewById(R.id.inputemailCb);
        sexo = findViewById(R.id.inputSexoRb);
        sexoMasculino = findViewById(R.id.inputSexoMasculinoRb);
        cidade = findViewById(R.id.inputCidadeEt);
        uf = findViewById(R.id.inputUfSp);

        limpar = findViewById(R.id.buttonLimpar);
        salvar = findViewById(R.id.buttonSalvar);
        salvar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, this.toString(), Toast.LENGTH_LONG).show();
    }

    public void exibir(View view) {
        Toast.makeText(this, this.toString(), Toast.LENGTH_LONG).show();
    }

    @Override
    public String toString() {
        String check = (addListaEmail.isChecked()) ? "verdadeiro" : "falso";
        String valorSexo = sexoMasculino.isChecked() ? "masculino" : "feminino";

        return "nomeCompleto= " + nomeCompleto.getText().toString() + "\n" +
                "telefone= " + telefone.getText().toString() + "\n" +
                "email= " + email.getText().toString() + "\n" +
                "addListaEmail= " + check + "\n" +
                "sexo= " + valorSexo + "\n" +
                "cidade= " + cidade.getText().toString() + "\n" +
                "uf= " + ((TextView)uf.getSelectedView()).getText().toString() ;
    }

    public void limpar(View view){
        nomeCompleto.getText().clear();
        telefone.getText().clear();
        email.getText().clear();
        cidade.getText().clear();
        addListaEmail.setChecked(false);
        sexo.clearCheck();
    }
}
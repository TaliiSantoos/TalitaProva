package com.example.arqdsis.talitaprova;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ContinentesActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView lbNome;
    private Button btBuscar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continentes);

        lbNome = (TextView) findViewById(R.id.lbNome);
        btBuscar = (Button) findViewById(R.id.btBuscar);

        btBuscar.setOnClickListener(this);
    }

    /**
     *
     * Talita Nascimento Santos 201513111
     */
    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btBuscar) {
            Intent nomesPaises = new Intent(ContinentesActivity.this, PaisesActivity.class);
            startActivity(nomesPaises);
        }
    }
}

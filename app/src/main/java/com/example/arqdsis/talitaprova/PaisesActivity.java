package com.example.arqdsis.talitaprova;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class PaisesActivity extends AppCompatActivity {

    private ListView lvPaises;
    private String [] lista = {"Africa", "Americas", "Asia"," Europe", "Oceania"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paises);

        lvPaises = (ListView) findViewById(R.id.lvPaises);

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), lista.length, lista);
        lvPaises.setAdapter(adapter);
        lvPaises.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast mensagem = Toast.makeText(getApplicationContext(), lista[position], Toast.LENGTH_LONG);
                mensagem.show();
            }
        });


/** Talita Nascimento Santos 201513111
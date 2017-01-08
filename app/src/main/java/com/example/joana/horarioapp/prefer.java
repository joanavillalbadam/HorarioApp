package com.example.joana.horarioapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

/**
 * Created by Daniel on 07/01/2017.
 */

public class prefer extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prefer);

        Button btnGuardar = (Button) findViewById(R.id.button);
        btnGuardar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button)
        {
     //Al hacer click en el boton pasamos los valores al mainActivity.
            Intent i = new Intent(this,MainActivity.class);
            startActivity(i);
            Spinner group = (Spinner) findViewById(R.id.spinner);
            Spinner colour = (Spinner) findViewById(R.id.spinner1);

            SharedPreferences prefs =
                    getSharedPreferences("HorarioApp", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putString("grupo",group.getSelectedItem().toString());
            editor.putString("color",colour.getSelectedItem().toString());
            editor.commit();
        }
    }
}

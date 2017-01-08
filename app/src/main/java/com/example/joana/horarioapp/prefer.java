package com.example.joana.horarioapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

/**
 * Created by Daniel on 07/01/2017.
 */

public class prefer extends PreferenceActivity {

    public String clase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prefer);

        addPreferencesFromResource(R.xml.settings);
    }
}

package com.example.joana.horarioapp;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        //recoje la dificultad desde el intent
        String s = intent.getStringExtra("clase");

        TextView txtResultado = (TextView)findViewById(R.id.txtResultado);
      //  txtResultado.setText("esto es una prueba" + s);
        SQLiteDatabase db;
        //Iniciamos la base de datos
        BDHorario usdbh =
        new BDHorario(this,"BDHorario", null, 1);

        db = usdbh.getWritableDatabase();

        //pedimos la hora, los minutos y el dia de la semana del telefono
        int hora = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        //txtCodigo.append("són las: "+hora+"");
        int minut = Calendar.getInstance().get(Calendar.MINUTE);
        int monthDay = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)-1;
        String diasem = "nulo";
        switch (monthDay) {
            case 1:
                diasem = "Lunes";
                break;
            case 2:
                diasem = "Martes";
                break;
            case 3:
                diasem = "Miercoles";
                break;
            case 4:
                diasem = "jueves";
                break;
            case 5:
                diasem = "viernes";
                break;
        }

      //  if (s == "A1") {
            //Hacemos un select con
            Cursor c = db.rawQuery("SELECT COD_ASIGNATURA, HORA_INICIO, HORA_FIN, PROF FROM HORARIO Where ('" + hora + ":" + minut + "' BETWEEN HORA_INICIO AND HORA_FIN) AND (DIA = '" + diasem + "') AND (GRUPO = '"+s+"')", null);

            txtResultado.setText("");
            if (c.moveToFirst()) {
                //Recorremos el cursor hasta que no haya mas registros
                do {
                    String cod = c.getString(0);
                    String horini = c.getString(1);
                    String horfin = c.getString(2);
                    String prof = c.getString(3);

                    txtResultado.append(" ahora toca: " + cod + "\n Profesor: " + prof + " \n desde las: " + horini + "\n hasta las: " + horfin + "\n");
                } while (c.moveToNext());
            }
       /* } else if (s == "A2") {

            //Hacemos un select con
            Cursor c = db.rawQuery("SELECT COD_ASIGNATURA, HORA_INICIO, HORA_FIN, PROF FROM HORARIO Where ('" + hora + ":" + minut + "' BETWEEN HORA_INICIO AND HORA_FIN) AND (DIA = '" + diasem + "')", null);

            txtResultado.setText("");
            if (c.moveToFirst()) {
                //Recorremos el cursor hasta que no haya mas registros
                do {
                    String cod = c.getString(0);
                    String horini = c.getString(1);
                    String horfin = c.getString(2);
                    String prof = c.getString(3);

                    txtResultado.append(" ahora toca: " + cod + "\n Profesor: " + prof + " \n desde las: " + horini + "\n hasta las: " + horfin + "\n");
                } while (c.moveToNext());
            }
        }*/
    }
    }
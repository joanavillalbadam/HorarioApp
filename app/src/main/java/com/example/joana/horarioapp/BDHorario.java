package com.example.joana.horarioapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.TextView;

/**
 * Created by Daniel on 07/01/2017.
 */

public class BDHorario extends SQLiteOpenHelper{

    String sqlCreate = "CREATE TABLE HORARIO (GRUPO TEXT, ID_HORARIO INTEGER , COD_ASIGNATURA TEXT, HORA_INICIO TEXT, HORA_FIN TEXT, DIA INTEGER, PROF TEXT)";
    //  String sqlInsert = "INSERT INTO HORARIO (GRUPO,ID_HORARIO,COD_ASIGNATURA, HORA_INICIO, HORA_FIN, DIA) VALUES('A2',1,'M07',15:00:00,18:00:00,'Lunes')";
    public BDHorario(Context contexto, String nombre,
                                SQLiteDatabase.CursorFactory factory, int version) {
        super(contexto, nombre, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Se ejecuta la sentencia SQL de creacion de la tabla
        db.execSQL(sqlCreate);
       // db.execSQL(sqlCreate2);


       // BDHorario usdbh =
               // new BDHorario(this,this, null, 1);

        //db = usdbh.getWritableDatabase();

        ContentValues nuevoRegistro = new ContentValues();
        nuevoRegistro.put("GRUPO", "A2");
        nuevoRegistro.put("ID_HORARIO", 1);
        nuevoRegistro.put("COD_ASIGNATURA", "M07");
        nuevoRegistro.put("HORA_INICIO","15:00:00");
        nuevoRegistro.put("HORA_FIN", "18:00:00");
        nuevoRegistro.put("DIA", "Lunes");
        nuevoRegistro.put("PROF", "Leo");
        db.insert("HORARIO", null, nuevoRegistro);

        //ContentValues nuevoRegistro = new ContentValues();
        nuevoRegistro.put("GRUPO", "A2");
        nuevoRegistro.put("ID_HORARIO", 2);
        nuevoRegistro.put("COD_ASIGNATURA", "M03");
        nuevoRegistro.put("HORA_INICIO","18:20:00");
        nuevoRegistro.put("HORA_FIN", "20:20:00");
        nuevoRegistro.put("DIA", "Lunes");
        nuevoRegistro.put("PROF", "Josefa");
        db.insert("HORARIO", null, nuevoRegistro);

        //ContentValues nuevoRegistro = new ContentValues();
        nuevoRegistro.put("GRUPO", "A2");
        nuevoRegistro.put("ID_HORARIO", 3);
        nuevoRegistro.put("COD_ASIGNATURA", "M08");
        nuevoRegistro.put("HORA_INICIO","15:00:00");
        nuevoRegistro.put("HORA_FIN", "17:00:00");
        nuevoRegistro.put("DIA", "Martes");
        nuevoRegistro.put("PROF", "Lluis");
        db.insert("HORARIO", null, nuevoRegistro);

        nuevoRegistro.put("GRUPO", "A2");
        nuevoRegistro.put("ID_HORARIO", 4);
        nuevoRegistro.put("COD_ASIGNATURA", "M10");
        nuevoRegistro.put("HORA_INICIO","17:00:00");
        nuevoRegistro.put("HORA_FIN", "19:20:00");
        nuevoRegistro.put("DIA", "Martes");
        nuevoRegistro.put("PROF", "Marta");
        db.insert("HORARIO", null, nuevoRegistro);

        nuevoRegistro.put("GRUPO", "A2");
        nuevoRegistro.put("ID_HORARIO", 5);
        nuevoRegistro.put("COD_ASIGNATURA", "M05");
        nuevoRegistro.put("HORA_INICIO","19:20:00");
        nuevoRegistro.put("HORA_FIN", "21:20:00");
        nuevoRegistro.put("DIA", "Martes");
        nuevoRegistro.put("PROF", "Jorge");
        db.insert("HORARIO", null, nuevoRegistro);

        nuevoRegistro.put("GRUPO", "A2");
        nuevoRegistro.put("ID_HORARIO", 6);
        nuevoRegistro.put("COD_ASIGNATURA", "M08");
        nuevoRegistro.put("HORA_INICIO","16:00:00");
        nuevoRegistro.put("HORA_FIN", "18:00:00");
        nuevoRegistro.put("DIA", "Miercoles");
        nuevoRegistro.put("PROF", "Lluis");
        db.insert("HORARIO", null, nuevoRegistro);

        nuevoRegistro.put("GRUPO", "A2");
        nuevoRegistro.put("ID_HORARIO", 7);
        nuevoRegistro.put("COD_ASIGNATURA", "M05");
        nuevoRegistro.put("HORA_INICIO","18:20:00");
        nuevoRegistro.put("HORA_FIN", "19:20:00");
        nuevoRegistro.put("DIA", "Miercoles");
        nuevoRegistro.put("PROF", "Jorge");
        db.insert("HORARIO", null, nuevoRegistro);

        nuevoRegistro.put("GRUPO", "A2");
        nuevoRegistro.put("ID_HORARIO", 8);
        nuevoRegistro.put("COD_ASIGNATURA", "M09");
        nuevoRegistro.put("HORA_INICIO","19:20:00");
        nuevoRegistro.put("HORA_FIN", "20:20:00");
        nuevoRegistro.put("DIA", "Miercoles");
        nuevoRegistro.put("PROF", "Jorge");
        db.insert("HORARIO", null, nuevoRegistro);

        nuevoRegistro.put("GRUPO", "A2");
        nuevoRegistro.put("ID_HORARIO", 9);
        nuevoRegistro.put("COD_ASIGNATURA", "M03");
        nuevoRegistro.put("HORA_INICIO","16:00:00");
        nuevoRegistro.put("HORA_FIN", "18:00:00");
        nuevoRegistro.put("DIA", "Jueves");
        nuevoRegistro.put("PROF", "Josefa");
        db.insert("HORARIO", null, nuevoRegistro);

        nuevoRegistro.put("GRUPO", "A2");
        nuevoRegistro.put("ID_HORARIO", 10);
        nuevoRegistro.put("COD_ASIGNATURA", "M05");
        nuevoRegistro.put("HORA_INICIO","18:20:00");
        nuevoRegistro.put("HORA_FIN", "21:20:00");
        nuevoRegistro.put("DIA", "Jueves");
        nuevoRegistro.put("PROF", "Jorge");
        db.insert("HORARIO", null, nuevoRegistro);

        nuevoRegistro.put("GRUPO", "A2");
        nuevoRegistro.put("ID_HORARIO", 11);
        nuevoRegistro.put("COD_ASIGNATURA", "M10");
        nuevoRegistro.put("HORA_INICIO","15:00:00");
        nuevoRegistro.put("HORA_FIN", "17:00:00");
        nuevoRegistro.put("DIA", "Viernes");
        nuevoRegistro.put("PROF", "Marta");
        db.insert("HORARIO", null, nuevoRegistro);

        nuevoRegistro.put("GRUPO", "A2");
        nuevoRegistro.put("ID_HORARIO", 12);
        nuevoRegistro.put("COD_ASIGNATURA", "M09");
        nuevoRegistro.put("HORA_INICIO","17:00:00");
        nuevoRegistro.put("HORA_FIN", "19:20:00");
        nuevoRegistro.put("DIA", "Viernes");
        nuevoRegistro.put("PROF", "Jorge");
        db.insert("HORARIO", null, nuevoRegistro);

        nuevoRegistro.put("GRUPO", "A2");
        nuevoRegistro.put("ID_HORARIO", 13);
        nuevoRegistro.put("COD_ASIGNATURA", "M05");
        nuevoRegistro.put("HORA_INICIO","19:20:00");
        nuevoRegistro.put("HORA_FIN", "21:20:00");
        nuevoRegistro.put("DIA", "Viernes");
        nuevoRegistro.put("PROF", "Jorge");
        db.insert("HORARIO", null, nuevoRegistro);

        //   db.execSQL(sqlInsert);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAnterior,
                          int versionNueva) {

        db.execSQL("DROP TABLE IF EXISTS HORARIO");

        db.execSQL(sqlCreate);

    }
}



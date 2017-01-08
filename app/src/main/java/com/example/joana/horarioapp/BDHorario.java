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

    //hacemos la tabla horario
    String sqlCreate = "CREATE TABLE HORARIO (GRUPO TEXT, ID_HORARIO INTEGER , COD_ASIGNATURA TEXT, HORA_INICIO TEXT, HORA_FIN TEXT, DIA INTEGER, PROF TEXT)";

    public BDHorario(Context contexto, String nombre,
                                SQLiteDatabase.CursorFactory factory, int version) {
        super(contexto, nombre, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Se ejecuta la sentencia SQL de creacion de la tabla
        db.execSQL(sqlCreate);


    //Hacemos los inserts necesarios
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

        nuevoRegistro.put("GRUPO", "A1");
        nuevoRegistro.put("ID_HORARIO", 14);
        nuevoRegistro.put("COD_ASIGNATURA", "M07");
        nuevoRegistro.put("HORA_INICIO","15:00:00");
        nuevoRegistro.put("HORA_FIN", "18:00:00");
        nuevoRegistro.put("DIA", "Lunes");
        nuevoRegistro.put("PROF", "Leo");
        db.insert("HORARIO", null, nuevoRegistro);

        //ContentValues nuevoRegistro = new ContentValues();
        nuevoRegistro.put("GRUPO", "A1");
        nuevoRegistro.put("ID_HORARIO", 15);
        nuevoRegistro.put("COD_ASIGNATURA", "M03");
        nuevoRegistro.put("HORA_INICIO","15:00:00");
        nuevoRegistro.put("HORA_FIN", "17:00:00");
        nuevoRegistro.put("DIA", "Martes");
        nuevoRegistro.put("PROF", "Josefa");
        db.insert("HORARIO", null, nuevoRegistro);

        //ContentValues nuevoRegistro = new ContentValues();
        nuevoRegistro.put("GRUPO", "A1");
        nuevoRegistro.put("ID_HORARIO", 16);
        nuevoRegistro.put("COD_ASIGNATURA", "M10");
        nuevoRegistro.put("HORA_INICIO","17:00:00");
        nuevoRegistro.put("HORA_FIN", "19:20:00");
        nuevoRegistro.put("DIA", "Martes");
        nuevoRegistro.put("PROF", "Marta");
        db.insert("HORARIO", null, nuevoRegistro);

        nuevoRegistro.put("GRUPO", "A1");
        nuevoRegistro.put("ID_HORARIO", 17);
        nuevoRegistro.put("COD_ASIGNATURA", "M05");
        nuevoRegistro.put("HORA_INICIO","19:20:00");
        nuevoRegistro.put("HORA_FIN", "21:20:00");
        nuevoRegistro.put("DIA", "Martes");
        nuevoRegistro.put("PROF", "Jorge");
        db.insert("HORARIO", null, nuevoRegistro);

        nuevoRegistro.put("GRUPO", "A1");
        nuevoRegistro.put("ID_HORARIO", 18);
        nuevoRegistro.put("COD_ASIGNATURA", "M09");
        nuevoRegistro.put("HORA_INICIO","16:00:00");
        nuevoRegistro.put("HORA_FIN", "18:00:00");
        nuevoRegistro.put("DIA", "Miercoles");
        nuevoRegistro.put("PROF", "Jorge");
        db.insert("HORARIO", null, nuevoRegistro);

        nuevoRegistro.put("GRUPO", "A1");
        nuevoRegistro.put("ID_HORARIO", 19);
        nuevoRegistro.put("COD_ASIGNATURA", "M05");
        nuevoRegistro.put("HORA_INICIO","18:20:00");
        nuevoRegistro.put("HORA_FIN", "19:20:00");
        nuevoRegistro.put("DIA", "Miercoles");
        nuevoRegistro.put("PROF", "Jorge");
        db.insert("HORARIO", null, nuevoRegistro);

        nuevoRegistro.put("GRUPO", "A1");
        nuevoRegistro.put("ID_HORARIO", 20);
        nuevoRegistro.put("COD_ASIGNATURA", "M03");
        nuevoRegistro.put("HORA_INICIO","19:20:00");
        nuevoRegistro.put("HORA_FIN", "21:20:00");
        nuevoRegistro.put("DIA", "Miercoles");
        nuevoRegistro.put("PROF", "Josefa");
        db.insert("HORARIO", null, nuevoRegistro);

        nuevoRegistro.put("GRUPO", "A1");
        nuevoRegistro.put("ID_HORARIO", 22);
        nuevoRegistro.put("COD_ASIGNATURA", "M09");
        nuevoRegistro.put("HORA_INICIO","15:00:00");
        nuevoRegistro.put("HORA_FIN", "16:00:00");
        nuevoRegistro.put("DIA", "Jueves");
        nuevoRegistro.put("PROF", "Jorge");
        db.insert("HORARIO", null, nuevoRegistro);

        nuevoRegistro.put("GRUPO", "A1");
        nuevoRegistro.put("ID_HORARIO", 23);
        nuevoRegistro.put("COD_ASIGNATURA", "M08");
        nuevoRegistro.put("HORA_INICIO","16:00:00");
        nuevoRegistro.put("HORA_FIN", "18:00:00");
        nuevoRegistro.put("DIA", "Jueves");
        nuevoRegistro.put("PROF", "Lluis");
        db.insert("HORARIO", null, nuevoRegistro);

        nuevoRegistro.put("GRUPO", "A1");
        nuevoRegistro.put("ID_HORARIO", 24);
        nuevoRegistro.put("COD_ASIGNATURA", "M08");
        nuevoRegistro.put("HORA_INICIO","18:20:00");
        nuevoRegistro.put("HORA_FIN", "21:20:00");
        nuevoRegistro.put("DIA", "Jueves");
        nuevoRegistro.put("PROF", "Jorge");
        db.insert("HORARIO", null, nuevoRegistro);

        nuevoRegistro.put("GRUPO", "A1");
        nuevoRegistro.put("ID_HORARIO", 25);
        nuevoRegistro.put("COD_ASIGNATURA", "M10");
        nuevoRegistro.put("HORA_INICIO","15:00:00");
        nuevoRegistro.put("HORA_FIN", "17:00:00");
        nuevoRegistro.put("DIA", "Viernes");
        nuevoRegistro.put("PROF", "Marta");
        db.insert("HORARIO", null, nuevoRegistro);

        nuevoRegistro.put("GRUPO", "A1");
        nuevoRegistro.put("ID_HORARIO", 26);
        nuevoRegistro.put("COD_ASIGNATURA", "M08");
        nuevoRegistro.put("HORA_INICIO","17:00:00");
        nuevoRegistro.put("HORA_FIN", "19:20:00");
        nuevoRegistro.put("DIA", "Viernes");
        nuevoRegistro.put("PROF", "Lluis");
        db.insert("HORARIO", null, nuevoRegistro);
        
        nuevoRegistro.put("GRUPO", "A1");
        nuevoRegistro.put("ID_HORARIO", 27);
        nuevoRegistro.put("COD_ASIGNATURA", "M05");
        nuevoRegistro.put("HORA_INICIO","19:20:00");
        nuevoRegistro.put("HORA_FIN", "21:20:00");
        nuevoRegistro.put("DIA", "Viernes");
        nuevoRegistro.put("PROF", "Jorge");
        db.insert("HORARIO", null, nuevoRegistro);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAnterior,
                          int versionNueva) {

        db.execSQL("DROP TABLE IF EXISTS HORARIO");

        db.execSQL(sqlCreate);

    }
}



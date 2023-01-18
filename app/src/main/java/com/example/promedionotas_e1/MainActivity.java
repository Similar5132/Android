package com.example.promedionotas_e1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2, et3, et4;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"Creado por Similar", Toast.LENGTH_LONG ).show();

        et1 = (EditText) findViewById(R.id.txt_num1);
        et2 = (EditText) findViewById(R.id.txt_num2);
        et3 = (EditText) findViewById(R.id.txt_num3);
        et4 = (EditText) findViewById(R.id.txt_num4);
        tv1 = (TextView) findViewById(R.id.tv_Resultado);


    }

    // creando metodo para calcular promeedio aprovado o reporvado
    public void Calcular(View view) {
        String num1_String = et1.getText().toString();
        String num2_String = et2.getText().toString();
        String num3_String = et3.getText().toString();
        String num4_String = et4.getText().toString();

        // convertimos a eteros los String

        int num1_int = Integer.parseInt(num1_String);
        int num2_int = Integer.parseInt(num2_String);
        int num3_int = Integer.parseInt(num3_String);
        int num4_int = Integer.parseInt(num4_String);

        // Hacemos la operacion

        int resultado = (num1_int + num2_int + num3_int + num4_int) / 4;

        if (resultado >= 6) {
            tv1.setText("Aprovado - Promedio de: " + resultado);
        } else {

            tv1.setText("Reprovado - Promedio de: " + resultado);
        }
    }
}
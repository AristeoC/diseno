package com.example.a161100118;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularEcuacion(View view){

        double x1, x2;

        EditText CofA = (EditText)findViewById(R.id.CofA);
        EditText CofB = (EditText)findViewById(R.id.txtCofB);
        EditText CofC = (EditText)findViewById(R.id.txtCofC);
        TextView Resultado = (TextView) findViewById(R.id.lblResultado);

        double a = Double.parseDouble(CofA.getText().toString());
        double b = Double.parseDouble(CofB.getText().toString());
        double c = Double.parseDouble(CofC.getText().toString());

        double d = ((b*b)-4*a*c);

        if(d<0){
            Resultado.setText("No existen soluciones reales");
        }
        else{

            x1 = ( -b + Math.sqrt(d))/(2*a);

            double x2 = (-b - Math.sqrt(d)) / (2 * a);

            Resultado.setText("Solución X1: " +x1 + "\n Solución X2: "+x2);


        }
    }
}
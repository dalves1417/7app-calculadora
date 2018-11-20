package com.example.septimaapp;

import android.os.Bundle;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText numero1;
	EditText numero2;
	TextView salida;
	
	double n1=0;
	double n2=0;
	double resultado=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero1= (EditText) findViewById(R.id.input_1);
        numero2= (EditText) findViewById(R.id.input_2);
        salida = (TextView) findViewById(R.id.textView1);
    }
    public void sum (View View){
    	n1 = Double.valueOf(numero1.getText().toString());
    	n2 = Double.valueOf(numero2.getText().toString());
    	salida.setText(Double.toString(n1+n2));
    }


public void res (View View){
	n1 = Double.valueOf(numero1.getText().toString());
	n2 = Double.valueOf(numero2.getText().toString());
	salida.setText(Double.toString(n1-n2));
	}
public void mul (View View){
	n1 = Double.valueOf(numero1.getText().toString());
	n2 = Double.valueOf(numero2.getText().toString());
	salida.setText(Double.toString(n1*n2));
	}
public void div (View View){
	n1 = Double.valueOf(numero1.getText().toString());
	n2 = Double.valueOf(numero2.getText().toString());
	salida.setText(Double.toString(n1/n2));
	}


    
}

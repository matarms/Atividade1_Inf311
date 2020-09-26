package com.example.atividade1_inf311;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityItemA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
    }

    public void clickOperator(View view){
        TextView txt = (TextView) findViewById(R.id.textViewResultado);
        EditText edt1 = (EditText) findViewById(R.id.editTextNumber1);
        EditText edt2 = (EditText) findViewById(R.id.editTextNumber2);

        String tag = view.getTag().toString();
        Double n1 = Double.parseDouble(edt1.getText().toString());
        Double n2 = Double.parseDouble(edt2.getText().toString());

        double result = 0;

        switch(tag){
            case "+":
                result = n1+n2;
                break;
            case "-":
                result = n1-n2;
                break;
            case "*":
                result = n1*n2;
                break;
            case "/":
                result = n1/n2;
                break;
        }

        txt.setText("O resultado é: "+result);

    }
}
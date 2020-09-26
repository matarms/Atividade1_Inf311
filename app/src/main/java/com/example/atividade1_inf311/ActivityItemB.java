package com.example.atividade1_inf311;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.view.View;

public class ActivityItemB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_b);
    }

    public void insertChar(View view){
        EditText edt = (EditText) findViewById(R.id.editTextform);

        String tag = view.getTag().toString();

        //char[] helloArray = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '*', '-', '/', '.',
         //                       '0'};
        edt.setText(edt.getText().toString()+tag);
    }

    public void backText(View view){
        EditText edt = (EditText) findViewById(R.id.editTextform);

        String str = edt.getText().toString();
        if ((str != null) && (str.length() > 0)) {
            str = str.substring(0, str.length() - 1);
        }

        edt.setText(str);
    }

    public void eraseText(View view){
        EditText edt = (EditText) findViewById(R.id.editTextform);

        edt.setText("");
    }

    public void calcule(View view){
        EditText edt = (EditText) findViewById(R.id.editTextform);

        String str = edt.getText().toString();
        String[] numS = str.split("\\+|\\*|\\-|\\/");
        Double[] num = {Double.parseDouble(numS[0]), Double.parseDouble(numS[1])};

        //Acha o operador
        char op = ' ';
        char[] opr = {'+', '-', '*', '/'};
        for (char c : opr){
            if(str.indexOf(c) != -1){
                op = c;
            }
        }
        double result = 0;
        switch (op){
            case '+':
                result = num[0]+num[1];
                break;
            case '-':
                result = num[0]-num[1];
                break;
            case '*':
                result =num[0]*num[1];
                break;
            case '/':
                result = num[0]/num[1];
                break;
        }

        edt.setText(""+result);

    }
}
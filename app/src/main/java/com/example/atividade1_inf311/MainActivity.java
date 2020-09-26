package com.example.atividade1_inf311;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickAtA(View view){

        Intent it = new Intent(getBaseContext(),ActivityItemA.class);
        startActivity(it);
    }

    public void clickAtB(View view){

        Intent it = new Intent(getBaseContext(),ActivityItemB.class);
        startActivity(it);
    }
}
package com.example.lupecasa.prueba2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ingresar(View v){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}

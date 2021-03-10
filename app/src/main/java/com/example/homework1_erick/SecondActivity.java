package com.example.homework1_erick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        //Obtenemos mediante la primera activity el mensaje de nuestra variable clave-valor el cual es el id del mensaje adicional
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //se obtiene el id de ese textView
        TextView textView = findViewById(R.id.txtCount);

        //colocamos el mensaje que se ha recibido mediante la clave-valor de nuestra priemra Activity y lo colocamos en el TextView
        textView.setText(message);
    }
}
package com.example.homework1_erick;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //variable que guarda en contador
    private int mCount = 0;
    //TextView para tener el id de él
    private TextView mShowCount;

    //mensaje mediante clave-valor public para que sea usanda en la SecondActivity
    public static final String EXTRA_MESSAGE = "com.example.homework1.extra.MESSAGE";

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //se guarda el id de este TextView
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
//        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
//        toast.show();

        //obtenemos la cadena que tiene nuestra variable mShowCount
        String message = mShowCount.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        //ponemos el mensaje para enviarlo a la segunda actividad
        intent.putExtra(EXTRA_MESSAGE, message);

        //lanzamos el intent (segunda activity)
        startActivity(intent);
    }

    public void countUp(View view) {
        //se incrementa el contador
        mCount++;
        if (mShowCount != null) {
            //se inserta convertido a String
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}
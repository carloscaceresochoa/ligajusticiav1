package com.usb.appliga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        abrir();
    }

    public void mostrar(View view){
        /**
         * Objeto intent para abrir nueva Actividad
         */
        Intent intent=new Intent(getBaseContext(),HeroesActivity.class);
        startActivity(intent);
    }
    //splash Screen
    public void abrir(){
        new Handler().postDelayed(new Runnable() {

            public void run() {
                Intent intent=new Intent(getBaseContext(),HeroesActivity.class);
                startActivity(intent);

            }
        }, 5000);
    }
}
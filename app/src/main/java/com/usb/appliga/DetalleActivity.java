package com.usb.appliga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {
    private TextView heroeliga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        heroeliga=findViewById(R.id.heroeliga);
        Bundle bundle=getIntent().getBundleExtra("bundle");
        String heroe=bundle.getString("heroe");
        heroeliga.setText(heroe);
    }
}
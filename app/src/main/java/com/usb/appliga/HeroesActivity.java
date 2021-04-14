package com.usb.appliga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class HeroesActivity extends AppCompatActivity {
    private ListView listView;
    private List<String> heroes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes);
        listView=findViewById(R.id.listview);
        Liga liga=new Liga();
        heroes=liga.ligaJusticia();
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,
                                                              android.R.layout.simple_list_item_1,
                                                              heroes);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getBaseContext(),heroes.get(position),Toast.LENGTH_SHORT).show();
                Bundle bundle=new Bundle();
                bundle.putString("heroe",heroes.get(position));
                Intent intent=new Intent(getBaseContext(),DetalleActivity.class);
                intent.putExtra("bundle",bundle);
                startActivity(intent);
            }
        });


    }
}
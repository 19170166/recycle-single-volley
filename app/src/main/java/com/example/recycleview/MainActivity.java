package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycle);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        Button brn=findViewById(R.id.btn1);
        List<Persona> personaList=new ArrayList<>();
        personaList.add(new Persona(R.drawable.icono_usuario,"Hola Mundo"));
        personaList.add(new Persona(R.drawable.icono_usuario,"Hola Mundo"));
        personaList.add(new Persona(R.drawable.icono_usuario,"Hola Mundo"));
        personaList.add(new Persona(R.drawable.icono_usuario,"Hola Mundo"));
        personaList.add(new Persona(R.drawable.icono_usuario,"Hola Mundo"));
        personaList.add(new Persona(R.drawable.icono_usuario,"Hola Mundo"));

        Adaptador adapter=new Adaptador(personaList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
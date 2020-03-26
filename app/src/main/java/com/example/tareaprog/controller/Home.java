package com.example.tareaprog.controller;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.tareaprog.R;
import com.example.tareaprog.model.Usuario;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

   private ListView lista;

   private ArrayList<Usuario> database = new ArrayList<>();

   ArrayList<String> data1 =  new ArrayList<>();

   ArrayAdapter<String> adapter;

   MyAdapter adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        init();

        addUser();

        adapter2 = new MyAdapter(database,Home.this,R.layout.cell1);

      //  adapter = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,data1);

        lista.setAdapter(adapter2);





    }


    private void init() {

        lista = findViewById(R.id.homeListContact);


    }


    private void addUser(){

        database.add(new Usuario("Ivan","Escudero","6448-8542","ivanescud@gmail.com", R.drawable.pro1));
        database.add(new Usuario("Pablo","Lopes","64518-8542","pable@gmail.com", R.drawable.pro2));
        database.add(new Usuario("Sara","Dominguez","6573-8352","sara@gmail.com", R.drawable.pro3));


        data1.add("Ivan 2265884");
        data1.add("Pablo 2469465");
        data1.add("Sara 5558/7");


    }

}

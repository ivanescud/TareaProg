package com.example.tareaprog;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private EditText nombreUS;
    private EditText apellidoUS;
    private EditText emailUS;
    private EditText phoneUS;
    private Button agregarBut;
    private  String currentUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();




    }



    private void init() {


        nombreUS = findViewById(R.id.nombreET);
        apellidoUS = findViewById(R.id.apellidoET);
        agregarBut = findViewById(R.id.addBut);
        phoneUS = findViewById(R.id.telefonoET);
        emailUS = findViewById(R.id.emailET);


    }




}

package com.example.tareaprog;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private EditText usuarioET;
    private EditText contraET;
    private Button loginBut;
    private  String currentUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


        loginBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                currentUser = usuarioET.getText().toString().trim();
                if (!currentUser.isEmpty()) {
                    Intent intent = new Intent(MainActivity.this,Home.class);
                    intent.putExtra("user",currentUser);

                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this, "Porfavor ingrese el usuario", Toast.LENGTH_SHORT).show();

                }

            }
        });

    }



    private void init() {

        usuarioET = findViewById(R.id.usuarioET);
        contraET = findViewById(R.id.passwodET);
        loginBut = findViewById(R.id.loginBut);

    }




}

package com.example.tareaprog;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Home extends AppCompatActivity {

    private TextView userName;
    private String currentUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        init();

        currentUser = getIntent().getStringExtra("user");

        userName.setText(currentUser);


    }


    private void init() {

        userName = findViewById(R.id.userName);


    }
}

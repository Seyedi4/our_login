package com.example.ourlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText username, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (username.getText().toString().equals("admin") && password.getText().toString().equals("1234")) {

                    Intent in1=new Intent(LoginActivity.this,CalActivity.class);
                    in1.putExtra("user","admin");
                    startActivity(in1);


                } else if (username.getText().toString().equals("mahdi") && password.getText().toString().equals("1234")) {

                    Intent in1=new Intent(LoginActivity.this,CalActivity.class);
                    in1.putExtra("user","mahdi");
                    startActivity(in1);


                } else if (username.getText().toString().equals("mohammad") && password.getText().toString().equals("1234")) {

                    Intent in1=new Intent(LoginActivity.this,TextActivity.class);
                    startActivity(in1);

                } else {
                    Toast.makeText(LoginActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {
        // do nothing to disable the back button
    }
}
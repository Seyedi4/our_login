package com.example.ourlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class TextActivity extends AppCompatActivity {

    Button btnAdd;
    EditText input;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        btnAdd = findViewById(R.id.btnadd);
        input = findViewById(R.id.input);
        result = findViewById(R.id.result);

        ArrayList<String> list = new ArrayList<>();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!input.getText().toString().equals("")) {
                    list.add(input.getText().toString());

                    String temp = "";
                    for (int i = 0; i < list.size(); i++) {

                        temp += list.get(i) + "\n";

                    }
                    result.setText(temp + "");
                }else
                    Toast.makeText(TextActivity.this, "مقدار را وارد کنید", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
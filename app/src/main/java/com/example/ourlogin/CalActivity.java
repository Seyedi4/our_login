package com.example.ourlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.atomic.AtomicReference;

public class CalActivity extends AppCompatActivity {

    TextView result;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnSum, btnMines, btnDivide, btnMultiply, btnClear, btnEqual;

    String op;
    double res;
    double resoult1;
    double resoult2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);

        result = findViewById(R.id.result);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnSum = findViewById(R.id.btnSum);
        btnMines = findViewById(R.id.btnMines);
        btnDivide = findViewById(R.id.btnDivide);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnClear = findViewById(R.id.btnClear);
        btnEqual = findViewById(R.id.btnEqual);

         Intent get = getIntent();
        String get_info = get.getStringExtra("user");
        if (get_info.toString().equals("mahdi"))
        {
            btnMultiply.setEnabled(false);
            btnDivide.setEnabled(false);
        }


        btn1.setOnClickListener(view -> {

            result.setText( result.getText().toString()+"1");
        });
        btn2.setOnClickListener(view -> {
            result.setText( result.getText().toString()+"2");
        });
        btn3.setOnClickListener(view -> {
            result.setText( result.getText().toString()+"3");
        });
        btn4.setOnClickListener(view -> {
            result.setText( result.getText().toString()+"4");
        });
        btn5.setOnClickListener(view -> {
            result.setText( result.getText().toString()+"5");});
        btn6.setOnClickListener(view -> {
            result.setText( result.getText().toString()+"6");});
        btn7.setOnClickListener(view -> {
            result.setText( result.getText().toString()+"7");});
        btn8.setOnClickListener(view -> {
            result.setText( result.getText().toString()+"8");});
        btn9.setOnClickListener(view -> {
            result.setText( result.getText().toString()+"9");});
        btn0.setOnClickListener(view -> {
            result.setText( result.getText().toString()+"0");});

        btnSum.setOnClickListener(view -> {
            if (result.getText().toString().equals(""))
                Toast.makeText(CalActivity.this, "عدد را وارد کنید", Toast.LENGTH_SHORT).show();
            else {
                resoult1 =Double.parseDouble(result.getText().toString());

                result.setText("");
                
                op = "+";
            }
        });

        btnMines.setOnClickListener(view -> {
            if (result.getText().toString().equals(""))
                Toast.makeText(CalActivity.this, "عدد را وارد کنید", Toast.LENGTH_SHORT).show();
            else {
                resoult1 =Double.parseDouble(result.getText().toString());

                result.setText("");

                op = "-";
            }
        });


        btnMultiply.setOnClickListener(view -> {
            if (result.getText().toString().equals(""))
                Toast.makeText(CalActivity.this, "عدد را وارد کنید", Toast.LENGTH_SHORT).show();
            else {
                resoult1 =Double.parseDouble(result.getText().toString());

                result.setText("");

                op = "*";
            }
        });
        btnDivide.setOnClickListener(view -> {
            if (result.getText().toString().equals(""))
                Toast.makeText(CalActivity.this, "عدد را وارد کنید", Toast.LENGTH_SHORT).show();
            else {
                resoult1 =Double.parseDouble(result.getText().toString());

                result.setText("");

                op = "/";
            }
        });

        btnEqual.setOnClickListener(v -> {
            if (result.getText().toString().equals(""))
                Toast.makeText(CalActivity.this, "عدد را وارد کنید", Toast.LENGTH_SHORT).show();
            else {
                resoult2 = Double.parseDouble(result.getText().toString());
                switch (op) {
                    case "+":
                        res = resoult1 + resoult2;
                        result.setText(res + "");
                        break;
                    case "-":
                        res = resoult1 - resoult2;
                        result.setText(res + "");
                        break;
                    case "*":
                        res = resoult1 * resoult2;
                        result.setText(res + "");
                        break;
                    case "/":
                        if (resoult1==0 || resoult2==0)
                            Toast.makeText(CalActivity.this, "صفر تقسیم نمیشود", Toast.LENGTH_SHORT).show();
                        else {
                            res = resoult1 / resoult2;
                            result.setText(res + "");
                        }
                        break;
                }
            }

        });

        btnClear.setOnClickListener(view -> {

            result.setText("");
           
        });

    }
}
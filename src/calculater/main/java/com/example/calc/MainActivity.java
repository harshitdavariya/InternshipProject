 package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

    EditText n1 , n2 ;
    Button pl , min , mul , div ;
    int num1 , num2 , result;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.num1);
        n2 = findViewById(R.id.num2);

        ans = findViewById(R.id.ans);

        pl = findViewById(R.id.plus);
        min = findViewById(R.id.min);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);

        pl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(n1.getText().toString());
                num2 = Integer.parseInt(n2.getText().toString());
                result = num1 + num2 ;
                ans.setText("Addition: " + result);
            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(n1.getText().toString());
                num2 = Integer.parseInt(n2.getText().toString());
                result = num1 - num2 ;
                ans.setText("Substraction: " + result);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(n1.getText().toString());
                num2 = Integer.parseInt(n2.getText().toString());
                result = num1 * num2 ;
                ans.setText("Multiplication: " + result);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(n1.getText().toString());
                num2 = Integer.parseInt(n2.getText().toString());
                try {
                    result = num1 / num2 ;
                    ans.setText("Division: " + result);
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                    Toast.makeText(MainActivity.this, "Enter Valid Number...", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
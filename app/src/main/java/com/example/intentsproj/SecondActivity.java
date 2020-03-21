package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView answer, number1, number2;
    int n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent1 = getIntent();

        String num1 = intent1.getStringExtra("n1").toString();
        String num2 = intent1.getStringExtra("n2").toString();

        number1 = findViewById(R.id.text6);
        number2 = findViewById(R.id.text7);

        number1.setText(num1);
        number2.setText(num2);

        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);

        Button button1 = (Button) findViewById(R.id.btnAdd);
        Button button2 = (Button) findViewById(R.id.btnSubs);
        Button button3 = (Button) findViewById(R.id.btnMultiply);
        Button button4 = (Button) findViewById(R.id.btnDivide);

        answer = findViewById(R.id.ans);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(n1 + "+" + n2 + "= " + String.valueOf(n1 + n2));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(n1 + "-" + n2 + "= " +String.valueOf(n1 - n2));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(n1 + "*" + n2 + "= " +String.valueOf(n1 * n2));
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(n1 + "/" + n2 + "= " +String.valueOf(n1 / n2));
            }
        });
    }

}

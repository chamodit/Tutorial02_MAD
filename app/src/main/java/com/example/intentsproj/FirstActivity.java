package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    EditText num1, num2;
    CharSequence message = "Sending message...";
    Integer duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        num1 = findViewById(R.id.input1);
        num2 = findViewById(R.id.input2);

        Button button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), message, duration).show();

                LayoutInflater layoutInflater = getLayoutInflater();
                View layout = layoutInflater.inflate(R.layout.custome_toast, (ViewGroup) findViewById(R.id.toast_container));
                Toast toast1 = new Toast(getApplicationContext());
                toast1.setDuration(Toast.LENGTH_SHORT);
                toast1.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast1.setView(layout);
                toast1.show();

                String n1 = num1.getText().toString();
                String n2 = num2.getText().toString();

                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("n1", n1);
                intent.putExtra("n2", n2);
                startActivity(intent);

            }
        });


        }
    }


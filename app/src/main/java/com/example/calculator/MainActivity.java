package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstValue, secondValue;
    TextView Answer;
    Button Add, Subtract, Multiply, Divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstValue=findViewById(R.id.firstValue);
        secondValue=findViewById(R.id.secondValue);
        Answer=findViewById(R.id.Answer);
        Add=findViewById(R.id.Add);
        Subtract=findViewById(R.id.Subtract);
        Multiply=findViewById(R.id.Multiply);
        Divide=findViewById(R.id.Divide);

        Add.setOnClickListener(view -> {
            double first,second;
            double ans;
            first=Double.parseDouble(firstValue.getText().toString());
            second=Double.parseDouble(secondValue.getText().toString());

            ans=first+second;
            Answer.setText("Answer is ="+ans);
        });

        Subtract.setOnClickListener(view -> {
            double first,second;
            double ans;
            first=Double.parseDouble(firstValue.getText().toString());
            second=Double.parseDouble(secondValue.getText().toString());

            ans=first-second;
            Answer.setText("Answer is ="+ans);
        });

        Multiply.setOnClickListener(view -> {
            double first,second;
            double ans;
            first=Double.parseDouble(firstValue.getText().toString());
            second=Double.parseDouble(secondValue.getText().toString());

            ans=first*second;
            Answer.setText("Answer is ="+ans);
        });

        Divide.setOnClickListener(view -> {
            double first,second;
            double ans;
            first=Double.parseDouble(firstValue.getText().toString());
            second=Double.parseDouble(secondValue.getText().toString());
            if(second==0)
                Answer.setText("Division Not Possible!");
            else {
                ans = first / second;
                Answer.setText("Answer is ="+ans);
            }
        });
    }
}
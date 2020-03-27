package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {
    int n1;
    int n2;
    int ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Enum1 = findViewById(R.id.edtNum1);
        Enum2 = findViewById(R.id.edtNum2);

        btnAdd = findViewById(R.id.btnAdd);
        answer = findViewById(R.id.txtAnswer);

        Intent intent = getIntent();
        String num1 = intent.getStringExtra(name"n1");
        String num2 = intent.getStringExtra(name"n2");

        Enum1.setText(num1);
        Enum2.setText(num2);

        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);

        ans = n1+n2;
    }
        public void addNumbers(View view){
        answer.setText(String.valueOf(ans));
        }
}

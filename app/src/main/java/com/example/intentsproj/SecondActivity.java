package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
     TextView message;
     Button btnSend2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        message = findViewById(R.id.txtMessage);

        Intent intent = getIntent();

        String name = intent.getStringExtra(name"name");

        message.setText("Hello" +name);

        num1 = findViewById(R.id.idNum1);
        num2 = findViewById(R.id.idNum2);

        btnSend2 = findViewById(R.id.btnSend2);
        btnSend2.setOnClickListener(new View.onClickListener());

             @Override
                     public void onClick(View v){
                 Intent intent1 = new Intent(getMainExecutor Activitysecond);

                 intent1.putExtra(name"n1",num1.getText().toString());
            intent1.putExtra(name"n2",num2.getText().toString());

            startActivity(intent1);
        }
    }
}

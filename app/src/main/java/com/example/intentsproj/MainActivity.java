package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(taq:"Lifecycle", msq:"onCreate() invoked");

        textview2 = findViewById(R.id.txt2);
        textview2.setText(R.string.Msg2);
    }

    public void onResume() {
        super.onResume();

        Log.i(taq:"Lifecycle", msq:"onResume() invoked");
    }

    public void onPause() {
        super.onPause();

        Log.i(taq:"Lifecycle", msq:"onPause() invoked");
    }

    public void onStart() {
        super.onStart();

        Log.i(taq:"Lifecycle", msq:"onStart() invoked");
    }

    public void onRestart() {
        super.onRestart();

        Log.i(taq:"Lifecycle", msq:"onRestart() invoked");
    }

    public void onStop() {
        super.onStop();

        Log.i(taq:"Lifecycle", msq:"onStop() invoked");
    }

    public void onDestroy() {
        super.onDestroy();

        Log.i(taq:"Lifecycle", msq:"onDestroy() invoked");
    }
}

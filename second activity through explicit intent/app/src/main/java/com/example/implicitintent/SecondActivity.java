package com.example.implicitintent;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView t1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("teju second","onResume");
        t1 = (TextView)findViewById(R.id.textView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("teju second","onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("teju second","onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("teju second","onrestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("teju second","onpause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("teju second","onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("teju second","onDestroy");
    }


}

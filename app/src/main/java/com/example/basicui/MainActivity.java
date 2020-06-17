package com.example.basicui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.txtHi);
        Button button = (Button) findViewById((R.id.hiBtn));
    }

    public void btnClick(View view) {
        TextView textView = (TextView) findViewById(R.id.txtHi);
        textView.setVisibility(view.VISIBLE);
    }
}

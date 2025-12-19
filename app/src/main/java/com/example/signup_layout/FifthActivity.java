package com.demo.travelapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FifthActivity extends AppCompatActivity {
TextView txt_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifth_activity);
        txt_register = findViewById(R.id.txt_register);
         txt_register.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(FifthActivity.this, SixActivity.class);
                 startActivity(intent);
             }
         });
    }
}

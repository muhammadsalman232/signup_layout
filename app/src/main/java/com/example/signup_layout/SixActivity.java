package com.demo.travelapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class SixActivity extends AppCompatActivity {
    AppCompatButton next_page_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.six_activity);
        next_page_btn = findViewById(R.id.next_page_btn);
        next_page_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SixActivity.this, FifthActivity.class);
                startActivity(intent);
            }
        });

    }
}

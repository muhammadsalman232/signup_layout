package com.example.signup_layout;
import android.text.Html;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    CheckBox cb_term;
    AppCompatButton next_btn;
    TextView txt_verification;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.second_activity);
        next_btn = findViewById(R.id.next_btn);
        next_btn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class); // that is used to move one activity to second activity
            startActivity(intent);
        });

      //     String text = "Please enter the 6-digit code sent to your email  <font color = '#FF0000'> salmanrasheed232@gmail.com</font> for verification";
       //   txt_verification.setText(Html.fromHtml(text));
        // String text = "By checking the box you agree to our Terms and Conditions";

        //  SpannableString spannable = new SpannableString(text);

    }
}
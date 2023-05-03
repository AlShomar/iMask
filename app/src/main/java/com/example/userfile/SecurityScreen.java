package com.example.userfile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SecurityScreen extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security_screen);

        ImageView imageView = findViewById(R.id.arrow1);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecurityScreen.this, UserProfile.class);
                startActivity(intent);
            }
        });

        TextView textView = findViewById(R.id.passcode);
        textView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecurityScreen.this, HealthDetails.class);
                startActivity(intent);
            }
        });


    }

}
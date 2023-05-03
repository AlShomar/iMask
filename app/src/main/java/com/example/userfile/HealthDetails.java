package com.example.userfile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HealthDetails extends AppCompatActivity {

    private ImageView imageView;
    private ImageView imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_details);

        ImageView imageView = findViewById(R.id.arrow2);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HealthDetails.this, UserProfile.class);
                startActivity(intent);
            }
        });

        ImageView imageView1 = findViewById(R.id.nextpage);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HealthDetails.this, ConditionsAndDiseases.class);
                startActivity(intent);
            }
        });


    }
}
package com.example.userfile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class UserProfile extends AppCompatActivity {

    private ImageView imageView;
    private ImageView imageView1;
    private ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        ImageView imageView = findViewById(R.id.arrow);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserProfile.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView imageView1 = findViewById(R.id.image_9_ek4);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserProfile .this, SecurityScreen.class);
                startActivity(intent);
            }
        });

        ImageView imageView2 = findViewById(R.id.MangeArrow);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserProfile.this, ManageProfile.class);
                startActivity(intent);
            }
        });



    }



}

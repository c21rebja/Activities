package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private Button signout_button;
    private TextView name_holder;

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("===", "ProfileActivity resumed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("===", "ProfileActivity started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("===", "ProfileActivity stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("===", "ProfileActivity destroyed");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Log.d("===", "ProfileActivity created");

        Intent intent = getIntent();
        Bundle extras =  intent.getExtras();

        String username = extras.getString("username");
        Log.d("===", "Username: " + username);

        signout_button = findViewById(R.id.signout_button);
        signout_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("===", "Signout button has been clicked");
                finish();
            }
        });

        name_holder = findViewById(R.id.name_textview);
        name_holder.setText("Welcome " + username);
    }
}
package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button signin_button;
    private EditText username;
    private String username_text;

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("===", "MainActivity resumed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("===", "MainActivity started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("===", "MainActivity stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("===", "MainActivity destroyed");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("===", "MainActivity created");

        username = findViewById(R.id.signin_input);
        username_text = username.getText().toString();

        signin_button = findViewById(R.id.signin_button);
        signin_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("===", "Button has been pressed!!");
                Log.d("===", "Username is: " + username.getText().toString());
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}
package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ButtonActivity2 extends AppCompatActivity {

    public Button closeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2);

        closeButton = findViewById(R.id.closeButton);
        TextView text=findViewById(R.id.robin);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");
            int number = extras.getInt("number");
            // Do something with the name and number

            text.setText(name);
        }

        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                Intent intent = new Intent(ButtonActivity2.this, MainActivity.class);
                Log.d("Main screen", "stänger aktivitet");
                startActivity(intent);
                finish();

                //  int number = extras.getInt("number");

                // Do something with the name and number

        }
        });
        }
    }
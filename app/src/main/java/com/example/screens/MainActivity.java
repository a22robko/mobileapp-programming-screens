package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Log.d("==>","We clicked on Tomten!");
                setContentView(R.layout.activity_button2);

                Intent intent = new Intent(MainActivity.this, ButtonActivity2.class);
                intent.putExtra("name", "Hello world"); // Optional
                //intent.putExtra("number", 1); // Optional
                startActivity(intent);

            }


        });
    }
}

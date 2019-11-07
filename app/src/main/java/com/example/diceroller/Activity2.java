package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    Button Cancel;
    Button Save;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Cancel = (Button) findViewById(R.id.Cancel);

        Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Activity2.this,MainActivity.class);
                startActivity(in);
            }
        });


        Save = (Button) findViewById(R.id.Save);

        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Activity2.this,MainActivity.class);
                startActivity(in);
            }
        });



        }

}
package com.e.topic_7android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewActivity extends AppCompatActivity {
        Button btnAddWord, btnShowDictionary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        btnAddWord=findViewById(R.id.btnAddWord);
        btnShowDictionary=findViewById(R.id.btnShowDictionary);


        btnAddWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(NewActivity.this,AddActivity.class);
                startActivity(intent);
            }
        });


        btnShowDictionary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(NewActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

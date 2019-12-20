package com.e.topic_7android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class AddActivity extends AppCompatActivity {
    EditText etWord, etDefination;
    Button btnAddWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        etWord=findViewById(R.id.etWord);
        etDefination=findViewById(R.id.etMeaning);
        btnAddWord=findViewById(R.id.btnAddWod);


        btnAddWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Save();
            }


        });

    }

    private void Save() {
        try{
            PrintStream printStream= new PrintStream(openFileOutput("words.txt",MODE_PRIVATE |MODE_APPEND));
            printStream.println(etWord.getText().toString()+"->"+etDefination.getText().toString());
            Toast.makeText(this, "saved to"+getFilesDir(), Toast.LENGTH_SHORT).show();
        } catch (FileNotFoundException e) {
            Log.d("Dictionary app", "error"+e.toString());
            e.printStackTrace();
        }
    }
}

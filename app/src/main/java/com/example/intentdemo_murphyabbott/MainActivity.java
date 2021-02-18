package com.example.intentdemo_murphyabbott;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Intent i;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);

        button = findViewById(R.id.button);
        i = new Intent(this, SecondActivity.class);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
               Toast.makeText(getApplicationContext(),"I DID IT!",Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                i.putExtra("testString", s);

                startActivity(i);

            }
        });
    }
}
package com.example.intentdemo_murphyabbott;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

   public static final int REQUEST_CODE = 1;

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

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "I DID IT!", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                i.putExtra("testString", s);

                startActivity(i);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_CODE && resultCode == Activity.RESULT_OK)
        {
            Bundle extras = data.getExtras();
            if(extras != null)
            {
                ConstraintLayout currentLayout = findViewById(R.id.main_layout);
            }
        }
    }

}
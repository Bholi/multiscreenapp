package com.bholi.multiscreen2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
   public static final String Extra_name = "multiscreen";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bholi(View v){
       Intent intent = new Intent(this,MainActivity2.class);
       name = findViewById(R.id.name);
       String nametext = name.getText().toString();
       intent.putExtra(Extra_name , nametext);
       startActivity(intent);
    }
}
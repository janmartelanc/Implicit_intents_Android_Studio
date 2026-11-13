package com.example.implicit_intents_android_studio;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public EditText text_field_1=findViewById(R.id.editTextText);
    public EditText text_field_2=findViewById(R.id.editTextText2);
    public EditText text_field_3=findViewById(R.id.editTextText3);
    public EditText text_field_4=findViewById(R.id.editTextText4);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void browser(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(String.valueOf(text_field_1)));
        startActivity(i);
    }
    public void location(View view){
        Uri.parse("geo:0,0?q=brooklyn%20bridge%2C%20brooklyn%2C%20ny");

    }
    public void share(View view){

    }
    public void telefon(View view){

    }

}
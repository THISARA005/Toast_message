package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    Button button2;
    TextView txtView;
    EditText viewAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        button2=findViewById(R.id.btn2);
        txtView=findViewById(R.id.textView2);
        viewAge=findViewById(R.id.viewAge);

        Intent intent=getIntent();
        String name=intent.getStringExtra("USER NAME");
        int age =intent.getIntExtra("USER AGE",0);

        txtView.setText(name);
        viewAge.setText(String.valueOf(age));

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

            }
        });
    }
}
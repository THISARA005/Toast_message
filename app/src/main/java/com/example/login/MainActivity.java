package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button button1;
    EditText txtAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=findViewById(R.id.btn1);
        txtAge=findViewById(R.id.txtAge);
        /* String name="Thisara Dilshan";
        Editable age= txtAge.getText();

        Intent intent=new Intent(this,Activity2.class);
        intent.putExtra("USER NAME",name);
        intent.putExtra("USER AGE",age);*/

        Intent intent=new Intent(Intent.ACTION_SEND);
        final Intent chooser;
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"someone@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT,"hello");
        intent.putExtra(Intent.EXTRA_TEXT,"hii");
        intent.setType("message/rfc822");
        chooser=intent.createChooser(intent,"Select the app ");


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(chooser);
            }
        });
    }
}
package com.example.hp.assingmentdialogbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
String email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b=(Button)findViewById(R.id.signup);
        final EditText mail=(EditText)findViewById(R.id.mail);
        final EditText pass=(EditText)findViewById(R.id.pass);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email=mail.getText().toString();
                password=pass.getText().toString();
                Intent intent=new Intent(getApplicationContext(),Login.class);
                intent.putExtra("Email",email);
                intent.putExtra("pass",password);
                startActivity(intent);
            }
        });
    }
}

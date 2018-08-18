package com.example.hp.assingmentdialogbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
EditText e1,e2;
String password,email,pass,mail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        e1=(EditText)findViewById(R.id.password);
         e2=(EditText)findViewById(R.id.emailid);
        Button b1=(Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               password = e1.getText().toString();
               email = e2.getText().toString();
               Bundle b=getIntent().getExtras();
               pass=b.getString("pass");
               mail=b.getString("Email");
               //password="hjk";
               //pass="hjk";
                //Toast.makeText(getApplicationContext(),pass +"bundle",Toast.LENGTH_LONG).show();
               // Toast.makeText(getApplicationContext(),password +"",Toast.LENGTH_LONG).show();
                if (pass.equals(password) && mail.equals(email)) {
                   Toast toast= Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                } else {
                    Toast.makeText(getApplicationContext(),"Wrong Email or Password!!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

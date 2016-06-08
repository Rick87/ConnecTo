package com.kraemerapps.connecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);     // Diese Zeile legt fest, welches XML-File dieses Java-File nutzt.

        // ..........................etAge is the name of the Text Field! (look it up in the XML-File)
        final EditText etAge      = (EditText) findViewById(R.id.etAge); // EditText-Objekt stores EditText-Objekt of Age inside the XML-File.
        final EditText etName     = (EditText) findViewById(R.id.etName);
        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button   bRegister  = (Button)   findViewById(R.id.bRegister);
    }
}

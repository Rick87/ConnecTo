package com.kraemerapps.connecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);    // Diese Zeile legt fest, welches XML-File dieses Java-File nutzt.

        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button   bLogin     = (Button)   findViewById(R.id.bLogin);
        final TextView registerLink = (TextView) findViewById(R.id.tvRegisterHere); // Ctrl+Shift+Enter = Semicolon at end

        registerLink.setOnClickListener(new View.OnClickListener() { // wartet auf Clicks auf den Button. Wenn geklickt, ...
            @Override
            public void onClick(View v) { // ... alle Instruktionen hier drin werden ausgeführt!

                // ................................ApplicationContext
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class); // Explicit Intent
                // ....................................................NewActivity (= class name)
                // LoginActivity.this.startActivity(registerIntent);
                startActivity(registerIntent);                      // current activity should start new Activity: registerIntent

            }
        });

    }
}

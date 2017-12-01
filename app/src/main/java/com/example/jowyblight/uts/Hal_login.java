package com.example.jowyblight.uts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Hal_login extends AppCompatActivity {

    Button login;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_login);

        username = (EditText) findViewById(R.id.edituser);
        password = (EditText) findViewById(R.id.editpass);
        login = (Button) findViewById(R.id.btnlogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user_name = username.getText().toString();
                String pass_ =  password.getText().toString();
                if (user_name.equals("udung")&&pass_.equals("12345")){

                    Intent login1 = new Intent(Hal_login.this, Hal_Menu_Utama.class);
                    startActivity(login1);
                }
                else {
                    Toast.makeText(getApplicationContext(),"Username dan Password tidak sesuai " + "Anda gagal Login",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}

package com.example.jowyblight.uts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hal_Menu_Utama extends AppCompatActivity {

    Button list, about, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal__menu__utama);

        list = (Button) findViewById(R.id.btnlist);
        about = (Button) findViewById(R.id.btnabout);
        exit = (Button) findViewById(R.id.btnexit);

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent list1 = new Intent(Hal_Menu_Utama.this, Hal_List.class);
                startActivity(list1);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about1 = new Intent(Hal_Menu_Utama.this, Hal_About.class);
                startActivity(about1);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }
}

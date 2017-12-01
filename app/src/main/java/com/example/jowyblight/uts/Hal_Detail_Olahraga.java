package com.example.jowyblight.uts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Hal_Detail_Olahraga extends AppCompatActivity implements View.OnClickListener {

    ImageButton plus1, min1;
    TextView teks1;
    Button lakukan;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal__detail__olahraga);

        final TextView teks2 = (TextView) findViewById(R.id.textolahraga);
        Intent intent = getIntent();
        teks2.setText(intent.getStringExtra("message"));

        teks1 = (TextView) findViewById(R.id.jam);
        plus1 = (ImageButton) findViewById(R.id.tambah);
        min1 = (ImageButton) findViewById(R.id.kurang);
        lakukan = (Button) findViewById(R.id.btnolahraga);
        counter = 0;

        plus1.setOnClickListener(this);
        min1.setOnClickListener(this);

        lakukan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Anda akan melakukan Olahraga " + teks2.getText() + " dengan waktu " + teks1.getText() + " jam", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        if (v == plus1) {
            counter++;
            teks1.setText(Integer.toString(counter));
        }
        if (v == min1) {
            counter--;
            teks1.setText(Integer.toString(counter));
        }
    }
}
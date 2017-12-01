package com.example.jowyblight.uts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Hal_List extends Activity implements OnItemClickListener {

    private String[] olahraga={"Lari", "Basket", "Bulu Tangkis","Futsal", "Tennis"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal__list);
        ListView listView = (ListView) findViewById(R.id.list_olahraga);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, olahraga);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String message=" "+((TextView)view).getText();
        Intent intent=new Intent(getApplicationContext(),Hal_Detail_Olahraga.class);
        intent.putExtra("message", message);
        startActivity(intent);
    }
}

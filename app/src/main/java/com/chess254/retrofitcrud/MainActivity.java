package com.chess254.retrofitcrud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getFruits(View view) {

        Intent intent = new Intent(this, ListActivity.class);
        intent.putExtra("type", "fruits");
        startActivity(intent);

    }


    public void getVeges(View view) {

        Intent intent = new Intent(this, ListActivity.class);
        intent.putExtra("type", "veges");
        startActivity(intent);

    }
}

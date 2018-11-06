package com.example.rayadi001.tp06;

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

    public void bAjout(View view){
        startActivity(new Intent(this,MAjout.class));
    }

    public void bRecherche(View view){
        startActivity(new Intent(this,Mrecherche.class));
    }
}

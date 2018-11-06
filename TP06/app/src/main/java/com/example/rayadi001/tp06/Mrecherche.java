package com.example.rayadi001.tp06;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Mrecherche extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mrecherche);
    }
    public void rechercheISBN(View view){
        startActivity(new Intent(this,RISBN.class));
    }

    public void rechercheTitre(View view){
        startActivity(new Intent(this,RTitre.class));
    }
}

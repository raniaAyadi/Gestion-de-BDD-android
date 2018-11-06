package com.example.rayadi001.tp06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;

public class MAjout extends AppCompatActivity {
    BDLivres bdLivres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.majout);
        bdLivres = new BDLivres(this);
    }
    public void valider(View view){
        EditText eisbn = (EditText) findViewById(R.id.isbn);
        EditText etitre = (EditText) findViewById(R.id.titre);
        bdLivres.open();
        Livre livre = new Livre(eisbn.getText().toString(),etitre.getText().toString());
        bdLivres.insertLivre(livre);
        bdLivres.close();
        eisbn.setText("");
        etitre.setText("");
    }
}

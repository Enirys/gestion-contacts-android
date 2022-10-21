package com.enirys.gestioncontacts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Accueil extends AppCompatActivity {

    private TextView tv_username;
    private Button btn_ajout, btn_affichage, btn_edition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        tv_username = findViewById(R.id.tvuser_accueil);
        btn_ajout = findViewById(R.id.btn_ajout_accueil);
        btn_affichage = findViewById(R.id.btn_affichage_accueil);
        btn_edition = findViewById(R.id.btn_edition_accueil);

        Intent x = this.getIntent();
        Bundle b = x.getExtras();
        String user = b.getString("USER");
        tv_username.setText("Accueil de " + user);

        btn_ajout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Accueil.this, Ajout.class);
                startActivity(intent);
            }
        });

        btn_affichage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Accueil.this, Affichage.class);
                startActivity(intent);
            }
        });

        btn_edition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Accueil.this, Edition.class);
                startActivity(intent);
            }
        });
    }
}
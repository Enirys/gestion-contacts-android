package com.enirys.gestioncontacts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    EditText ednom, edmdp;
    private View btn_val, btn_quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edmdp = findViewById(R.id.edmdp_auth);
        ednom = findViewById(R.id.ednom_auth);
        btn_val = findViewById(R.id.btn_val_auth);
        btn_quit = findViewById(R.id.btn_quit_auth);

        btn_val.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nom = ednom.getText().toString();
                String mdp = edmdp.getText().toString();

                if(nom.equalsIgnoreCase("test") && mdp.equals("000")) {
                    Intent intent = new Intent(getApplicationContext(), Accueil.class);
                    startActivity(intent);
                    intent.putExtra("USER", nom);
                }else{
                    Toast.makeText(getApplicationContext(), "Valeurs non valides", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
package com.enirys.gestioncontacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Affichage extends AppCompatActivity {

    ListView lv_contacts;
    ArrayList<Contact> contacts = new ArrayList<Contact>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affichage);

        lv_contacts = findViewById(R.id.lv_contacts_affichage);

        contacts.add(new Contact(1,"Khelifi","Syrine", 22366897L));
        contacts.add(new Contact(2,"TestIssat","Enirys", 22352397L));
        contacts.add(new Contact(3,"AZERTT","Sy", 58356897L));
        contacts.add(new Contact(4,"Kh","Sysy", 50356897L));

        ArrayAdapter adapter = new ArrayAdapter(Affichage.this, android.R.layout.simple_list_item_1, contacts);
        lv_contacts.setAdapter(adapter);
    }
}
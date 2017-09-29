package com.ibm.watson_conversation;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Registrar extends AppCompatActivity {

    private Button reg;
    private ExpandableListView expandableListView;
    private List<String>parentHeaderInformation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
       /* Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/
       //getSupportActionBar().hide();
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

        reg = (Button) findViewById(R.id.button7);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inti = new Intent(getBaseContext(), Reconocimiento_facial.class);
                startActivity(inti);
            }
        });

        /*Datos de la lista, tipos de cuarto*/
        parentHeaderInformation = new ArrayList<String>();
        parentHeaderInformation.add("Room Type");

        HashMap<String, List<String>> allChildItems = returnGroupedChildItems();
        expandableListView = (ExpandableListView)findViewById(R.id.list1);
        ExpandableListViewAdapter expandableListViewAdapter = new ExpandableListViewAdapter(getApplicationContext(), parentHeaderInformation, allChildItems);
        expandableListView.setAdapter(expandableListViewAdapter);

/*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
*/
    }

    private HashMap<String, List<String>> returnGroupedChildItems(){

        HashMap<String, List<String>> childContent = new HashMap<String, List<String>>();
        List<String> cuartos = new ArrayList<String>();
        cuartos.add("Individual");
        cuartos.add("Doble");
        cuartos.add("Familiar");

        /*pago.add("Two Storey");
        List<String> footballClubs = new ArrayList<String>();
        footballClubs.add("Liverpool");
        footballClubs.add("Arsenal");
        footballClubs.add("Stoke City");
        footballClubs.add("West Ham");
        ;*/
        childContent.put(parentHeaderInformation.get(0), cuartos);

        //childContent.put(parentHeaderInformation.get(2), cuartos);


        return childContent;
    }

    @Override

    public boolean onCreateOptionsMenu(Menu menu) {

// Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;

    }

    @Override

    public boolean onOptionsItemSelected(MenuItem item) {

// Handle action bar item clicks here. The action bar will
// automatically handle clicks on the Home/Up button, so long
// as you specify a parent activity in AndroidManifest.xml.

        int id = item.getItemId();

//noinspection SimplifiableIfStatement

        /*if (id == R.id.action_settings) {

            return true;
        }*/
        return super.onOptionsItemSelected(item);
    }

}

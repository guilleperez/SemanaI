package com.ibm.watson_conversation;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

import static com.ibm.watson_conversation.R.id.parent;

public class Main extends AppCompatActivity {

    private Button watson, res, key;
    private DrawerLayout drawerLayout;
    private RelativeLayout mainLayout;
    private ListView menuLateral;
    //private Object Menu;

    //String[] bankNames={"BOI","SBI","HDFC","PNB","OBC"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* ActionBar bar = getSupportActionBar();
        bar.setHomeButtonEnabled(true);
        bar.setDisplayHomeAsUpEnabled(true);*/

        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mainLayout = (RelativeLayout) findViewById(R.id.main_layout);
        menuLateral = (ListView) findViewById(R.id.menuLateral);

        String[] opciones = {"Walter Bazar",  "Edit profile", "Rewards", "Tus viajes"};
        ArrayAdapter<String> adp = new ArrayAdapter<String>(Main.this, android.R.layout.simple_list_item_1, opciones);
        menuLateral.setAdapter(adp);

        menuLateral.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String opcSelec = (String) menuLateral.getAdapter().getItem(position);
                Toast.makeText(Main.this, opcSelec, Toast.LENGTH_SHORT).show();
            }

        });

       /* @Override
        public boolean onCreateOptionsMenu(Menu menu){
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item){
            int id = item.getItemId();

            if(id==android.R.id.home){
                if(drawerLayout.isDrawerOpen(menuLateral)){
                    drawerLayout.closeDrawer(menuLateral);
                } else {
                    drawerLayout.openDrawer();
                }
            }

        }
        //Getting the instance of Spinner and applying OnItemSelectedListener on it
       /* Spinner spin = (Spinner) findViewById(R.id.simpleSpinner);
        spin.setOnItemSelectedListener(this);

//Creating the ArrayAdapter instance having the bank name list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item, bankNames);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);*/

        watson = (Button) findViewById(R.id.button);
        res = (Button) findViewById(R.id.button2);
        key = (Button) findViewById(R.id.button3);
        watson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inti = new Intent(getBaseContext(), MainActivity.class);
                startActivity(inti);
            }
        });

        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inti = new Intent(getBaseContext(), Reservation.class);
                startActivity(inti);
            }
        });

        key.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inti = new Intent(getBaseContext(), Reconocimiento_facial.class);
                startActivity(inti);
            }
        });
    }


//lala

    /*//Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), bankNames[position], Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
    }*/

}

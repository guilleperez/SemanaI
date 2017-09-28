package com.ibm.watson_conversation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {

    private Button watson, registrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        //watson = (Button) findViewById(R.id.button);
        registrar = (Button) findViewById(R.id.button2);
       /* watson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inti = new Intent(getBaseContext(), MainActivity.class);
                startActivity(inti);
            }
        });*/

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inti = new Intent(getBaseContext(), Registrar.class);
                startActivity(inti);
            }
        });
    }
}

package com.ibm.watson_conversation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResNumber extends AppCompatActivity {

    private Button resNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_number);
        getSupportActionBar().hide();

        resNumber = (Button) findViewById(R.id.button6);
        resNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inti = new Intent(getBaseContext(), Reconocimiento_facial.class);
                startActivity(inti);
            }
        });
    }
}

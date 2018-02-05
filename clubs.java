package com.pajhama.svnitnme.svnitandme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class clubs extends AppCompatActivity implements View.OnClickListener{

    private Button BACKFC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs);

        BACKFC=(Button)findViewById(R.id.BACKFC);
        BACKFC.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v==BACKFC){
            Intent intent=new Intent(clubs.this,knowyoursvnit.class);
            startActivity(intent);
        }
    }
}

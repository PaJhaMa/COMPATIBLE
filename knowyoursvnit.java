package com.pajhama.svnitnme.svnitandme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class knowyoursvnit extends AppCompatActivity {

private ImageButton hstldtl;
private  ImageButton clbdtl;
private Button BACKKYS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knowyoursvnit);


        BACKKYS=(Button)findViewById(R.id.BACKKYS);
        BACKKYS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity=new Intent(knowyoursvnit.this, WELCOME.class);
                startActivity(intentLoadNewActivity);
            } });


        hstldtl=(ImageButton) findViewById(R.id.hstldtl);
        hstldtl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity=new Intent(knowyoursvnit.this, hostels.class);
                startActivity(intentLoadNewActivity);
            } });



        clbdtl=(ImageButton) findViewById(R.id.clbdtl);
        clbdtl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity=new Intent(knowyoursvnit.this, clubs.class);
                startActivity(intentLoadNewActivity);
            } });
    }
}

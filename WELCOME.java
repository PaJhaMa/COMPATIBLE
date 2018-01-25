package com.pajhama.svnitnme.svnitandme;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class WELCOME extends AppCompatActivity {

    private Button HMCLOGIN;
    private ImageView kursv;
    private ImageView gjcmpl;
    private ImageView mtbcmpl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        HMCLOGIN=(Button)findViewById(R.id.HMCLOGIN);
        HMCLOGIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity=new Intent(WELCOME.this, HMCLogin.class);
                startActivity(intentLoadNewActivity);
            } });




        gjcmpl=(ImageView) findViewById(R.id.gjcmpl);
        gjcmpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity=new Intent(WELCOME.this, GJ_SEC.class);
                startActivity(intentLoadNewActivity);
            } });




        kursv=(ImageView)findViewById(R.id.kursv);
        kursv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity=new Intent(WELCOME.this, knowyoursvnit.class);
                startActivity(intentLoadNewActivity);
            } });




        mtbcmpl=(ImageView)findViewById(R.id.mtbcmpl);
        mtbcmpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity=new Intent(WELCOME.this, mtb_sec.class);
                startActivity(intentLoadNewActivity);
            } });

    }


    }









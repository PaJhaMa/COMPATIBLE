package com.pajhama.svnitnme.svnitandme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class mtb_sec extends AppCompatActivity {

    private ImageButton HS;
    private ImageButton JHS;
    private ImageButton MESS;
    private ImageButton SPORTS;
    private ImageButton CULTURAL;
    private ImageButton ENVIRONMENT;
    private ImageButton WELFARE;
    private ImageButton TECHNICAL;
    private ImageButton MAGAZINE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtb_sec);

        HS=(ImageButton)findViewById(R.id.HS);
        HS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity=new Intent(mtb_sec.this, file_complain.class);
                startActivity(intentLoadNewActivity);
            } });

        JHS=(ImageButton)findViewById(R.id.JHS);
        JHS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity=new Intent(mtb_sec.this, file_complain.class);
                startActivity(intentLoadNewActivity);
            } });

        MESS=(ImageButton)findViewById(R.id.MESS);
        MESS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity=new Intent(mtb_sec.this, file_complain.class);
                startActivity(intentLoadNewActivity);
            } });

        CULTURAL=(ImageButton)findViewById(R.id.CULTURAL);
        CULTURAL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity=new Intent(mtb_sec.this, file_complain.class);
                startActivity(intentLoadNewActivity);
            } });

        ENVIRONMENT=(ImageButton)findViewById(R.id.ENVIRONMENT);
        ENVIRONMENT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity=new Intent(mtb_sec.this, file_complain.class);
                startActivity(intentLoadNewActivity);
            } });

        WELFARE=(ImageButton)findViewById(R.id.WELFARE);
        WELFARE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity=new Intent(mtb_sec.this, file_complain.class);
                startActivity(intentLoadNewActivity);
            } });

        TECHNICAL=(ImageButton)findViewById(R.id.TECHNICAL);
        TECHNICAL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity=new Intent(mtb_sec.this, file_complain.class);
                startActivity(intentLoadNewActivity);
            } });

        MAGAZINE=(ImageButton)findViewById(R.id.MAGAZINE);
        MAGAZINE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity=new Intent(mtb_sec.this, file_complain.class);
                startActivity(intentLoadNewActivity);
            } });

        SPORTS=(ImageButton)findViewById(R.id.SPORTS);
        SPORTS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity=new Intent(mtb_sec.this, file_complain.class);
                startActivity(intentLoadNewActivity);
            } });
    }
}

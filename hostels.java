package com.pajhama.svnitnme.svnitandme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class hostels extends AppCompatActivity {
    private Button BACKHSTL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hostels);

        BACKHSTL=(Button)findViewById(R.id.BACKHSTL);
        BACKHSTL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity=new Intent(hostels.this, knowyoursvnit.class);
                startActivity(intentLoadNewActivity);
            } });

    }

}

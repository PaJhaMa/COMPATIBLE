package com.pajhama.svnitnme.svnitandme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HMCLogin extends AppCompatActivity implements View.OnClickListener {

    private Button SIGNIN;
    private EditText usnme;
    private EditText pass;
    private Button BACKHMC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hmclogin);

        BACKHMC=(Button)findViewById(R.id.BACKHMC);
        BACKHMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity=new Intent(HMCLogin.this, WELCOME.class);
                startActivity(intentLoadNewActivity);
            } });


        SIGNIN=(Button)findViewById(R.id.SIGNIN);
        usnme=(EditText)findViewById(R.id.usnme);
        pass=(EditText)findViewById(R.id.pass);


        SIGNIN.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v==SIGNIN){
            String USNM=usnme.getText().toString();
            String Pass=pass.getText().toString();
            if(USNM.equals("vsraj") && Pass.equals("1234")){
                Intent intentLoadNewActivity=new Intent(HMCLogin.this, VIEW_COMPLAIN.class);
                startActivity(intentLoadNewActivity);

            }
            else if(USNM.equals("manali") && Pass.equals("5678")){
                Intent intentLoadNewActivity=new Intent(HMCLogin.this, VIEW_COMPLAIN.class);
                startActivity(intentLoadNewActivity);
            }
            else{
                Toast.makeText(this,"INVALID USERNAME OR PASSWORD",Toast.LENGTH_LONG).show();
            }
        }
        else{


        }


    }
}

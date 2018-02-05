package com.pajhama.svnitnme.svnitandme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.UserInfo;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class file_complain extends AppCompatActivity implements View.OnClickListener{

    private Button SUBMIT;
    private DatabaseReference databaseReference;
    private FirebaseDatabase firebaseDatabase;
    private EditText urnme;
    private EditText urrm;
    private EditText DESCRIP;
    private TextView NMEHSTL;
    private TextView FIELDCMPL;
    private TextView CMPLNO;
    private Button BACKFC;
    private TextView HSTLWLCM;
    private Button RESET;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_complain);



        NMEHSTL = (TextView) findViewById(R.id.NMEHSTL);
        NMEHSTL.setText(getIntent().getStringExtra("hstl"));


        FIELDCMPL = (TextView) findViewById(R.id.FIELDCMPL);
        FIELDCMPL.setText(getIntent().getStringExtra("sec"));


        HSTLWLCM = (TextView) findViewById(R.id.HSTLWLCM);
        HSTLWLCM.setText(getIntent().getStringExtra("hmc"));






        try{
            firebaseDatabase = FirebaseDatabase.getInstance();
            databaseReference= firebaseDatabase.getReference("USER COMPLAINS");
        }catch (Exception e){
            Toast.makeText(this,"Firebase Token not generated",Toast.LENGTH_SHORT);
        }
        urnme = (EditText) findViewById(R.id.urnme);
        urrm = (EditText) findViewById(R.id.urrm);
        CMPLNO=(TextView)findViewById(R.id.CMPLNO);
        DESCRIP = (EditText) findViewById(R.id.DESCRIP);
        RESET=(Button)findViewById(R.id.RESET);
        RESET.setOnClickListener(this);
        
        SUBMIT = (Button) findViewById(R.id.SUBMIT);
        SUBMIT.setOnClickListener(this);



        BACKFC=(Button)findViewById(R.id.BACKFC);
        BACKFC.setOnClickListener(this);




    }



    @Override
    public void onClick(View v) {

        String name=urnme.getText().toString().trim();
        String roomno=urrm.getText().toString().trim();
        String descrip=DESCRIP.getText().toString().trim();


        if (v==SUBMIT){
            if(name.isEmpty()){
                Toast.makeText(this, "NAME REQUIRED!!", Toast.LENGTH_SHORT).show();
            }else if(roomno.isEmpty()){
                Toast.makeText(this, "ROOM NUMBER REQUIRED!!", Toast.LENGTH_SHORT).show();
            }else if(descrip.isEmpty()){
                Toast.makeText(this, "DESCRIPTION REQUIRED!!", Toast.LENGTH_SHORT).show();
            }else {
                saveUserComplain();
            }
        } else if (v==BACKFC){
            Intent intent=new Intent(file_complain.this,WELCOME.class);
            startActivity(intent);
        }else if(v==RESET){
            urnme.setText("");
            urrm.setText("");
            DESCRIP.setText("");
            CMPLNO.setText("");
        }
    }


    private void saveUserComplain(){
        String name=urnme.getText().toString().trim();
        String roomno=urrm.getText().toString().trim();
        String descrip=DESCRIP.getText().toString().trim();
        String hstlnme=NMEHSTL.getText().toString().trim();
        String cmplfield=FIELDCMPL.getText().toString().trim();
        


        String ID= databaseReference.push().getKey();


        String des=hstlnme+"----"+"ROOM NO: "+roomno+"----"+cmplfield+"----"+"NAME: "+name+"----"+"DESCRIPTION: "+descrip;


        UserComplain userInformation =new UserComplain(des);

        try{
            databaseReference.child(ID).setValue(userInformation);
        }catch (Exception e)
        {
            Log.e("DatabaseError", "saveUserComplain: database not updated" );
        }
        Toast.makeText(this, "COMPLAIN REGISTEED..SAVE ID FOR FURTHUR REFERENCE", Toast.LENGTH_SHORT).show();
        CMPLNO.setText("");
        CMPLNO.setText(ID);


    }




}

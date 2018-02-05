package com.pajhama.svnitnme.svnitandme;

import android.content.Intent;
import android.graphics.pdf.PdfDocument;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static android.view.View.Z;

public class GJ_SEC extends AppCompatActivity implements View.OnClickListener{

    private ImageButton HS;
    private ImageButton JHS;
    private ImageButton MESS;
    private ImageButton SPORTS;
    private ImageButton CULTURAL;
    private ImageButton ENVIRONMENT;
    private ImageButton WELFARE;
    private ImageButton TECHNICAL;
    private ImageButton MAGAZINE;
    private Button BACKGJ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gj__sec);

        HS = (ImageButton) findViewById(R.id.HS);
        HS.setOnClickListener((View.OnClickListener) this);

        JHS = (ImageButton) findViewById(R.id.JHS);
        JHS.setOnClickListener((View.OnClickListener) this);

        MESS = (ImageButton) findViewById(R.id.MESS);
        MESS.setOnClickListener((View.OnClickListener) this);

        SPORTS = (ImageButton) findViewById(R.id.SPORTS);
        SPORTS.setOnClickListener((View.OnClickListener) this);

        ENVIRONMENT = (ImageButton) findViewById(R.id.ENVIRONMENT);
        ENVIRONMENT.setOnClickListener((View.OnClickListener) this);

        CULTURAL = (ImageButton) findViewById(R.id.CULTURAL);
        CULTURAL.setOnClickListener((View.OnClickListener) this);

        WELFARE = (ImageButton) findViewById(R.id.WELFARE);
        WELFARE.setOnClickListener((View.OnClickListener) this);

        MAGAZINE = (ImageButton) findViewById(R.id.MAGAZINE);
        MAGAZINE.setOnClickListener((View.OnClickListener) this);

        TECHNICAL = (ImageButton) findViewById(R.id.TECHNICAL);
        TECHNICAL.setOnClickListener((View.OnClickListener) this);

        BACKGJ=(Button)findViewById(R.id.BACKGJ);
        BACKGJ.setOnClickListener((View.OnClickListener) this);

    }

    public void onClick(View view) {
        if (view == HS) {
            String SEC = "HS";
            String HSTL = "GAJJAR BHAVAN";
            String HMC="GAJJAR HMC IS HERE TO HELP YOU";

            Intent myIntent = new Intent(view.getContext(), file_complain.class);
            myIntent.putExtra("sec", SEC);
            myIntent.putExtra("hstl", HSTL);
            myIntent.putExtra("hmc", HMC);
            startActivity(myIntent);
        } else if (view == JHS) {
            String SEC = "JHS";
            String HSTL = "GAJJAR BHAVAN";
            String HMC="GAJJAR HMC IS HERE TO HELP YOU";

            Intent myIntent = new Intent(view.getContext(), file_complain.class);
            myIntent.putExtra("sec", SEC);
            myIntent.putExtra("hstl", HSTL);
            myIntent.putExtra("hmc", HMC);
            startActivity(myIntent);
        } else if (view == MESS) {
            String SEC = "MESS";
            String HSTL = "GAJJAR BHAVAN";
            String HMC="GAJJAR HMC IS HERE TO HELP YOU";

            Intent myIntent = new Intent(view.getContext(), file_complain.class);
            myIntent.putExtra("sec", SEC);
            myIntent.putExtra("hstl", HSTL);
            myIntent.putExtra("hmc", HMC);
            startActivity(myIntent);
        } else if (view == SPORTS) {
            String SEC = "SPORTS";
            String HSTL = "GAJJAR BHAVAN";
            String HMC="GAJJAR HMC IS HERE TO HELP YOU";

            Intent myIntent = new Intent(view.getContext(), file_complain.class);
            myIntent.putExtra("sec", SEC);
            myIntent.putExtra("hstl", HSTL);
            myIntent.putExtra("hmc", HMC);
            startActivity(myIntent);
        } else if (view == CULTURAL) {
            String SEC = "CULTURAL";
            String HSTL = "GAJJAR BHAVAN";
            String HMC="GAJJAR HMC IS HERE TO HELP YOU";

            Intent myIntent = new Intent(view.getContext(), file_complain.class);
            myIntent.putExtra("sec", SEC);
            myIntent.putExtra("hstl", HSTL);
            myIntent.putExtra("hmc", HMC);
            startActivity(myIntent);
        } else if (view == ENVIRONMENT) {
            String SEC = "ENVIRONMENT";
            String HSTL = "GAJJAR BHAVAN";
            String HMC="GAJJAR HMC IS HERE TO HELP YOU";

            Intent myIntent = new Intent(view.getContext(), file_complain.class);
            myIntent.putExtra("sec", SEC);
            myIntent.putExtra("hstl", HSTL);
            myIntent.putExtra("hmc", HMC);
            startActivity(myIntent);
        } else if (view == MAGAZINE) {
            String SEC = "MAGAZINE";
            String HSTL = "GAJJAR BHAVAN";
            String HMC="GAJJAR HMC IS HERE TO HELP YOU";

            Intent myIntent = new Intent(view.getContext(), file_complain.class);
            myIntent.putExtra("sec", SEC);
            myIntent.putExtra("hstl", HSTL);
            myIntent.putExtra("hmc", HMC);
            startActivity(myIntent);
        } else if (view == TECHNICAL) {
            String SEC = "TECHNICAL";
            String HSTL = "GAJJAR BHAVAN";
            String HMC="GAJJAR HMC IS HERE TO HELP YOU";

            Intent myIntent = new Intent(view.getContext(), file_complain.class);
            myIntent.putExtra("sec", SEC);
            myIntent.putExtra("hstl", HSTL);
            myIntent.putExtra("hmc", HMC);
            startActivity(myIntent);
        } else if (view == WELFARE) {
            String SEC = "WELFARE";
            String HSTL = "GAJJAR BHAVAN";
            String HMC="GAJJAR HMC IS HERE TO HELP YOU";

            Intent myIntent = new Intent(view.getContext(), file_complain.class);
            myIntent.putExtra("sec", SEC);
            myIntent.putExtra("hstl", HSTL);
            myIntent.putExtra("hmc", HMC);
            startActivity(myIntent);
        } else if (view==BACKGJ){
            Intent intentLoadNewActivity=new Intent(GJ_SEC.this, WELCOME.class);
            startActivity(intentLoadNewActivity);
        }


    }

}

package com.vibhav2k17.android.vibhav2k17;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.vibhav2k17.android.vibhav2k17.registation.CSgo;

public class csgo extends AppCompatActivity {
    private static Button about;
    private   AlertDialog.Builder about_builder;
    private   AlertDialog.Builder rules_builder;
    private   AlertDialog.Builder judgingCriteria_builder;
    private   AlertDialog.Builder prizes_builder;
    private   AlertDialog.Builder contactUs_builder;
    private   AlertDialog.Builder payment_builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aavis);
        ImageView imageView=(ImageView)findViewById(R.id.titleImage);
        imageView.setImageResource(R.drawable.cs);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout ll = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);



    }
    public void register(View view) {
        startActivity(new Intent(csgo.this,CSgo.class));

    }

    public void about(View view){
        about_builder= new AlertDialog.Builder(csgo.this);
        about_builder.setMessage(R.string.aboutcs);
        AlertDialog alert_about = about_builder.create();
        alert_about.setTitle("About");
        alert_about.show();

    }
    public void rules(View view){
        rules_builder= new AlertDialog.Builder(csgo.this);
        rules_builder.setMessage(R.string.rulescs);
        AlertDialog alert_about = rules_builder.create();
        alert_about.setTitle("Rules");
        alert_about.show();

    }
    public void judgingCriteria(View view){
        judgingCriteria_builder= new AlertDialog.Builder(csgo.this);
        judgingCriteria_builder.setMessage(R.string.judgingCriteriacs);
        AlertDialog alert_about = judgingCriteria_builder.create();
        alert_about.setTitle("Judging Criteria");
        alert_about.show();

    }
    public void prizes(View view){
        prizes_builder= new AlertDialog.Builder(csgo.this);
        prizes_builder.setMessage(R.string.prizescs);
        AlertDialog alert_about = prizes_builder.create();
        alert_about.setTitle("Prizes");
        alert_about.show();

    }
    public void contactUs(View view){
        contactUs_builder= new AlertDialog.Builder(csgo.this);
        contactUs_builder.setMessage(R.string.contactUscs);
        AlertDialog alert_about = contactUs_builder.create();
        alert_about.setTitle("Contact Us");
        alert_about.show();

    }
    public void payments(View view){
        payment_builder= new AlertDialog.Builder(csgo.this);
        payment_builder.setMessage(R.string.paymentcs);
        AlertDialog alert_about = payment_builder.create();
        alert_about.setTitle("Payment Details");
        alert_about.show();

    }

}

//public void onButtonClickListener(){
//    about =(Button)findViewById(R.id.about);
//   about.setOnClickListener(
//  new View.OnClickListener(){
//@Override
//public void onClick(View v){
// about_builder= new AlertDialog.Builder(placement_fever.this);
// about_builder.setMessage("ftf");
// AlertDialog alert_about = about_builder.create();
// alert_about.setTitle("About");
// alert_about.show();
//  }

//  }
//  );
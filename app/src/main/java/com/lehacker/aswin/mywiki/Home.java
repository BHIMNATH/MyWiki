package com.lehacker.aswin.mywiki;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.AlertDialog;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void onBut1Clicked(View view){
       AlertDialog x=new AlertDialog.Builder(Home.this).create();
        x.setTitle("About Me");
        x.setMessage("I am Aswin Bhim Nath");
        x.setButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        x.show();
    }
}

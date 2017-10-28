package com.example.spikee.brain;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.AlertDialog;
import java.io.FileNotFoundException;

/**
 * Created by Spikee on 28-10-2017.
 */

public class LoginSuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_success);

        //To hide AppBar for fullscreen.
        ActionBar ab = getSupportActionBar();
        ab.hide();

        TextView txtname = (TextView) findViewById(R.id.txt_success_name);
        TextView txtemail = (TextView) findViewById(R.id.txt_success_email);
        Button _btnlogout = (Button) findViewById(R.id.btn_logout);
        Button _btnsearch =(Button) findViewById(R.id.search);
        Button _btnsession =(Button) findViewById(R.id.start);

        Intent intent = getIntent();

        String loginName = intent.getStringExtra("fullname");
        String loginEmail = intent.getStringExtra("email");
        txtname.setText("Welcome, " +loginName);

        txtemail.setText(loginEmail);

        _btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(LoginSuccessActivity.this);
                builder.setTitle("Info");
                builder.setMessage("Do you want to logout ??");
                builder.setPositiveButton("Take me away!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        Intent intent = new Intent(LoginSuccessActivity.this,MainActivity.class);
                        startActivity(intent);

                        finish();

                    }
                });

                builder.setNegativeButton("Not now", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        _btnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginSuccessActivity.this,HelpProffesional.class);
                startActivity(intent);
            }});
        _btnsession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginSuccessActivity.this,Q1.class);
                startActivity(intent);
            }});
    }


   }
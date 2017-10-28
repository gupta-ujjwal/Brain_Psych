package com.example.spikee.brain;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Spikee on 28-10-2017.
 */

public class resultActivity extends AppCompatActivity {
    Q1 ob =new Q1();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView grade = (TextView) findViewById(R.id.SCORE);
        TextView conclusion = (TextView) findViewById(R.id.outcome);
        Button b = (Button) findViewById(R.id.HELP);

        grade.setText("Your score for this session is : " + ob.score);

        if (ob.score < 6) {
            conclusion.setText("You are suffering from depression");
        } else if (ob.score < 10) {
            conclusion.setText("You are suffering from stress");
        } else {
            conclusion.setText("You are mentally fit and normal");
            b.setText("close");
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                    System.exit(0);
                }
            });
        }
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(resultActivity.this,HelpProffesional.class);
                    startActivity(intent);
                }
            });
        }
    }

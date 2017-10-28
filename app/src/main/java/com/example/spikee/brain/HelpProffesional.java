package com.example.spikee.brain;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Spikee on 28-10-2017.
 */

public class HelpProffesional  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.proffesional_help);


        String arrName[] = {"Dr. Sunil Mittal","Dr. Sandeep Vohra","Dr. Shwetank Bansal","Dr. Vimal Kumar","Dr Rohit Sharma "};
        String arrAdd[] = {" 35, Defence Enclave, Vikas Road, Delhi, 110092"," Block No 29/24, Main Market ,East Patel Nagar, New Delhi, Delhi 110008","Better Me-Mental Health Services, I-49, Opposite Axis Bank, Balraj Khanna Marg, West Patel Nagar, Khampur, New Delhi, Delhi 110008"," ED-7B First Floor Pitampura(Near Madhuban Chowk), Delhi, 110088"," A22/G3, Gali Number 25, Block A, Dilshad Garden, Delhi, 110095"};
        String arrContact[] ={"09717402402","01125766567","01133496208","01127314488","08447975044"};

        final TextView docA =(TextView) findViewById(R.id.doc1);
        final TextView docB =(TextView) findViewById(R.id.doc2);
        final TextView docC =(TextView) findViewById(R.id.doc3);
        final TextView docD =(TextView) findViewById(R.id.doc4);
        final TextView docE =(TextView) findViewById(R.id.doc5);

        docA.setText("1. "+arrName[0]+" ADD - "+arrAdd[0]+" phone - "+arrContact[0]);
        docB.setText("2. "+arrName[1]+" ADD - "+arrAdd[1]+" phone - "+arrContact[1]);
        docC.setText("3. "+arrName[2]+" ADD - "+arrAdd[2]+" phone - "+arrContact[2]);
        docD.setText("4. "+arrName[3]+" ADD - "+arrAdd[3]+" phone - "+arrContact[3]);
        docE.setText("5. "+arrName[4]+" ADD - "+arrAdd[4]+" phone - "+arrContact[4]);

    }


}
package com.example.spikee.brain;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;



public class Q5 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q5);
        final TextView q = (TextView) findViewById(R.id.quest);
        final RadioGroup grp = (RadioGroup) findViewById(R.id.radioGroup);
        final RadioButton a = (RadioButton) findViewById(R.id.radio0);
        final RadioButton b = (RadioButton) findViewById(R.id.radio1);
        final RadioButton c = (RadioButton) findViewById(R.id.radio2);
        final RadioButton d = (RadioButton) findViewById(R.id.radio3);
        final Button sub = (Button) findViewById(R.id.button1);
        int i=0;
        RadioButton answer;
        final String Answers[] ={"No", "I have only once", "Some times", "Every day"};
        Q1 ob =new Q1();
        final String questions[] = new String[5];
        questions[0] ="Are you addicted to anything or do something habitually every day or so ?";
        questions[1] = "Some times";
        questions[2] = "I have only once";
        questions[3] = "Every day";
        questions[4] = "No";
        String ans;
        q.setText(questions[0]);
        a.setText(questions[1]);
        b.setText(questions[2]);
        c.setText(questions[3]);
        d.setText(questions[4]);
        answer=(RadioButton)findViewById(grp.getCheckedRadioButtonId());
        ans=(String) answer.getText();

        for(int j=0;j<4;j++)
        {
            if(ans.equals(Answers[j]))
            {
                ob.score += j;
                break;
            }
        }sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Q5.this,resultActivity.class);
                startActivity(intent);
            }});
    }
}
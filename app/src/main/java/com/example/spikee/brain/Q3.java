package com.example.spikee.brain;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;



public class Q3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q3);
        final TextView q = (TextView) findViewById(R.id.quest);
        final RadioGroup grp = (RadioGroup) findViewById(R.id.radioGroup);
        final RadioButton a = (RadioButton) findViewById(R.id.radio0);
        final RadioButton b = (RadioButton) findViewById(R.id.radio1);
        final RadioButton c = (RadioButton) findViewById(R.id.radio2);
        final RadioButton d = (RadioButton) findViewById(R.id.radio3);
        final Button sub = (Button) findViewById(R.id.button1);
        RadioButton answer;
        final String Answers[] =
                {"Its someone else's fault", "I guess", "No", "Yes"};

        final String questions[] = new String[5];
        Q1 ob =new Q1();
        questions[0] = "Do you blame yourself for your own internal sadness ?";
        questions[1] = "Yes";
        questions[2] = "No";
        questions[3] = "I guess";
        questions[4] = "Its someone else's fault";
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
        }        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Q3.this,Q4.class);
                startActivity(intent);
            }});
    }
}
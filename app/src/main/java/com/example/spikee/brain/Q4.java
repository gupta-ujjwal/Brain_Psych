package com.example.spikee.brain;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;



public class Q4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q4);
        final TextView q = (TextView) findViewById(R.id.quest);
        final RadioGroup grp = (RadioGroup) findViewById(R.id.radioGroup);
        final RadioButton a = (RadioButton) findViewById(R.id.radio0);
        final RadioButton b = (RadioButton) findViewById(R.id.radio1);
        final RadioButton c = (RadioButton) findViewById(R.id.radio2);
        final RadioButton d = (RadioButton) findViewById(R.id.radio3);
        final Button sub = (Button) findViewById(R.id.button1);
        RadioButton answer;
        final String Answers[] =
                {"All the time, it changes my mood drastically", "Kind of, I think of it sometimes", "Not really.. But now that I think about it", "No, that's over and done with"};

        Q1 ob =new Q1();
        final String questions[] = new String[5];
        questions[0] = "Do you often dwell on past ?";
        questions[1] = "Kind of, I think of it sometimes";
        questions[2] = "Not really.. But now that I think about it";
        questions[3] = "No, that's over and done with";
        questions[4] = "All the time, it changes my mood drastically";
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
        }
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Q4.this,Q5.class);
                startActivity(intent);
            }});
    }
}
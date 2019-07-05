package com.example.param.bmi;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class activitytwo extends AppCompatActivity {
     EditText weight;
     EditText height;
     Button calc;
    TextView bmi;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitytwo);

    }
    public void calculateClicked(View view){
        double h;
        double w;
        double ans;
        String a,ht,wt;
        weight=(EditText)findViewById(R.id.weight);
        height=(EditText)findViewById(R.id.height);
        calc=(Button)findViewById(R.id.calculate);
        bmi=(TextView)findViewById(R.id.bmi);
        result=(TextView)findViewById(R.id.result);
        ht=height.getText().toString();
        wt=weight.getText().toString();
        if(!ht.isEmpty()&&!wt.isEmpty()) {
            h=Double.parseDouble(ht);
            w=Double.parseDouble(wt);
            ans = w / (h * h);
            bmi.setText(String.valueOf(ans));
            if (ans < 18.5) {
                a = "Underweight";
            } else if (ans > 18.5 && ans < 25) {
                a = "Normal";
            } else {
                a = "Overweight";
            }
            result.setText(a);
        }
        else {
            Toast.makeText(getApplicationContext(), "YOU MISSED SOMETHING",Toast.LENGTH_LONG).show();
        }

    }

}

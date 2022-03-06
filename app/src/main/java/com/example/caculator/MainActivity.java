package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    EditText n1,n2;
    TextView textView;
    Button ADD,sub,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);
        textView=findViewById(R.id.textview);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        ADD=findViewById(R.id.ADD);
        ADD.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int fvalue,svalue,ans;
                fvalue=Integer.parseInt(n1.getText().toString());
                svalue=Integer.parseInt(n2.getText().toString());
                ans=fvalue+svalue;
                textView.setText("the ans is:"+ans);
            }
        });
        sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int fvalue,svalue,ans;
                fvalue=Integer.parseInt(n1.getText().toString());
                svalue=Integer.parseInt(n2.getText().toString());
                ans=fvalue-svalue;
                textView.setText("the ans is:"+ans);
            }
        });
        mul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int fvalue,svalue,ans;
                fvalue=Integer.parseInt(n1.getText().toString());
                svalue=Integer.parseInt(n2.getText().toString());
                ans=fvalue*svalue;
                textView.setText("the ans is:"+ans);
            }
        });
        div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int fvalue,svalue,ans;
                fvalue=Integer.parseInt(n1.getText().toString());
                svalue=Integer.parseInt(n2.getText().toString());
                ans=fvalue/svalue;
                textView.setText("the ans is:"+ans);
            }
        });




    }
}
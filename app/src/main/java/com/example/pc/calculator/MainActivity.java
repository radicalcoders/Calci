package com.example.pc.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    String a=" ",b=" ";
    float res1,res2,res3;
    boolean pAddition,pSubtraction,pMultiplication,pDivision;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmul,bdiv,bdot,beql,bclr;
        final EditText edt;
        b0= (Button) findViewById(R.id.button0);
        b1= (Button) findViewById(R.id.button1);
        b2= (Button) findViewById(R.id.button2);
        b3= (Button) findViewById(R.id.button3);
        b4= (Button) findViewById(R.id.button4);
        b5= (Button) findViewById(R.id.button5);
        b6= (Button) findViewById(R.id.button6);
        b7= (Button) findViewById(R.id.button7);
        b8= (Button) findViewById(R.id.button8);
        b9= (Button) findViewById(R.id.button9);
        bdot= (Button) findViewById(R.id.button_dot);
        beql= (Button) findViewById(R.id.button_equals);
        bclr= (Button) findViewById(R.id.button_clear);
        badd= (Button) findViewById(R.id.button_plus);
        bsub= (Button) findViewById(R.id.button_minus);
        bmul= (Button) findViewById(R.id.button_multiply);
        bdiv= (Button) findViewById(R.id.button_divide);
        edt= (EditText) findViewById(R.id.display_text_view);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        edt.setText(edt.getText()+"4");
    }
});
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"9");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+".");
            }
        });
        bclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText("");
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               a=edt.getText().toString();
                res1=Float.parseFloat(a);
                edt.setText("");
                pAddition=true;
            }
            });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=edt.getText().toString();
                res1=Float.parseFloat(a);
                edt.setText("");
                pSubtraction=true;
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=edt.getText().toString();
                res1=Float.parseFloat(a);
                edt.setText("");
                pMultiplication=true;
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=edt.getText().toString();
                res1=Float.parseFloat(a);
                edt.setText("");
                pDivision=true;
            }
        });
        beql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=edt.getText().toString();
                res2= Float.parseFloat(b);
                if(pAddition==true) {
                    res3 = res1 + res2;
                    edt.setText(res3+" ");
                }
                if(pSubtraction==true){
                    res3=res1-res2;
                    edt.setText(res3+" ");
                }
                if(pMultiplication==true){
                    res3=res1*res2;
                    edt.setText(res3+" ");
                }
                if(pDivision==true){
                    res3=res1/res2;
                    edt.setText(res3+" ");
                }
            }
        });




    }







    }



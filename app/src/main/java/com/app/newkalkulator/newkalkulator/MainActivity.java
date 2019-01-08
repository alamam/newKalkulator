package com.app.newkalkulator.newkalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView myTxt,info;
    Button button1,button2,button3,button4,button5,button6,button7,button8,
    button9,button0,buttonClear,buttonPlus,buttonMinus,buttonKali,buttonHasil,buttonBagi;
    private final char plus = '+';
    private final char minus = '-';
    private final char kali = 'x';
    private final char bagi = '/';
    private final char equal = 0;
    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUiView();
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "0");

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "1");

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "2");

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "3");

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "4");

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "5");

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "6");

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "7");

            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "8");

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "9");

            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = plus;
                myTxt.setText(String.valueOf(val1)+"+");
                info.setText(null);
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = minus;
                myTxt.setText(String.valueOf(val1)+"-");
                info.setText(null);
            }
        });

        buttonKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = kali;
                myTxt.setText(String.valueOf(val1)+"x");
                info.setText(null);
            }
        });

        buttonBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = bagi;
                myTxt.setText(String.valueOf(val1)+"/");
                info.setText(null);
            }
        });
        buttonHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = equal;
                myTxt.setText(myTxt.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
                info.setText(null);
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (info.getText().length()>0){
                    CharSequence name =info.getText().toString();
                    info.setText(name.subSequence(0,name.length()-1));
                }
                else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    info.setText(null);
                    myTxt.setText(null);
                }
            }
        });

    }

    private void setupUiView(){
        button0 = (Button)findViewById(R.id.btn0);
        button1 = (Button)findViewById(R.id.btn1);
        button2 = (Button)findViewById(R.id.btn2);
        button3 = (Button)findViewById(R.id.btn3);
        button4 = (Button)findViewById(R.id.btn4);
        button5 = (Button)findViewById(R.id.btn5);
        button6 = (Button)findViewById(R.id.btn6);
        button7 = (Button)findViewById(R.id.btn7);
        button8 = (Button)findViewById(R.id.btn8);
        button9 = (Button)findViewById(R.id.btn9);
        buttonBagi = (Button)findViewById(R.id.btnBagi);
        buttonPlus = (Button)findViewById(R.id.btnPlus);
        buttonKali = (Button)findViewById(R.id.btnKali);
        buttonMinus = (Button)findViewById(R.id.btnMinus);
        buttonClear = (Button)findViewById(R.id.btnHpus);
        buttonHasil = (Button)findViewById(R.id.btnHasil);
        myTxt = (TextView)findViewById(R.id.txtResult);
        info = (TextView)findViewById(R.id.txtInfo);

    }
    private void compute(){
        if (!Double.isNaN(val1)){
            val2 = Double.parseDouble(info.getText().toString());
            switch (ACTION){
                case plus:
                    val1 = val1 + val2;
                    break;
                case minus:
                    val1 = val1 - val2;
                    break;
                case kali:
                    val1 = val1 * val2;
                    break;
                case bagi:
                    val1 = val1 / val2;
                    break;
                case equal:
                break;
            }
        }else {
            val1 = Double.parseDouble(info.getText().toString());
        }
    }
}

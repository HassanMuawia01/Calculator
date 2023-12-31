package com.example.myfirstcalculator;


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
 // Create Object
    EditText display;
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonClear,btn_ac,BtnON,BtnOFF,buttonAdd,buttonSubtract,buttonMultiply,buttonDivide,buttonEqual,buttonModulo;

    String show="",op,onoff;
    float result;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // call xml attribute  id (Example use for EditText, ViewText, Button

        display = findViewById(R.id.display);

        BtnON = findViewById(R.id.BtnON);

        //Function apply on Button

        BtnON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onoff = "on";
                show = "";
                display.setText(show);
            }
        });

        BtnOFF = findViewById(R.id.BtnOFF);
        BtnOFF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onoff == "on") {
                    onoff = "off";
                    show="";
                    display.setText(show);
                } else{
                    display.setText("Please Turn ON");
                }

            }
        });

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onoff == "on") {
                    show += "1";
                    display.setText(show);
                } else{
                    display.setText("Please Turn ON");
                }

            }
        });

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onoff == "on") {
                    show += "2";
                    display.setText(show);
                } else{
                    display.setText("Please Turn ON");
                }

            }
        });

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onoff == "on") {
                    show += "3";
                    display.setText(show);
                } else{
                    display.setText("Please Turn ON");
                }

            }
        });

        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onoff == "on") {
                    show += "4";
                    display.setText(show);
                } else{
                    display.setText("Please Turn ON");
                }

            }
        });

        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onoff == "on") {
                    show += "5";
                    display.setText(show);
                } else{
                    display.setText("Please Turn ON");
                }

            }
        });

        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onoff == "on") {
                    show += "6";
                    display.setText(show);
                } else{
                    display.setText("Please Turn ON");
                }

            }
        });

        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onoff == "on") {
                    show += "7";
                    display.setText(show);
                } else{
                    display.setText("Please Turn ON");
                }

            }
        });

        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onoff == "on") {
                    show += "8";
                    display.setText(show);
                } else{
                    display.setText("Please Turn ON");
                }

            }
        });

        button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onoff == "on") {
                    show += "9";
                    display.setText(show);
                } else{
                    display.setText("Please Turn ON");
                }

            }
        });

        button0 = findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onoff == "on") {
                    show += "0";
                    display.setText(show);
                } else{
                    display.setText("Please Turn ON");
                }

            }
        });

        buttonClear = findViewById(R.id.buttonClear);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onoff == "on") {
                    show = show.replaceAll(".$", "");
                    display.setText(show);
                } else{
                    display.setText("Please Turn ON");
                }

            }
        });

        btn_ac = findViewById(R.id.btn_ac);
        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onoff == "on") {
                    show = "";
                    display.setText(show);
                } else{
                    display.setText("Please Turn ON");
                }

            }
        });

        buttonEqual = findViewById(R.id.buttonEqual);
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onoff == "on") {
                    if (op.equalsIgnoreCase("+")) {
                        num2 = Integer.parseInt(display.getText().toString());
                        result = num1 + num2;
                        display.setText(Float.toString(result));

                    } else if (op.equalsIgnoreCase("-")) {
                        num2 = Integer.parseInt(display.getText().toString());
                        result = num1 - num2;
                        display.setText(Float.toString(result));

                    } else if (op.equalsIgnoreCase("*")) {
                        num2 = Integer.parseInt(display.getText().toString());
                        result = num1 * num2;
                        display.setText(Float.toString(result));

                    } else if (op.equalsIgnoreCase("/")) {
                        num2 = Integer.parseInt(display.getText().toString());
                        result = num1 / num2;
                        display.setText(Float.toString(result));
                    } else if (op.equalsIgnoreCase("%")) {
                        num2 = Integer.parseInt(display.getText().toString());
                        result = num1 % num2;
                        display.setText(Float.toString(result));
                    }
                } else{
                    display.setText("Please Turn ON");
                }

            }
        });

        buttonModulo = findViewById(R.id.buttonModulo);
        buttonModulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onoff == "on") {
                    num1 = Integer.parseInt(display.getText().toString());
                    show = "";
                    display.setText("/R");
                    op = "%";
                } else{
                    display.setText("Please Turn ON");
                }


            }
        });

        buttonAdd = findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onoff == "on") {
                    num1 = Integer.parseInt(display.getText().toString());
                    show = "";
                    display.setText("+");
                    op = "+";
                } else{
                    display.setText("Please Turn ON");
                }
            }
        });

        buttonSubtract = findViewById(R.id.buttonSubtract);
        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onoff == "on") {
                    num1 = Integer.parseInt(display.getText().toString());
                    show = "";
                    display.setText("-");
                    op = "-";
                } else{
                    display.setText("Please Turn ON");
                }

            }
        });

        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onoff == "on") {
                    num1 = Integer.parseInt(display.getText().toString());
                    show = "";
                    display.setText("*");
                    op = "*";
                } else{
                    display.setText("Please Turn ON");
                }

            }
        });

        buttonDivide = findViewById(R.id.buttonDivide);
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onoff == "on") {
                    num1 = Integer.parseInt(display.getText().toString());
                    show = "";
                    display.setText("/");
                    op = "/";
                } else{
                    display.setText("Please Turn ON");
                }
            }
        });

}
}
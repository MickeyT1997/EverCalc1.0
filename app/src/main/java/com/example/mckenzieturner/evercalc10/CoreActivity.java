package com.example.mckenzieturner.evercalc10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CoreActivity extends AppCompatActivity {

    Button b_Num1, b_Num2, b_Num3, b_Num4, b_Num5, b_Num6, b_Num7, b_Num8, b_Num9, b_Num0;
    Button b_Addition, b_Multiplication, b_Division, b_Subtraction, b_Percentage, b_Equals, b_AllClear, b_PositiveNegative, b_Period;
    EditText b_Awnser;

    Boolean Add, Subtract, Divide, Multiply, Percentage;

    Float fNum1;
    Float fNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_core);

        b_Num0 = findViewById(R.id.b_Num0);
        b_Num1 = findViewById(R.id.b_Num1);
        b_Num2 = findViewById(R.id.b_Num2);
        b_Num3 = findViewById(R.id.b_Num3);
        b_Num4 = findViewById(R.id.b_Num4);
        b_Num5 = findViewById(R.id.b_Num5);
        b_Num6 = findViewById(R.id.b_Num6);
        b_Num7 = findViewById(R.id.b_Num7);
        b_Num8 = findViewById(R.id.b_Num8);
        b_Num9 = findViewById(R.id.b_Num9);

        b_Addition = findViewById(R.id.b_Addition);
        b_AllClear = findViewById(R.id.b_AllClear);
        b_Division = findViewById(R.id.b_Division);
        b_Equals = findViewById(R.id.b_Equals);
        b_Multiplication = findViewById(R.id.b_Multiplication);
        b_Percentage = findViewById(R.id.b_Precentage);
        b_Period = findViewById(R.id.b_Period);
        b_PositiveNegative = findViewById(R.id.b_PositiveNegative);
        b_Subtraction = findViewById(R.id.b_Subtraction);

        b_Awnser = findViewById(R.id.b_Awnser);
        b_Awnser.setText("");

        Add = false;
        Subtract = false;
        Divide = false;
        Multiply = false;
        Percentage = false;


        b_Num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_Awnser.setText(b_Awnser.getText() + "1");
            }
        });

        b_Num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_Awnser.setText(b_Awnser.getText() + "2");
            }
        });

        b_Num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_Awnser.setText(b_Awnser.getText() + "3");
            }
        });

        b_Num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_Awnser.setText(b_Awnser.getText() + "4");
            }
        });

        b_Num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_Awnser.setText(b_Awnser.getText() + "5");
            }
        });

        b_Num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_Awnser.setText(b_Awnser.getText() + "6");
            }
        });

        b_Num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_Awnser.setText(b_Awnser.getText() + "7");
            }
        });

        b_Num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_Awnser.setText(b_Awnser.getText() + "8");
            }
        });

        b_Num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_Awnser.setText(b_Awnser.getText() + "9");
            }
        });

        b_Num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_Awnser.setText(b_Awnser.getText() + "0");
            }
        });

        b_Addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (b_Awnser == null) {
                    b_Awnser.setText("");
                } else {
                    fNum1 = Float.parseFloat(b_Awnser.getText() + "");
                    Add = true;
                    b_Awnser.setText(null);
                }
            }
        });

        b_Subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fNum1 = Float.parseFloat(b_Awnser.getText() + "");
                Subtract = true;
                b_Awnser.setText(null);
            }
        });

        b_Multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fNum1 = Float.parseFloat(b_Awnser.getText() + "");
                Multiply = true;
                b_Awnser.setText(null);
            }
        });

        b_Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fNum1 = Float.parseFloat(b_Awnser.getText() + "");
                Divide = true;
                b_Awnser.setText(null);
            }
        });

        b_Percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fNum1 = Float.parseFloat(b_Awnser.getText() + "");
                Percentage = true;
                b_Awnser.setText(null);
            }
        });

        b_PositiveNegative.setOnClickListener(new View.OnClickListener() {

            String a;

            @Override
            public void onClick(View view) {
                a = b_Awnser.getText().toString();
                    b_Awnser.setText("-" + b_Awnser.getText());

                if(a.contains("-")){
                    a = b_Awnser.getText().toString().replace("-","");
                    b_Awnser.setText(a);
                }
            }
        });

        b_Equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fNum2 = Float.parseFloat(b_Awnser.getText() + "");

                if (Add) {
                    String a = Float.toString(fNum1 + fNum2);
                    b_Awnser.setText(a);
                    Add = false;
                }

                if (Subtract) {
                    String a = Float.toString(fNum1 - fNum2);
                    b_Awnser.setText(a);
                    Subtract = false;
                }

                if (Multiply) {
                    String a = Float.toString(fNum1 * fNum2);
                    b_Awnser.setText(a);
                    Multiply = false;
                }

                if (Divide) {
                    String a = Float.toString(fNum1 / fNum2);
                    b_Awnser.setText(a);
                    Divide = false;
                }

                if(Percentage){
                    float a = fNum1 * fNum2;
                    float b = a / 100;
                    String c = Float.toString(b);
                    b_Awnser.setText(c);
                    Percentage = false;
                }
            }
        });

        b_AllClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_Awnser.setText("");
            }
        });

        b_Period.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = ".";
                    b_Awnser.setText(b_Awnser.getText() + a);

            }
        });
    }
}

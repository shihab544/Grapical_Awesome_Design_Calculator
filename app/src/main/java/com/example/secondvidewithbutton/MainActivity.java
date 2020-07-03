package com.example.secondvidewithbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView display;
    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,btn_equal,btn_dot,clearBtn,btn_add,btn_sub,btn_mul,btn_div;
  Double num1,num2,result;
  String opration;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_0 = (Button)findViewById(R.id.btn_0);
        btn_1 = (Button)findViewById(R.id.btn_1);
        btn_2 = (Button)findViewById(R.id.btn_2);
        btn_3 = (Button)findViewById(R.id.btn_3);
        btn_4 = (Button)findViewById(R.id.btn_4);


        btn_5 = (Button)findViewById(R.id.btn_5);
        btn_6 = (Button)findViewById(R.id.btn_6);
        btn_7 = (Button)findViewById(R.id.btn_7);
        btn_8 = (Button)findViewById(R.id.btn_8);
        btn_9 = (Button)findViewById(R.id.btn_9);

        btn_equal = (Button)findViewById(R.id.btn_equal);
        btn_dot = (Button)findViewById(R.id.btn_dot);
        btn_add = (Button)findViewById(R.id.btn_add);
        btn_sub = (Button)findViewById(R.id.btn_sub);
        btn_mul = (Button)findViewById(R.id.btn_mul);
        clearBtn = (Button)findViewById(R.id.clearBtn);
        btn_div =(Button) findViewById(R.id.btn_div);
        display = (TextView)findViewById(R.id.display);
    }


    public void methodBtn_0(View view) {
        String input = display.getText()+"0"; //display ar modda input nia c just i mean our TextView ta thn display ta show korta hoba
            display.setText(input);

    }

    public void methodBtn_Dot(View view) {
        String input = display.getText()+".";
        display.setText(input);
    }

    public void methodBtn_1(View view) {
        String input = display.getText()+"1";
        display.setText(input);
    }

    public void methodBtn_2(View view) {
        String input = display.getText()+"2";
        display.setText(input);
    }

    public void methodBtn_3(View view) {
        String input = display.getText()+"3";
        display.setText(input);
    }

    public void methodBtn_Mul(View view) {

        num1 = Double.parseDouble(display.getText().toString());
        display.setText("");
        opration="*";
    }

    public void methodBtn_Add(View view) {
        num1 = Double.parseDouble(display.getText().toString());
        display.setText("");
        opration="+";

    }

    public void methodBtn_4(View view) {

        String input = display.getText()+"4";
        display.setText(input);
    }

    public void methodBtn_5(View view) {
        String input = display.getText()+"5";
        display.setText(input);
    }

    public void methodBtn_6(View view) {
        String input = display.getText()+"6";
        display.setText(input);
    }

    public void methodBtn_Sub(View view) {
        num1 = Double.parseDouble(display.getText().toString());
        display.setText("");
        opration="-";

    }

    public void methodBtn_7(View view) {
        String input = display.getText()+"7";
        display.setText(input);
    }

    public void methodBtn_8(View view) {
        String input = display.getText()+"8";
        display.setText(input);
    }

    public void methodBtn_9(View view) {
        String input = display.getText()+"9";
        display.setText(input);
    }

    public void methodBtn_Equal(View view) {
        String answer;
        num2 = Double.parseDouble(display.getText().toString());
        switch (opration){
            case "+":
                result = num1+num2;
                answer = String.format("%.0f",result);
                display.setText(answer);
                break;

            case "-":
                result = num1-num2;
                answer = String.format("%.0f",result);
                display.setText(answer);
                break;

            case "*":
                result = num1*num2;
                answer = String.format("%.0f",result);
                display.setText(answer);
                break;

            case "/":
                result = num1/num2;
                answer = String.format("%.0f",result);
                display.setText(answer);
                break;
        }
    }

    public void method_Clear(View view) {
        display.setText("");
    }
}
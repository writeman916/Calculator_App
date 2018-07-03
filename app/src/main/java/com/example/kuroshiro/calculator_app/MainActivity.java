package com.example.kuroshiro.calculator_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String operator = "";
    float remenber = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        final TextView tw = (TextView) this.findViewById(R.id.tvMath);
        final TextView twR = (TextView) this.findViewById(R.id.tvResult);
        final TextView twOp = (TextView) this.findViewById(R.id.tvOperator);



        Button bt0 = (Button) this.findViewById(R.id.btn0);
        Button bt1 = (Button) this.findViewById(R.id.btn1);
        Button bt2 = (Button) this.findViewById(R.id.btn2);
        Button bt3 = (Button) this.findViewById(R.id.btn3);
        Button bt4 = (Button) this.findViewById(R.id.btn4);
        Button bt5 = (Button) this.findViewById(R.id.btn5);
        Button bt6 = (Button) this.findViewById(R.id.btn6);
        Button bt7 = (Button) this.findViewById(R.id.btn7);
        Button bt8 = (Button) this.findViewById(R.id.btn8);
        Button bt9 = (Button) this.findViewById(R.id.btn9);

        Button btMov = (Button) this.findViewById(R.id.btnMod);
        Button btDot = (Button) this.findViewById(R.id.btnDot);
        Button btPlus = (Button) this.findViewById(R.id.btnPlus);
        Button btDiv = (Button) this.findViewById(R.id.btnDiv);
        Button btMul = (Button) this.findViewById(R.id.btnMul);
        Button btSub = (Button) this.findViewById(R.id.btnSub);
        Button btResult = (Button) this.findViewById(R.id.btnResult);
        Button btC = (Button) this.findViewById(R.id.btnC);
        Button btDau = (Button) this.findViewById(R.id.btnDau);


        bt1.setOnClickListener( new View.OnClickListener()
        {
          public void onClick(View v)
          {
              if(tw.getText().toString().equals("0")|| !twR.getText().toString().equals("0"))
              {
                  tw.setText("1");
                  twR.setText("0");
              }
              else

                tw.setText(tw.getText().toString() + "1");
          }
        });
        bt2.setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View v)
            { if(tw.getText().toString().equals("0")|| !twR.getText().toString().equals("0"))
            {
                tw.setText("2");
                twR.setText("0");
            }
            else

                tw.setText(tw.getText().toString() + "2");
            }
        });
        bt3.setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(tw.getText().toString().equals("0")|| !twR.getText().toString().equals("0"))
                {
                    tw.setText("3");
                    twR.setText("0");
                }
                else

                tw.setText(tw.getText().toString() + "3");
            }
        });
        bt4.setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View v)
            { if(tw.getText().toString().equals("0")|| !twR.getText().toString().equals("0"))
            {
                tw.setText("4");
                twR.setText("0");
            }
            else

                tw.setText(tw.getText().toString() + "4");
            }
        });
        bt5.setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View v)
            { if(tw.getText().toString().equals("0")|| !twR.getText().toString().equals("0"))
            {
                tw.setText("5");
                twR.setText("0");
            }
            else

                tw.setText(tw.getText().toString() + "5");
            }
        });
        bt6.setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View v)
            { if(tw.getText().toString().equals("0")|| !twR.getText().toString().equals("0"))
            {
                tw.setText("6");
                twR.setText("0");
            }
            else

                tw.setText(tw.getText().toString() + "6");
            }
        });
        bt7.setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View v)
            { if(tw.getText().toString().equals("0")  || !twR.getText().toString().equals("0"))
            {
                tw.setText("7");
                twR.setText("0");
            }
            else

                tw.setText(tw.getText().toString() + "7");
            }
        });
        bt8.setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View v)
            { if(tw.getText().toString().equals("0")  || !twR.getText().toString().equals("0"))
            {
                tw.setText("8");
                twR.setText("0");
            }
            else

                tw.setText(tw.getText().toString() + "8");
            }
        });
        bt9.setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(tw.getText().toString().equals("0") || !twR.getText().toString().equals("0"))  // xu ly khi khong co so 0 dung truoc
                     {
                tw.setText("9");
                twR.setText("0");
                 }
            else
                tw.setText(tw.getText().toString() + "9");
            }
        });
        bt0.setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View v)
            { if(tw.getText().toString().equals("0"))
            {
                tw.setText("0");
            }
            else

                tw.setText(tw.getText().toString() + "0");
            }
        });

        btDot.setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View v) {
                if (!tw.getText().toString().equals("0")) {
                    tw.setText(tw.getText().toString() + ".");
                }
            }

        });

        btC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tw.setText("0");
                twR.setText("0");
                remenber = 0;
            }
        });

        btDau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               if(!tw.getText().toString().equals("0")) tw.setText("-"+tw.getText().toString());
            }
        });

        btPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = "+";
                twOp.setText("+");
                if(!twR.getText().toString().equals("0"))
                {
                    tw.setText("0");
                }
                else {
                    remenber = Float.parseFloat(tw.getText().toString());
                    tw.setText("0");
                    twR.setText(tw.getText().toString());
                }
            }
        });
        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = "/";
                twOp.setText("/");
                if(!twR.getText().toString().equals("0"))
                {
                    tw.setText("0");
                }
                else {
                    remenber = Float.parseFloat(tw.getText().toString());
                    tw.setText("0");
                    twR.setText(tw.getText().toString());
                }
            }
        });
        btMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = "*";
                twOp.setText("*");
                if(!twR.getText().toString().equals("0"))
                {
                    tw.setText("0");
                }
                else {
                    remenber = Float.parseFloat(tw.getText().toString());
                    tw.setText("0");
                    twR.setText(tw.getText().toString());
                }
            }
        });
        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = "-";
                twOp.setText("-");
                if(!twR.getText().toString().equals("0"))
                {
                    tw.setText("0");
                }
                else {
                    remenber = Float.parseFloat(tw.getText().toString());
                    tw.setText("0");
                    twR.setText(tw.getText().toString());
                }
            }
        });
        btMov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = "%";
                twOp.setText("%");
                if(!twR.getText().toString().equals("0"))
                {
                    tw.setText("0");
                }
                else {
                    remenber = Float.parseFloat(tw.getText().toString());
                    tw.setText("0");
                    twR.setText(tw.getText().toString());
                }
            }
        });

        btResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (operator) {
                    case "+": {
                        float b = Float.parseFloat(tw.getText().toString());
                        twR.setText(String.valueOf(remenber + b));
                        remenber = remenber+b; //luu kq
                        break;
                    }
                    case "*": {
                        float b = Float.parseFloat(tw.getText().toString());
                        twR.setText(String.valueOf(remenber * b));
                        remenber = remenber*b; //luu kq
                        break;
                    }
                    case "/": {
                        float b = Float.parseFloat(tw.getText().toString());
                        twR.setText(String.valueOf(remenber / b));
                        remenber = remenber/b; //luu kq
                        break;
                    }
                    case "-": {
                        float b = Float.parseFloat(tw.getText().toString());
                        twR.setText(String.valueOf(remenber - b));
                        remenber = remenber-b; //luu kq
                        break;
                    }
                    case "%": {
                        float b = Float.parseFloat(tw.getText().toString());
                        twR.setText(String.valueOf(remenber % b));
                        remenber = remenber%b; //luu kq
                        break;
                    }
                }
                tw.setText("0");
                twOp.setText("");
            }
        });
    }
}

package com.example.wahid.newcal;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


   //DORKARI VARIABLES INITIALIZATION


    char[] operator = new char[49];
    int p =0;
    String disp="";
    String[] text1 = new String[50];
    int n=0;


    TextView TV;

    Button one,two,three,four,five,six,seven,eight,nine,zero,mul,div,sub,add,cancel,point,equal,cross,factorial,squareRoot;

    //DORKARI VARIABLES INITIALIZATIONS FINISHED


    public void Display(String c)
    {
        //THIS METHOD DISPLAYS WHATEVER THE USER TYPES
            disp+=c;
            TV.setText(disp);
    }

    public void Clear(){

        //THIS METHOD CLEARS EVERYTHING WHATEVER THE USER TYPES
        disp ="0";
        TV.setText(disp);
        disp="";
        n=0;
    }

    /*  SPLITTING TEXTS FROM OPERATORS   */

    public void split(String text) {
        int i = 0;
        while (i < text.length()) {
            if (text.charAt(i) == '+') {
                text1[p] = "";
                for (int g = 0; g < i; g++) {

                    text1[p] += text.charAt(g);
                }


                for (int g = i + 1; g < text.length(); g++) {
                    text1[p + 1] += text.charAt(g);
                }
                String[] s = text1[p + 1].split("null");
                text1[p + 1] = s[1];

                String Mocktext2 = text1[p + 1];
                operator[p] = '+';
                p++;

                split(Mocktext2);
                i = text.length();
            } else if (text.charAt(i) == '-') {
                text1[p] = "";
                for (int g = 0; g < i; g++) {

                    text1[p] += text.charAt(g);
                }


                for (int g = i + 1; g < text.length(); g++) {
                    text1[p + 1] += text.charAt(g);
                }
                String[] s = text1[p + 1].split("null");
                text1[p + 1] = s[1];

                String Mocktext2 = text1[p + 1];
                operator[p] = '-';
                p++;


                split(Mocktext2);
                i = text.length();
            } else if (text.charAt(i) == '×') {
                text1[p] = "";
                for (int g = 0; g < i; g++) {

                    text1[p] += text.charAt(g);
                }


                for (int g = i + 1; g < text.length(); g++) {
                    text1[p + 1] += text.charAt(g);
                }
                String[] s = text1[p + 1].split("null");
                text1[p + 1] = s[1];

                String Mocktext2 = text1[p + 1];
                operator[p] = '×';
                p++;

                split(Mocktext2);
                i = text.length();
            } else if (text.charAt(i) == '÷') {
                text1[p] = "";
                for (int g = 0; g < i; g++) {

                    text1[p] += text.charAt(g);
                }


                for (int g = i + 1; g < text.length(); g++) {
                    text1[p + 1] += text.charAt(g);
                }
                String[] s = text1[p + 1].split("null");
                text1[p + 1] = s[1];
                String Mocktext2 = text1[p + 1];
                operator[p] = '÷';
                p++;

                split(Mocktext2);
                i = text.length();
            }
            i++;
        }
    }

    /*  SPLITTING FINISHED  */

 public String ZeroRemoverFromback(String text) {
     //REMOVING DECIMAL .0 VALUE FROM BACK
     String l = text;
     String[] f = l.split("\\.");
     String l1 = f[0];
     String r1 = f[1];
     if (r1.length() == 1) {
         if (r1.charAt(0) == '0') {
             /* Do nothing  */
           // JODI r1 ER LENGTH 1 HOI AND JODI 0 HOI THEN IT WILL BE RECOGNIZED AS DECIMAL VALUE 0 AND REMOVE IT
         } else {
             l1 = text;
         }
     } else {
         l1 = text;
     }
     //REMOVING FINISH
        return l1;
    }



    public int factorialF(String t){
        int product=1;

        int d = Integer.parseInt(t);
        for (int i=d;i>=1;i--){
            product = product * i;
        }
            return  product;
 }
 public double squareRootF(String t) {

     double d = Double.parseDouble(t);
     double e = Math.sqrt(d);

     return e;
 }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toast.makeText(MainActivity.this,"Thanks For Using newCal V2.0",Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this,"Do not Use Root and Factorial With other Operators!",Toast.LENGTH_LONG).show();
      //  Toast.makeText(MainActivity.this,"You Know How To Use Root And Factorial :-)",Toast.LENGTH_LONG).show();

       //Initializing Button
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four  = findViewById(R.id.four);
        five  = findViewById(R.id.five);
        six   = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine  = findViewById(R.id.nine);
        zero  = findViewById(R.id.zero);
        point = findViewById(R.id.point);


        div   = findViewById(R.id.div);
        mul   = findViewById(R.id.multiplication);
        sub   = findViewById(R.id.minus);
        add   = findViewById(R.id.add);
        cancel= findViewById(R.id.cancel);
        point = findViewById(R.id.point);
        equal = findViewById(R.id.equal);
        cross = findViewById(R.id.cross);
        factorial = findViewById(R.id.factorial);
        squareRoot = findViewById(R.id.squareRoot);
        TV = findViewById(R.id.TV);

        //Button initialization finished

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display("1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display("2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display("3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display("4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display("5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display("6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display("7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display("8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display("9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display("0");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display("×");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display("÷");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display("-");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display("+");
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (n < 1) {
                    Display(".");
                    n++;
                }
                else {
                    Display("");
                }
            }
        });
        factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (n < 1) {
                    Display("!");
                    n++;
                }
                else {
                    Display("");
                }
            }
        });
        squareRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (n < 1) {
                    Display("√");
                    n++;
                }
                else {
                    Display("");
                }
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Clear();
            }
        });
        cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(disp.length() >1) {
                    disp = disp.substring(0, disp.length() - 1);
                    TV.setText(disp);
                }
                    else{
                        TV.setText("0");
                        disp=""; //disp STRING EMPTY KORE NILAM
                }
            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)  {
                text1[0]="0.0";


                /*  PROGRAM STARTS HERE */

                String text =TV.getText().toString();

                 /*      FACTORIAL ER JONW CODE       */

                if(text.charAt(text.length()-1) == '!') {



                    text = text.substring(0,text.length()-1);
                    text1[0] = String.valueOf(factorialF(text));
                    TV.setText(text1[0]);
                }
                   /*  FACTORIAL ER JONW CODE FINISH    */


                   /*   CODE FOR SQUARE ROOT    */
                else if(text.charAt(0)=='√') {
                    String s="";

                    for(int a=1;a<text.length();a++){
                    s +=text.charAt(a);
                    }
                    double d = squareRootF(s);
                    s = String.valueOf(d);
                    TV.setText(ZeroRemoverFromback(s));
                }
                /*  CODE FOR SQUARE ROOT FINISH HERE  */

                else {

                    split(text);
                /*  MATHEMATICAL OPERATIONS START HERE  */
                    int i = 0;
                    while (i <= operator.length - 5) {
                        int j = i;  //i ER VALUE J TE NIYE NILAM..JODI NICHER KNO CONDITION APPLY NA HOI TAHOLE i ER VALUE BAARBE AND NEXT OPERATOR CHECK KORBE
                        if (operator[i] == '÷') {
                            if (text1[i + 1].equals("0")) {
                                Toast.makeText(MainActivity.this,"Sorry! You Can not Divide By Zero",Toast.LENGTH_LONG).show();
                                    text1[0]="0.0";
                                   // text1[1+i] = "1";
                                    operator[i] = ' ';



                            } else {
                                text1[i] = String.valueOf(Double.parseDouble(text1[i]) / Double.parseDouble(text1[i + 1]));
                                for (int k = i + 1; k < operator.length - 5; k++) {
                                    text1[k] = text1[k + 1];
                                    operator[k - 1] = operator[k];
                                }
                            }


                            j = -1;   //i ER VALUE 0 KORE DILAM JAATE FULL OPERATOR ARRAY AGAIN VISIT KORTE PARE.
                        } else if (operator[i] == '×') {
                            text1[i] = String.valueOf(Double.parseDouble(text1[i]) * Double.parseDouble(text1[i + 1]));
                            for (int k = i + 1; k < operator.length; k++) {
                                text1[k] = text1[k + 1];
                                operator[k - 1] = operator[k];
                            }

                            j = -1;   //i ER VALUE 0 KORE DILAM JAATE FULL OPERATOR ARRAY AGAIN VISIT KORTE PARE.
                        }
                        i = j;
                        i++;
                    }
                    i = 0;
                    while (i <= operator.length - 5) {
                        int j = i;    //i ER VALUE J TE NIYE NILAM..JODI NICHER KNO CONDITION APPLY NA HOI TAHOLE i ER VALUE BAARBE AND NEXT OPERATOR CHECK KORBE
                        if (operator[i] == '-') {
                            text1[i] = String.valueOf(Double.parseDouble(text1[i]) - Double.parseDouble(text1[i + 1]));

                            for (int k = i + 1; k < operator.length - 5; k++) {
                                text1[k] = text1[k + 1];
                                operator[k - 1] = operator[k];
                            }
                            j = -1;   //i ER VALUE 0 KORE DILAM JAATE FULL OPERATOR ARRAY AGAIN VISIT KORTE PARE.
                        } else if (operator[i] == '+') {
                            text1[i] = String.valueOf(Double.parseDouble(text1[i]) + Double.parseDouble(text1[i + 1]));
                            for (int k = i + 1; k < operator.length; k++) {
                                text1[k] = text1[k + 1];
                                operator[k - 1] = operator[k];
                            }

                            j = -1; //i ER VALUE 0 KORE DILAM JAATE FULL OPERATOR ARRAY AGAIN VISIT KORTE PARE.
                        }
                        i = j;
                        i++;

                    }
                /*  MATHEMATICAL OPERATIONS END HERE    */



                    String l1 = ZeroRemoverFromback(text1[0]);

                    TV.setText(l1);


                /*  SETTING ALL VALUES TO NULL

                for(int k=0;k<text1.length;k++){
                    text1[k]="0";
                }
                /*  SETTING ALL VALUES TO NULL HAVE FINISHED  */
                    p = 0;


                }
            }
        });
    }
}

                    /*      DONE :-)    */

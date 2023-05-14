package com.example.tictactoe;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity
{
    public String sign = "X";
    public int check=0;
    androidx.appcompat.widget.AppCompatButton button1;
    androidx.appcompat.widget.AppCompatButton button2;
    androidx.appcompat.widget.AppCompatButton button3;
    androidx.appcompat.widget.AppCompatButton button4;
    androidx.appcompat.widget.AppCompatButton button5;
    androidx.appcompat.widget.AppCompatButton button6;
    androidx.appcompat.widget.AppCompatButton button7;
    androidx.appcompat.widget.AppCompatButton button8;
    androidx.appcompat.widget.AppCompatButton button9;

    androidx.appcompat.widget.AppCompatButton buttonPlay;
    androidx.appcompat.widget.AppCompatButton buttonRestart;
    androidx.appcompat.widget.AppCompatButton buttonClose;
    TextView result;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.ButtonFirst);
        button2 = findViewById(R.id.ButtonSecond);
        button3 = findViewById(R.id.ButtonThird);
        button4 = findViewById(R.id.ButtonFourth);
        button5 = findViewById(R.id.ButtonFifth);
        button6 = findViewById(R.id.ButtonSixth);
        button7 = findViewById(R.id.ButtonSeventh);
        button8 = findViewById(R.id.ButtonEighth);
        button9 = findViewById(R.id.ButtonNinth);
        buttonPlay = findViewById(R.id.ButtonPlay);
        buttonRestart = findViewById(R.id.ButtonRestart);
        buttonClose= findViewById(R.id.ButtonClose);
        result = findViewById(R.id.TextViewResult);

        disableAllButtons();

        buttonRestart.setEnabled(false);
        result.setVisibility(View.VISIBLE);
        result.setText(R.string.play_string);

        //Exit Button
        buttonClose.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                System.exit(0);

            }
        });

        //Restart Button
        buttonRestart.setOnClickListener(v->
        {
            button1.setText("");
            button2.setText("");
            button3.setText("");
            button4.setText("");
            button5.setText("");
            button6.setText("");
            button7.setText("");
            button8.setText("");
            button9.setText("");
            sign = "X";
            result.setVisibility(View.INVISIBLE);
            enableAllButtons();

            //Added code to make border on buttons

            button1.setBackgroundResource(R.drawable.button_outline_border);
            button2.setBackgroundResource(R.drawable.button_outline_border);
            button3.setBackgroundResource(R.drawable.button_outline_border);
            button4.setBackgroundResource(R.drawable.button_outline_border);
            button5.setBackgroundResource(R.drawable.button_outline_border);
            button6.setBackgroundResource(R.drawable.button_outline_border);
            button7.setBackgroundResource(R.drawable.button_outline_border);
            button8.setBackgroundResource(R.drawable.button_outline_border);
            button9.setBackgroundResource(R.drawable.button_outline_border);



        });


        button1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                check++;
                button1.setText(sign);
                button1.setEnabled(false);

                if(check>5)
                {
                    if(checkNotNull(button2) && checkNotNull(button3))
                    {
                        if(checkSign(button1,button3) && checkSign(button2,button3))
                        {
                            gameOver();
                            return;

                        }
                    }

                    if(checkNotNull(button4) && checkNotNull(button7))
                    {
                        if(checkSign(button1,button4) && checkSign(button1,button7) )
                        {
                            gameOver();
                            return;
                        }
                    }

                    if(checkNotNull(button5) && checkNotNull(button9))
                    {
                        if(checkSign(button1,button5) && checkSign(button1,button9))
                        {

                            gameOver();
                            return;
                        }
                    }
                    
                    checkSlotsFull();

                }


                changeSign();


            }

        });


        button2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                check++;
                button2.setText(sign);
                button2.setEnabled(false);
                if(check>5)
                {
                    if(checkNotNull(button1) && checkNotNull(button3))
                    {
                        if(checkSign(button1,button3) && checkSign(button2,button3))
                        {
                            gameOver();
                            return;

                        }
                    }

                    if(checkNotNull(button5) && checkNotNull(button8))
                    {
                        if(checkSign(button2,button5) && checkSign(button2,button8))
                        {
                           gameOver();
                            return;

                        }
                    }



                    checkSlotsFull();

                }

                changeSign();

            }

        });


        button3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                check++;
                button3.setText(sign);

                button3.setEnabled(false);

                if(check>5)
                {
                    if(checkNotNull(button2) && checkNotNull(button1))
                    {
                        if(checkSign(button1,button3) && checkSign(button2,button3))
                        {

                            gameOver();
                            return;

                        }
                    }

                    if(checkNotNull(button6) && checkNotNull(button9))
                    {
                        if(checkSign(button6,button3) && checkSign(button3,button9) )
                        {

                            gameOver();
                            return;

                        }
                    }

                    if(checkNotNull(button5) && checkNotNull(button7))
                    {
                        if(checkSign(button5,button3) && checkSign(button5,button7))
                        {

                            gameOver();
                            return;

                        }
                    }
                    checkSlotsFull();

                }

                changeSign();

            }

        });


        button4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                check++;
                button4.setText(sign);
                button4.setEnabled(false);
                if(check>5)
                {
                    if(checkNotNull(button1) && checkNotNull(button7))
                    {
                        if(checkSign(button1,button4) && checkSign(button4,button7))
                        {
                            gameOver();
                            return;

                        }
                    }

                    if(checkNotNull(button5) && checkNotNull(button6))
                    {
                        if(checkSign(button4,button5) && checkSign(button4,button6))
                        {
                            gameOver();
                            return;

                        }
                    }

                    checkSlotsFull();

                }

                changeSign();

            }

        });


        button5.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v)
            {
                check++;

                button5.setText(sign);
                button5.setEnabled(false);

                if(check>5)
                {
                    if(checkNotNull(button2) && checkNotNull(button8))
                    {
                        if(checkSign(button2,button5) && checkSign(button2,button8) )
                        {
                            gameOver();
                            return;

                        }
                    }

                    if(checkNotNull(button4) && checkNotNull(button6))
                    {
                        if(checkSign(button4,button6) && checkSign(button4,button5))
                        {
                            gameOver();
                            return;

                        }
                    }

                    if(checkNotNull(button1) && checkNotNull(button9))
                    {
                        if(checkSign(button1,button5) && checkSign(button1,button9))
                        {
                            gameOver();
                            return;

                        }
                    }
                    if(checkNotNull(button3) && checkNotNull(button7))
                    {
                        if(checkSign(button3,button5) && checkSign(button3,button7) )
                        {
                           gameOver();
                            return;

                        }
                    }

                    checkSlotsFull();

                }

                changeSign();
            }

        });


        button6.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                check++;
                button6.setText(sign);
                button6.setEnabled(false);
                if(check>5)
                {
                    if(checkNotNull(button3) && checkNotNull(button9))
                    {
                        if(checkSign(button9,button6) && checkSign(button6,button3))
                        {
                            gameOver();
                            return;

                        }
                    }
                    if(checkNotNull(button4) && checkNotNull(button5))
                    {
                        if(checkSign(button6,button5) && checkSign(button6,button4))
                        {
                           gameOver();
                            return;

                        }
                    }

                    checkSlotsFull();

                }

                changeSign();

            }

        });


        button7.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                check++;
                button7.setText(sign);
                button7.setEnabled(false);
                if(check>5)
                {
                    if(checkNotNull(button1) && checkNotNull(button4))
                    {
                        if(checkSign(button1,button4) && checkSign(button7,button1) )
                        {
                           gameOver();
                            return;

                        }
                    }
                    if(checkNotNull(button8) && checkNotNull(button9))
                    {
                        if(checkSign(button8,button9) && checkSign(button7,button9))
                        {
                            gameOver();
                            return;

                        }
                    }
                    if(checkNotNull(button5) && checkNotNull(button3))
                    {
                        if(checkSign(button5,button3) && checkSign(button7,button3))
                        {
                            gameOver();
                            return;

                        }
                    }

                    checkSlotsFull();

                }

                changeSign();

            }

        });


        button8.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                check++;

                button8.setText(sign);

                button8.setEnabled(false);
                if(check>5)
                {
                    if(checkNotNull(button7) && checkNotNull(button9))
                    {
                        if(checkSign(button7,button8) && checkSign(button8,button9) )
                        {
                            gameOver();
                            return;

                        }
                    }
                    if(checkNotNull(button5) && checkNotNull(button2))
                    {
                        if(checkSign(button8,button2) && checkSign(button2,button5))
                        {
                            gameOver();
                            return;

                        }
                    }

                    checkSlotsFull();

                }

                changeSign();
            }

        });


        button9.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                check++;
                button9.setText(sign);

                button9.setEnabled(false);
                if(check>5)
                {
                    if(checkNotNull(button3) && checkNotNull(button6))
                    {
                        if(checkSign(button9,button6) && checkSign(button6,button3))
                        {
                            gameOver();
                            return;

                        }
                    }
                    if(checkNotNull(button7) && checkNotNull(button8))
                    {
                        if(checkSign(button7,button8) && checkSign(button8,button9) )
                        {
                            gameOver();
                            return;

                        }
                    }
                    if(checkNotNull(button5) && checkNotNull(button1))
                    {
                        if(checkSign(button1,button5) && checkSign(button5,button9))
                        {
                            gameOver();
                            return;

                        }
                    }
                    checkSlotsFull();

                }

                changeSign();

            }

        });




        buttonPlay.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

                enableAllButtons();
                result.setVisibility(View.INVISIBLE);
                buttonRestart.setEnabled(true);
                buttonPlay.setEnabled(false);

                //Added code for border in the buttons

                button1.setBackgroundResource(R.drawable.button_outline_border);
                button2.setBackgroundResource(R.drawable.button_outline_border);
                button3.setBackgroundResource(R.drawable.button_outline_border);
                button4.setBackgroundResource(R.drawable.button_outline_border);
                button5.setBackgroundResource(R.drawable.button_outline_border);
                button6.setBackgroundResource(R.drawable.button_outline_border);
                button7.setBackgroundResource(R.drawable.button_outline_border);
                button8.setBackgroundResource(R.drawable.button_outline_border);
                button9.setBackgroundResource(R.drawable.button_outline_border);


            }
        });
    }

    public void enableAllButtons()
    {
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);

    }

    public void disableAllButtons()
    {
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
    }


    public void changeSign()
    {
        if(sign.equals("X"))
        {
            sign="O";
        }
        else
        {
            sign="X";
        }

    }

    public void gameOver()
    {
        result.setText(getString(R.string.win_statement,sign));
        result.setVisibility(View.VISIBLE);

       disableAllButtons();

       if(button1.getText().toString().equals(""))
       {
           button1.setText("*");
       }

        if(button2.getText().toString().equals(""))
        {
            button2.setText("*");
        }
        if(button3.getText().toString().equals(""))
        {
            button3.setText("*");
        }
        if(button4.getText().toString().equals(""))
        {
            button4.setText("*");
        }
        if(button5.getText().toString().equals(""))
        {
            button5.setText("*");
        }
        if(button6.getText().toString().equals(""))
        {
            button6.setText("*");
        }
        if(button7.getText().toString().equals(""))
        {
            button7.setText("*");
        }
        if(button8.getText().toString().equals(""))
        {
            button8.setText("*");
        }
        if(button9.getText().toString().equals(""))
        {
            button9.setText("*");
        }

    }
    public void checkSlotsFull()
    {
        if(button1.getText().toString().length() !=0 && button2.getText().toString().length() !=0 && button3.getText().toString().length() !=0  && button4.getText().toString().length() != 0 && button5.getText().toString().length() != 0 && button6.getText().toString().length() != 0  && button7.getText().toString().length() != 0  && button8.getText().toString().length() != 0  && button9.getText().toString().length() != 0 )
        {
            result.setVisibility(View.VISIBLE);
            result.setText(R.string.no_win_statement);
        }

    }
    public boolean checkNotNull(androidx.appcompat.widget.AppCompatButton btnCheckNull)
    {
        if(btnCheckNull.getText()!=null)
        {
            return true;
        }
        return false;
    }

    public boolean checkSign(androidx.appcompat.widget.AppCompatButton checkBtn1, androidx.appcompat.widget.AppCompatButton checkBtn2)
    {
        if(checkBtn1.getText().toString().equals(checkBtn2.getText().toString()))
        {
            return  true;
        }
        return false;
    }
}
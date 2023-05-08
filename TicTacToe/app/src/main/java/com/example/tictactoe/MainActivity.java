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
    TextView  result;

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

        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
        buttonRestart.setEnabled(false);

        result.setVisibility(View.VISIBLE);
        result.setText("Tap Play Button to Start.");
        buttonClose.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                System.exit(0);

            }
        });

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
            button1.setEnabled(true);
            button2.setEnabled(true);
            button3.setEnabled(true);
            button4.setEnabled(true);
            button5.setEnabled(true);
            button6.setEnabled(true);
            button7.setEnabled(true);
            button8.setEnabled(true);
            button9.setEnabled(true);
            sign = "X";
            result.setVisibility(View.INVISIBLE);

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
                    if(button2.getText() != null && button3.getText()!=null)
                    {
                        if(button1.getText().toString().equals(button3.getText().toString()) && button2.getText().toString().equals(button3.getText().toString()) )
                        {
                            result.setText(sign + " Wins. Game Over. Tap on Restart.");
                            result.setVisibility(View.VISIBLE);
                            gameOver();
                            return;

                        }
                    }

                    if(button4.getText() != null && button7.getText()!=null)
                    {
                        if(button1.getText().toString().equals(button4.getText().toString()) && button1.getText().toString().equals(button7.getText().toString()) )
                        {
                            result.setText(sign + " Wins. Game Over. Tap on Restart.");
                            result.setVisibility(View.VISIBLE);
                            gameOver();
                            return;
                        }
                    }

                    if(button5.getText() != null && button9.getText()!=null)
                    {
                        if(button1.getText().toString().equals(button5.getText().toString()) && button1.getText().toString().equals(button9.getText().toString()) )
                        {
                            result.setText(sign + " Wins. Game Over. Tap on Restart.");
                            result.setVisibility(View.VISIBLE);
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
                    if(button1.getText() != null && button3.getText()!=null)
                    {
                        if(button1.getText().toString().equals(button3.getText().toString()) && button2.getText().toString().equals(button3.getText().toString()) )
                        {
                            result.setText(sign + " Wins. Game Over. Tap on Restart.");
                            result.setVisibility(View.VISIBLE);
                            gameOver();
                            return;

                        }
                    }

                    if(button5.getText() != null && button8.getText()!=null)
                    {
                        if(button2.getText().toString().equals(button5.getText().toString()) && button2.getText().toString().equals(button8.getText().toString()) )
                        {
                            result.setText(sign + " Wins. Game Over. Tap on Restart.");
                            result.setVisibility(View.VISIBLE);
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
                    if(button2.getText() != null && button1.getText()!=null)
                    {
                        if(button1.getText().toString().equals(button3.getText().toString()) && button2.getText().toString().equals(button3.getText().toString()) )
                        {
                            result.setText(sign + " Wins. Game Over. Tap on Restart.");
                            result.setVisibility(View.VISIBLE);
                            gameOver();
                            return;

                        }
                    }

                    if(button6.getText() != null && button9.getText()!=null)
                    {
                        if(button3.getText().toString().equals(button6.getText().toString()) && button3.getText().toString().equals(button9.getText().toString()) )
                        {
                            result.setText(sign + " Wins. Game Over. Tap on Restart.");
                            result.setVisibility(View.VISIBLE);
                            gameOver();
                            return;

                        }
                    }

                    if(button5.getText() != null && button7.getText()!=null)
                    {
                        if(button3.getText().toString().equals(button5.getText().toString()) && button5.getText().toString().equals(button7.getText().toString()) )
                        {
                            result.setText(sign + " Wins. Game Over. Tap on Restart.");
                            result.setVisibility(View.VISIBLE);
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
                    if(button1.getText() != null && button7.getText()!=null)
                    {
                        if(button1.getText().toString().equals(button4.getText().toString()) && button4.getText().toString().equals(button7.getText().toString()) )
                        {
                            result.setText(sign + " Wins. Game Over. Tap on Restart.");
                            result.setVisibility(View.VISIBLE);
                            gameOver();
                            return;

                        }
                    }

                    if(button5.getText() != null && button6.getText()!=null)
                    {
                        if(button5.getText().toString().equals(button4.getText().toString()) && button4.getText().toString().equals(button6.getText().toString()) )
                        {
                            result.setText(sign + " Wins. Game Over. Tap on Restart.");
                            result.setVisibility(View.VISIBLE);
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
                    if(button2.getText() != null && button8.getText()!=null)
                    {
                        if(button2.getText().toString().equals(button5.getText().toString()) && button2.getText().toString().equals(button8.getText().toString()) )
                        {
                            result.setText(sign + " Wins. Game Over. Tap on Restart.");
                            result.setVisibility(View.VISIBLE);
                            gameOver();
                            return;

                        }
                    }

                    if(button4.getText() != null && button6.getText()!=null)
                    {
                        if(button4.getText().toString().equals(button6.getText().toString()) && button4.getText().toString().equals(button5.getText().toString()) )
                        {
                            result.setText(sign + " Wins. Game Over. Tap on Restart.");
                            result.setVisibility(View.VISIBLE);
                            gameOver();
                            return;

                        }
                    }

                    if(button1.getText() != null && button9.getText()!=null)
                    {
                        if(button1.getText().toString().equals(button5.getText().toString()) && button1.getText().toString().equals(button9.getText().toString()) )
                        {
                            result.setText(sign + " Wins. Game Over. Tap on Restart.");
                            result.setVisibility(View.VISIBLE);
                            gameOver();
                            return;

                        }
                    }
                    if(button3.getText() != null && button7.getText()!=null)
                    {
                        if(button3.getText().toString().equals(button5.getText().toString()) && button3.getText().toString().equals(button7.getText().toString()) )
                        {
                            result.setText(sign + " Wins. Game Over. Tap on Restart.");
                            result.setVisibility(View.VISIBLE);
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
                    if(button3.getText() != null && button9.getText()!=null)
                    {
                        if(button6.getText().toString().equals(button9.getText().toString()) && button6.getText().toString().equals(button3.getText().toString()) )
                        {
                            result.setText(sign + " Wins. Game Over. Tap on Restart.");
                            result.setVisibility(View.VISIBLE);
                            gameOver();
                            return;

                        }
                    }
                    if(button4.getText() != null && button5.getText()!=null)
                    {
                        if(button6.getText().toString().equals(button5.getText().toString()) && button6.getText().toString().equals(button4.getText().toString()) )
                        {
                            result.setText(sign + " Wins. Game Over. Tap on Restart.");
                            result.setVisibility(View.VISIBLE);
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
                    if(button1.getText() != null && button4.getText()!=null)
                    {
                        if(button1.getText().toString().equals(button4.getText().toString()) && button7.getText().toString().equals(button1.getText().toString()) )
                        {
                            result.setText(sign + " Wins. Game Over. Tap on Restart.");
                            result.setVisibility(View.VISIBLE);
                            gameOver();
                            return;

                        }
                    }
                    if(button8.getText() != null && button9.getText()!=null)
                    {
                        if(button8.getText().toString().equals(button9.getText().toString()) && button7.getText().toString().equals(button9.getText().toString()) )
                        {
                            result.setText(sign + " Wins. Game Over. Tap on Restart.");
                            result.setVisibility(View.VISIBLE);
                            gameOver();
                            return;

                        }
                    }
                    if(button5.getText() != null && button3.getText()!=null)
                    {
                        if(button3.getText().toString().equals(button5.getText().toString()) && button3.getText().toString().equals(button7.getText().toString()) )
                        {
                            result.setText(sign + " Wins. Game Over. Tap on Restart.");
                            result.setVisibility(View.VISIBLE);
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
                    if(button7.getText() != null && button9.getText()!=null)
                    {
                        if(button7.getText().toString().equals(button8.getText().toString()) && button8.getText().toString().equals(button9.getText().toString()) )
                        {
                            result.setText(sign + " Wins. Game Over. Tap on Restart.");
                            result.setVisibility(View.VISIBLE);
                            gameOver();
                            return;

                        }
                    }
                    if(button2.getText() != null && button5.getText()!=null)
                    {
                        if(button5.getText().toString().equals(button2.getText().toString()) && button2.getText().toString().equals(button8.getText().toString()) )
                        {
                            result.setText(sign + " Wins. Game Over. Tap on Restart.");
                            result.setVisibility(View.VISIBLE);
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
                    if(button3.getText() != null && button6.getText()!=null)
                    {
                        if(button6.getText().toString().equals(button3.getText().toString()) && button6.getText().toString().equals(button9.getText().toString()) )
                        {
                            result.setText(sign + " Wins. Game Over. Tap on Restart.");
                            result.setVisibility(View.VISIBLE);
                            gameOver();
                            return;

                        }
                    }
                    if(button7.getText() != null && button8.getText()!=null)
                    {
                        if(button7.getText().toString().equals(button8.getText().toString()) && button8.getText().toString().equals(button9.getText().toString()) )
                        {
                            result.setText(sign + " Wins. Game Over. Tap on Restart.");
                            result.setVisibility(View.VISIBLE);
                            gameOver();
                            return;

                        }
                    }
                    if(button1.getText() != null && button5.getText()!=null)
                    {
                        if(button1.getText().toString().equals(button5.getText().toString()) && button5.getText().toString().equals(button9.getText().toString()) )
                        {
                            result.setText(sign + " Wins. Game Over.Tap on Restart.");
                            result.setVisibility(View.VISIBLE);
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

                button1.setEnabled(true);
//                button1.setBackgroundColor(getColor(R.color.boxColor));

                button2.setEnabled(true);
//                button2.setBackgroundColor(getColor(R.color.boxColor);

                button3.setEnabled(true);
//                button3.setBackgroundColor(getColor(R.color.boxColor));

                button4.setEnabled(true);
//                button4.setBackgroundColor(getColor(R.color.boxColor));

                button5.setEnabled(true);
//                button5.setBackgroundColor(getColor(R.color.boxColor));

                button6.setEnabled(true);
//                button6.setBackgroundColor(getColor(R.color.boxColor));

                button7.setEnabled(true);
//                button7.setBackgroundColor(getColor(R.color.boxColor));

                button8.setEnabled(true);
//                button8.setBackgroundColor(getColor(R.color.boxColor));

                button9.setEnabled(true);
//                button9.setBackgroundColor(getColor(R.color.boxColor));

                result.setVisibility(View.INVISIBLE);
                buttonRestart.setEnabled(true);
                buttonPlay.setEnabled(false);

                return;
            }
        });
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
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);


        if(button1.getText().toString().equals("X") ||  button1.getText().toString().equals("O"))
        {
                //Left Intentionally
        }
        else
        {
            button1.setText("*");
        }
        if(button2.getText().toString().equals("X") || button2.getText().toString().equals("O"))
        {

        }
        else
        {
            button2.setText("*");
        }
        if(button3.getText().toString().equals("X") || button3.getText().toString().equals("O"))
        {

        }
        else
        {
            button3.setText("*");
        }
    if(button4.getText().toString().equals("X") || button4.getText().toString().equals("O"))
    {

    }
    else
    {
        button4.setText("*");
    }
    if(button5.getText().toString().equals("X") || button5.getText().toString().equals("O"))
    {

    }
    else
    {
        button5.setText("*");
    }
    if(button6.getText().toString().equals("X") || button6.getText().toString().equals("O"))
    {

    }
    else
    {
        button6.setText("*");
    }
    if(button7.getText().toString().equals("X") || button7.getText().toString().equals("O"))
    {

    }
    else
    {
        button7.setText("*");
    }
    if(button8.getText().toString().equals("X") || button8.getText().toString().equals("O"))
    {

    }
    else
    {
        button8.setText("*");
    }
    if(button9.getText().toString().equals("X") || button9.getText().toString().equals("O"))
    {

    }
    else
    {
        button9.setText("*");
    }

        return;
    }

    public void checkSlotsFull()
    {
        if(button1.getText().toString().length() !=0 && button2.getText().toString().length() !=0 && button3.getText().toString().length() !=0  && button4.getText().toString().length() != 0 && button5.getText().toString().length() != 0 && button6.getText().toString().length() != 0  && button7.getText().toString().length() != 0  && button8.getText().toString().length() != 0  && button9.getText().toString().length() != 0 )
        {
            result.setVisibility(View.VISIBLE);
            result.setText("No winner. Tap on Restart Button.");
        }
        return;
    }

}
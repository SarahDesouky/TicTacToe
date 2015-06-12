package com.example.sarah.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.sarah.ticktacktoe.R;


public class MainActivity extends Activity {

    static int count = 0;
    //boolean flags to check if button is pressed
    boolean c00;
    boolean c10;
    boolean c20;
    boolean c01;
    boolean c11;
    boolean c21;
    boolean c02;
    boolean c12;
    boolean c22;
    int t00 = -1;
    int t10=-1;
    int t20 = -1;
    int t01 = -1;
    int t11 = -1;
    int t21 = -1;
    int t02 = -1;
    int t12 = -1;
    int t22 = -1;
    boolean gameOver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageButton celli00 = (ImageButton)findViewById(R.id.b00);
        final ImageButton celli10 = (ImageButton)findViewById(R.id.b10);
        final ImageButton celli20 = (ImageButton)findViewById(R.id.b20);

        final ImageButton celli01 = (ImageButton)findViewById(R.id.b01);
        final ImageButton celli11 = (ImageButton)findViewById(R.id.b11);
        final ImageButton celli21 = (ImageButton)findViewById(R.id.b21);

        final ImageButton celli02 = (ImageButton)findViewById(R.id.b02);
        final ImageButton celli12 = (ImageButton)findViewById(R.id.b12);
        final ImageButton celli22 = (ImageButton)findViewById(R.id.b22);







        View.OnClickListener myListener = new View.OnClickListener() {
            public void onClick(View v) {

                if (!gameOver) {
                    switch (v.getId()) {
                        case R.id.b00:
                            if (!c00) {
                                count++;
                                c00 = true;
                                if (count % 2 == 0) {
                                    t00 = 1;
                                    celli00.setImageResource(R.drawable.x1);
                                } else {
                                    t00 = 0;
                                    celli00.setImageResource(R.drawable.o);
                                }
                            }
                            break;
                        case R.id.b10:
                            if (!c10) {
                                count++;
                                c10 = true;
                                if (count % 2 == 0) {
                                    t10 = 1;
                                    celli10.setImageResource(R.drawable.x1);
                                } else {
                                    t10 = 0;
                                    celli10.setImageResource(R.drawable.o);
                                }
                            }
                            break;
                        case R.id.b20:
                            if (!c20) {
                                count++;
                                c20 = true;
                                if (count % 2 == 0) {
                                    t20 = 1;
                                    celli20.setImageResource(R.drawable.x1);
                                } else {
                                    t20 = 0;
                                    celli20.setImageResource(R.drawable.o);
                                }
                            }
                            break;
                        case R.id.b01:
                            if (!c01) {
                                count++;
                                c01 = true;
                                if (count % 2 == 0) {
                                    t01 = 1;
                                    celli01.setImageResource(R.drawable.x1);
                                } else {
                                    t01 = 0;
                                    celli01.setImageResource(R.drawable.o);
                                }
                            }
                            break;
                        case R.id.b11:
                            if (!c11) {
                                count++;
                                c11 = true;
                                if (count % 2 == 0) {
                                    t11 = 1;
                                    celli11.setImageResource(R.drawable.x1);
                                } else {
                                    t11 = 0;
                                    celli11.setImageResource(R.drawable.o);
                                }
                            }
                            break;
                        case R.id.b21:
                            if (!c21) {
                                count++;
                                c21 = true;
                                if (count % 2 == 0) {
                                    t21 = 1;
                                    celli21.setImageResource(R.drawable.x1);
                                } else {
                                    t21 = 0;
                                    celli21.setImageResource(R.drawable.o);
                                }
                            }
                            break;
                        case R.id.b02:
                            if (!c02) {
                                count++;
                                c02 = true;
                                if (count % 2 == 0) {
                                    t02 = 1;
                                    celli02.setImageResource(R.drawable.x1);
                                } else {
                                    t02 = 0;
                                    celli02.setImageResource(R.drawable.o);
                                }
                            }
                            break;
                        case R.id.b12:
                            if (!c12) {
                                count++;
                                c12 = true;
                                if (count % 2 == 0) {
                                    t12 = 1;
                                    celli12.setImageResource(R.drawable.x1);
                                } else {
                                    t12 = 0;
                                    celli12.setImageResource(R.drawable.o);
                                }
                            }
                            break;
                        case R.id.b22:
                            if (!c22) {
                                count++;
                                c22 = true;
                                if (count % 2 == 0) {
                                    t22 = 1;
                                    celli22.setImageResource(R.drawable.x1);
                                } else {
                                    t22 = 0;
                                    celli22.setImageResource(R.drawable.o);
                                }
                            }
                            break;

                    }

                    checkWinO(v);
                    checkWinX(v);
                }
                if(count==9 &&!gameOver) {
                    final TextView text = (TextView)findViewById(R.id.text);
                    text.setText("No one wins!");
                    gameOver = true;
                }
            }

        };


        View.OnClickListener myListenererase = new View.OnClickListener() {
            public void onClick(View v) {
                    count = 0;
                    c00 = false;
                    c10 = false;
                    c20 = false;
                    c01 = false;
                    c11 = false;
                    c21 = false;
                    c02 = false;
                    c12 = false;
                    c22 = false;
                    gameOver = false;
                    t00 = -1;
                    t10 = -1;
                    t20 = -1;
                    t01 = -1;
                    t11 = -1;
                    t21 = -1;
                    t02 = -1;
                    t12 = -1;
                    t22 = -1;
                final TextView text = (TextView)findViewById(R.id.text);
                text.setText("");
                    celli00.setImageResource(0);
                    celli10.setImageResource(0);
                    celli20.setImageResource(0);
                    celli01.setImageResource(0);
                    celli11.setImageResource(0);
                    celli21.setImageResource(0);
                    celli02.setImageResource(0);
                    celli12.setImageResource(0);
                    celli22.setImageResource(0);


            }
        };

        celli00.setOnClickListener(myListener);
        celli01.setOnClickListener(myListener);
        celli02.setOnClickListener(myListener);
        celli10.setOnClickListener(myListener);
        celli11.setOnClickListener(myListener);
        celli12.setOnClickListener(myListener);
        celli20.setOnClickListener(myListener);
        celli21.setOnClickListener(myListener);
        celli22.setOnClickListener(myListener);



        final Button newGame = (Button) findViewById(R.id.ng);
        newGame.setOnClickListener(myListenererase);


    }

    public void checkWinX(View v){

        if ( (t00==1 && t00==t10 && t10==t20) || (t01 ==1 && t01==t11 && t11==t21) || (t02==1 && t02==t12 && t12==t22) ||
                (t00==1 && t00== t01 && t01==t02) || (t10==1 && t10==t11 && t11==t12) || (t20==1 && t20==t21 && t21==t22) ||
                (t00==1 && t00==t11 && t11==t22) || (t20==1 && t20==t11 && t11==t02) ) {
            final TextView text = (TextView)findViewById(R.id.text);
            text.setText("X is the WINNER!");
            gameOver=true;
        }
    }

    public void checkWinO(View v) {

        if ((t00 == 0 && t00 == t10 && t10 == t20) || (t01 == 0 && t01 == t11 && t11 == t21) || (t02 == 0 && t02 == t12 && t12 == t22) ||
                (t00 == 0 && t00 == t01 && t01 == t02) || (t10 == 0 && t10 == t11 && t11 == t12) || (t20 == 0 && t20 == t21 && t21 == t22) ||
                (t00 == 0 && t00 == t11 && t11 == t22) || (t20 == 0 && t20 == t11 && t11 == t02)) {
            final TextView text = (TextView) findViewById(R.id.text);
            text.setText("O is the WINNER!");
            gameOver = true;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    
}

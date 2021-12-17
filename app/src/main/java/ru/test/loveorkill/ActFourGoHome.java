package ru.test.loveorkill;

import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ActFourGoHome extends AppCompatActivity {

    TableFourGoHome tableFourGoHome = new TableFourGoHome();
    Delay delay = new Delay();
    public Animation a;
    public TextView textView1;
    public TextView textView2;
    public TextView textView3;
    public TextView textView4;
    public TextView textView5;
    public ImageView imageView6;
    public TextView textView7;
    public TextView textView8;
    public TextView textView9;
    public Button ActFourCallOutButton;
    public Button ActFourCallPoliceButton;
    public TextView textView11;
    public Button ActFourCallPoliceTwoButton;
    public TextView textView13;
    public Button ActFourNextButton;
    public int line=0;
    public int counterFirst=0;
    public int counterSecond=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_four_go_home);
        final TextView textView1 = (TextView)findViewById(R.id.textView1);
        final TextView textView2 = (TextView)findViewById(R.id.textView2);
        final TextView textView3 = (TextView)findViewById(R.id.textView3);
        final TextView textView4 = (TextView)findViewById(R.id.textView4);
        final TextView textView5 = (TextView)findViewById(R.id.textView5);
        final ImageView imageView6 = (ImageView)findViewById(R.id.imageView6);
        final TextView textView7 = (TextView)findViewById(R.id.textView7);
        final TextView textView8 = (TextView)findViewById(R.id.textView8);
        final TextView textView9 = (TextView)findViewById(R.id.textView9);
        final Button ActFourCallOutButton = (Button)findViewById(R.id.ActFourCallOutButton);
        final Button ActFourCallPoliceButton = (Button)findViewById(R.id.ActFourCallPoliceButton);
        final TextView textView11 = (TextView)findViewById(R.id.textView11);
        final Button ActFourCallPoliceTwoButton = (Button)findViewById(R.id.ActFourCallPoliceTwoButton);
        final TextView textView13 = (TextView)findViewById(R.id.textView13);
        final Button ActFourNextButton = (Button)findViewById(R.id.ActFourNextButton);

        textView1.setText(tableFourGoHome.dialogFourthGoHome[0]);
        textView2.setText(tableFourGoHome.dialogFourthGoHome[1]);
        textView3.setText(tableFourGoHome.dialogFourthGoHome[2]);
        textView4.setText(tableFourGoHome.dialogFourthGoHome[3]);
        textView5.setText(tableFourGoHome.dialogFourthGoHome[4]);
        textView7.setText(tableFourGoHome.dialogFourthGoHome[6]);
        textView8.setText(tableFourGoHome.dialogFourthGoHome[7]);
        textView9.setText(tableFourGoHome.dialogFourthGoHome[8]);
        textView11.setText(tableFourGoHome.dialogFourthGoHome[10]);
        textView13.setText(tableFourGoHome.dialogFourthGoHome[12]);

        //Внизу будет код, который прячет текст

        textView1.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        textView3.setVisibility(View.INVISIBLE);
        textView4.setVisibility(View.INVISIBLE);
        textView5.setVisibility(View.INVISIBLE);
        imageView6.setVisibility(View.INVISIBLE);
        textView7.setVisibility(View.INVISIBLE);
        textView8.setVisibility(View.INVISIBLE);
        textView9.setVisibility(View.INVISIBLE);
        ActFourCallOutButton.setVisibility(View.INVISIBLE);
        ActFourCallPoliceButton.setVisibility(View.INVISIBLE);
        textView11.setVisibility(View.INVISIBLE);
        ActFourCallPoliceTwoButton.setVisibility(View.INVISIBLE);
        textView13.setVisibility(View.INVISIBLE);
        ActFourNextButton.setVisibility(View.INVISIBLE);

        //Наверху код, который прячет текст

        //Команда, которая запускает AsyncTask
        delay.execute();

    }

    //кнопка "Назад", которая закрывает игру
    @Override
    public void onBackPressed(){
        delay.cancel(true);
        delay=null;
        try {
            Intent intent = new Intent(ActFourGoHome.this, MainActivity.class);startActivity(intent);finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finish();
    }

    // С этого места начинается код AsyncTask
    class Delay extends AsyncTask<Void, Integer, Void> {

        @Override
        protected Void doInBackground(Void... params){
            while (line<=13){
                if(counterFirst==0 & line==10){
                    line=10;
                    if(isCancelled()) return null;
                } else if(counterSecond==0 & line==12){
                    line=12;
                    if(isCancelled()) return null;
                } else {
                publishProgress(line++);
                try{
                    Thread.sleep(5000);
                    if (isCancelled()) return null;
                }catch(Exception e){}
            }}
            return null;
        }

        @Override
        protected void onProgressUpdate (Integer... values){

            final TextView textView1 = (TextView)findViewById(R.id.textView1);
            final TextView textView2 = (TextView)findViewById(R.id.textView2);
            final TextView textView3 = (TextView)findViewById(R.id.textView3);
            final TextView textView4 = (TextView)findViewById(R.id.textView4);
            final TextView textView5 = (TextView)findViewById(R.id.textView5);
            final ImageView imageView6 = (ImageView)findViewById(R.id.imageView6);
            final TextView textView7 = (TextView)findViewById(R.id.textView7);
            final TextView textView8 = (TextView)findViewById(R.id.textView8);
            final TextView textView9 = (TextView)findViewById(R.id.textView9);
            final Button ActFourCallOutButton = (Button)findViewById(R.id.ActFourCallOutButton);
            final Button ActFourCallPoliceButton = (Button)findViewById(R.id.ActFourCallPoliceButton);
            final TextView textView11 = (TextView)findViewById(R.id.textView11);
            final Button ActFourCallPoliceTwoButton = (Button)findViewById(R.id.ActFourCallPoliceTwoButton);
            final TextView textView13 = (TextView)findViewById(R.id.textView13);
            final Button ActFourNextButton = (Button)findViewById(R.id.ActFourNextButton);

            final Animation a = AnimationUtils.loadAnimation(ActFourGoHome.this, R.anim.alpha);

            switch(line){
                case 1: textView1.setVisibility(View.VISIBLE); textView1.startAnimation(a); break;
                case 2: textView2.setVisibility(View.VISIBLE); textView2.startAnimation(a); break;
                case 3: textView3.setVisibility(View.VISIBLE); textView3.startAnimation(a); break;
                case 4: textView4.setVisibility(View.VISIBLE); textView4.startAnimation(a); break;
                case 5: textView5.setVisibility(View.VISIBLE); textView5.startAnimation(a); break;
                case 6: imageView6.setVisibility(View.VISIBLE); imageView6.startAnimation(a); break;
                case 7: textView7.setVisibility(View.VISIBLE); textView7.startAnimation(a); break;
                case 8: textView8.setVisibility(View.VISIBLE); textView8.startAnimation(a); break;
                case 9: textView9.setVisibility(View.VISIBLE); textView9.startAnimation(a); break;
                case 10: ActFourCallOutButton.setVisibility(View.VISIBLE); ActFourCallOutButton.startAnimation(a);
                    ActFourCallOutButton.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            try {
                                if (counterFirst == 0) {
                                    ActFourCallOutButton.setBackgroundColor(Color.parseColor("#56b1b5"));
                                    ActFourCallPoliceButton.setVisibility(View.GONE);
                                    counterFirst = 1;
                                }
                            } catch (Exception e){

                            }
                        }
                    });
                    ActFourCallPoliceButton.setVisibility(View.VISIBLE); ActFourCallPoliceButton.startAnimation(a);
                    ActFourCallPoliceButton.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            try {
                                if (counterFirst == 0) {
                                    ActFourCallPoliceButton.setBackgroundColor(Color.parseColor("#56b1b5"));
                                    ActFourCallPoliceTwoButton.setVisibility(View.GONE);
                                    line = line + 2;
                                    counterFirst = 1;
                                    counterSecond = 1;
                                }
                            } catch (Exception e){

                            }
                        }
                    });break;
                case 11: textView11.setVisibility(View.VISIBLE); textView11.startAnimation(a); break;
                case 12: ActFourCallPoliceTwoButton.setVisibility(View.VISIBLE); ActFourCallPoliceTwoButton.startAnimation(a);
                    ActFourCallPoliceTwoButton.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            try {
                                if (counterSecond == 0) {
                                    ActFourCallPoliceTwoButton.setBackgroundColor(Color.parseColor("#56b1b5"));
                                    counterSecond = 1;
                                }
                            } catch (Exception e){

                            }
                        }
                    });break;
                case 13: textView13.setVisibility(View.VISIBLE); textView13.startAnimation(a); break;
                case 14:  ActFourNextButton.setVisibility(View.VISIBLE); ActFourNextButton.startAnimation(a);
                    ActFourNextButton.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            try {
                                Intent intent = new Intent(ActFourGoHome.this, ActFivePolice.class);startActivity(intent);finish();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });break;
                default: break;

            }


        }

    }
    // На этом месте заканчивается код AsyncTask
}

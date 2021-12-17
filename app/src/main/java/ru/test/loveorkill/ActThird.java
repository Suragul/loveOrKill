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

public class ActThird extends AppCompatActivity {

    TableThird tableThird = new TableThird();
    Delay delay = new Delay();
    public Animation a;
    public TextView textView1;
    public TextView textView2;
    public TextView textView3;
    public TextView textView4;
    public TextView textView5;
    public TextView textView6;
    public TextView textView7;
    public Button ActThirdGoPathButton;
    public Button ActThirdCallOutButton;
    public TextView textView9;
    public TextView textView10;
    public TextView textView11;
    public TextView textView12;
    public TextView textView13;
    public Button ActThirdKeepGoingButton;
    public Button ActThirdGoHomeButton;
    public int line=0;
    public int counterFirst=0;
    public int counterSecond=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_third);
        final TextView textView1 = (TextView)findViewById(R.id.textView1);
        final TextView textView2 = (TextView)findViewById(R.id.textView2);
        final TextView textView3 = (TextView)findViewById(R.id.textView3);
        final TextView textView4 = (TextView)findViewById(R.id.textView4);
        final TextView textView5 = (TextView)findViewById(R.id.textView5);
        final TextView textView6 = (TextView)findViewById(R.id.textView6);
        final TextView textView7 = (TextView)findViewById(R.id.textView7);
        final Button ActThirdGoPathButton = (Button)findViewById(R.id.ActThirdGoPathButton);
        final Button ActThirdCallOutButton = (Button)findViewById(R.id.ActThirdCallOutButton);
        final TextView textView9 = (TextView)findViewById(R.id.textView9);
        final TextView textView10 = (TextView)findViewById(R.id.textView10);
        final TextView textView11 = (TextView)findViewById(R.id.textView11);
        final TextView textView12 = (TextView)findViewById(R.id.textView12);
        final TextView textView13 = (TextView)findViewById(R.id.textView13);
        final Button ActThirdKeepGoingButton = (Button)findViewById(R.id.ActThirdKeepGoingButton);
        final Button ActThirdGoHomeButton = (Button)findViewById(R.id.ActThirdGoHomeButton);

        textView1.setText(tableThird.dialogThird[0]);
        textView2.setText(tableThird.dialogThird[1]);
        textView3.setText(tableThird.dialogThird[2]);
        textView4.setText(tableThird.dialogThird[3]);
        textView5.setText(tableThird.dialogThird[4]);
        textView6.setText(tableThird.dialogThird[5]);
        textView7.setText(tableThird.dialogThird[6]);
        textView9.setText(tableThird.dialogThird[8]);
        textView10.setText(tableThird.dialogThird[9]);
        textView11.setText(tableThird.dialogThird[10]);
        textView12.setText(tableThird.dialogThird[11]);
        textView13.setText(tableThird.dialogThird[12]);

        //Внизу будет код, который прячет текст

        textView1.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        textView3.setVisibility(View.INVISIBLE);
        textView4.setVisibility(View.INVISIBLE);
        textView5.setVisibility(View.INVISIBLE);
        textView6.setVisibility(View.INVISIBLE);
        textView7.setVisibility(View.INVISIBLE);
        ActThirdGoPathButton.setVisibility(View.INVISIBLE);
        ActThirdCallOutButton.setVisibility(View.INVISIBLE);
        textView9.setVisibility(View.INVISIBLE);
        textView10.setVisibility(View.INVISIBLE);
        textView11.setVisibility(View.INVISIBLE);
        textView12.setVisibility(View.INVISIBLE);
        textView13.setVisibility(View.INVISIBLE);
        ActThirdKeepGoingButton.setVisibility(View.INVISIBLE);
        ActThirdGoHomeButton.setVisibility(View.INVISIBLE);

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
            Intent intent = new Intent(ActThird.this, MainActivity.class);startActivity(intent);finish();
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
                if(counterFirst==0 & line==8){
                    line=8;
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
            final TextView textView6 = (TextView)findViewById(R.id.textView6);
            final TextView textView7 = (TextView)findViewById(R.id.textView7);
            final Button ActThirdGoPathButton = (Button)findViewById(R.id.ActThirdGoPathButton);
            final Button ActThirdCallOutButton = (Button)findViewById(R.id.ActThirdCallOutButton);
            final TextView textView9 = (TextView)findViewById(R.id.textView9);
            final TextView textView10 = (TextView)findViewById(R.id.textView10);
            final TextView textView11 = (TextView)findViewById(R.id.textView11);
            final TextView textView12 = (TextView)findViewById(R.id.textView12);
            final TextView textView13 = (TextView)findViewById(R.id.textView13);
            final Button ActThirdKeepGoingButton = (Button)findViewById(R.id.ActThirdKeepGoingButton);
            final Button ActThirdGoHomeButton = (Button)findViewById(R.id.ActThirdGoHomeButton);

            final Animation a = AnimationUtils.loadAnimation(ActThird.this, R.anim.alpha);

            switch(line){
                case 1: textView1.setVisibility(View.VISIBLE); textView1.startAnimation(a); break;
                case 2: textView2.setVisibility(View.VISIBLE); textView2.startAnimation(a); break;
                case 3: textView3.setVisibility(View.VISIBLE); textView3.startAnimation(a); break;
                case 4: textView4.setVisibility(View.VISIBLE); textView4.startAnimation(a); break;
                case 5: textView5.setVisibility(View.VISIBLE); textView5.startAnimation(a); break;
                case 6: textView6.setVisibility(View.VISIBLE); textView6.startAnimation(a); break;
                case 7: textView7.setVisibility(View.VISIBLE); textView7.startAnimation(a); break;
                case 8: ActThirdGoPathButton.setVisibility(View.VISIBLE); ActThirdGoPathButton.startAnimation(a);
                    ActThirdGoPathButton.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            try {
                                if (counterFirst == 0) {
                                    ActThirdGoPathButton.setBackgroundColor(Color.parseColor("#56b1b5"));
                                    counterFirst = 1;
                                    textView9.setVisibility(View.GONE);
                                    line = line + 1;
                                }
                            } catch (Exception e){

                            }
                        }
                    });
                    ActThirdCallOutButton.setVisibility(View.VISIBLE); ActThirdCallOutButton.startAnimation(a);
                    ActThirdCallOutButton.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            try {
                                if (counterFirst == 0) {
                                    ActThirdCallOutButton.setBackgroundColor(Color.parseColor("#56b1b5"));
                                    counterFirst = 1;
                                }
                            } catch (Exception e){

                            }
                        }
                    });break;
                case 9: textView9.setVisibility(View.VISIBLE); textView9.startAnimation(a); break;
                case 10: textView10.setVisibility(View.VISIBLE); textView10.startAnimation(a); break;
                case 11: textView11.setVisibility(View.VISIBLE); textView11.startAnimation(a); break;
                case 12: textView12.setVisibility(View.VISIBLE); textView12.startAnimation(a); break;
                case 13: textView13.setVisibility(View.VISIBLE); textView13.startAnimation(a); break;
                case 14: ActThirdKeepGoingButton.setVisibility(View.VISIBLE); ActThirdKeepGoingButton.startAnimation(a);
                    ActThirdKeepGoingButton.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            try {
                                Intent intent = new Intent(ActThird.this, ActFourKeepGoing.class);startActivity(intent);finish();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    ActThirdGoHomeButton.setVisibility(View.VISIBLE); ActThirdGoHomeButton.startAnimation(a);
                    ActThirdGoHomeButton.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            try {
                                Intent intent = new Intent(ActThird.this, ActFourGoHome.class);startActivity(intent);finish();
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

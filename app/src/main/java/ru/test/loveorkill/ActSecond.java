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

public class ActSecond extends AppCompatActivity {

    TableSecond tableSecond = new TableSecond();
    Delay delay = new Delay();
    public Animation a;
    public TextView textView1;
    public TextView textView2;
    public TextView textView3;
    public ImageView imageView4;
    public TextView textView5;
    public TextView textView6;
    public TextView textView7;
    public TextView textView8;
    public TextView textView9;
    public TextView textView10;
    public TextView textView11;
    public TextView textView12;
    public TextView textView13;
    public Button ActSecondAgreeButton;
    public Button ActSecondRefuseButton;
    public TextView textView15;
    public TextView textView16;
    public Button ActSecondNextButton;
    public int line=0;
    public int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_two);
        final TextView textView1 = (TextView)findViewById(R.id.textView1);
        final TextView textView2 = (TextView)findViewById(R.id.textView2);
        final TextView textView3 = (TextView)findViewById(R.id.textView3);
        final ImageView imageView4 = (ImageView)findViewById(R.id.imageView4);
        final TextView textView5 = (TextView)findViewById(R.id.textView5);
        final TextView textView6 = (TextView)findViewById(R.id.textView6);
        final TextView textView7 = (TextView)findViewById(R.id.textView7);
        final TextView textView8 = (TextView)findViewById(R.id.textView8);
        final TextView textView9 = (TextView)findViewById(R.id.textView9);
        final TextView textView10 = (TextView)findViewById(R.id.textView10);
        final TextView textView11 = (TextView)findViewById(R.id.textView11);
        final TextView textView12 = (TextView)findViewById(R.id.textView12);
        final TextView textView13 = (TextView)findViewById(R.id.textView13);
        final Button ActSecondAgreeButton = (Button)findViewById(R.id.ActSecondAgreeButton);
        final Button ActSecondRefuseButton = (Button)findViewById(R.id.ActSecondRefuseButton);
        final TextView textView15 = (TextView)findViewById(R.id.textView15);
        final TextView textView16 = (TextView)findViewById(R.id.textView16);
        final Button ActSecondNextButton = (Button)findViewById(R.id.ActSecondNextButton);

        textView1.setText(tableSecond.dialogSecond[0]);
        textView2.setText(tableSecond.dialogSecond[1]);
        textView3.setText(tableSecond.dialogSecond[2]);
        textView5.setText(tableSecond.dialogSecond[4]);
        textView6.setText(tableSecond.dialogSecond[5]);
        textView7.setText(tableSecond.dialogSecond[6]);
        textView8.setText(tableSecond.dialogSecond[7]);
        textView9.setText(tableSecond.dialogSecond[8]);
        textView10.setText(tableSecond.dialogSecond[9]);
        textView11.setText(tableSecond.dialogSecond[10]);
        textView12.setText(tableSecond.dialogSecond[11]);
        textView13.setText(tableSecond.dialogSecond[12]);
        textView15.setText(tableSecond.dialogSecond[14]);
        textView16.setText(tableSecond.dialogSecond[15]);

        //Внизу будет код, который прячет текст

        textView1.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        textView3.setVisibility(View.INVISIBLE);
        imageView4.setVisibility(View.INVISIBLE);
        textView5.setVisibility(View.INVISIBLE);
        textView6.setVisibility(View.INVISIBLE);
        textView7.setVisibility(View.INVISIBLE);
        textView8.setVisibility(View.INVISIBLE);
        textView9.setVisibility(View.INVISIBLE);
        textView10.setVisibility(View.INVISIBLE);
        textView11.setVisibility(View.INVISIBLE);
        textView12.setVisibility(View.INVISIBLE);
        textView13.setVisibility(View.INVISIBLE);
        ActSecondAgreeButton.setVisibility(View.INVISIBLE);
        ActSecondRefuseButton.setVisibility(View.INVISIBLE);
        textView15.setVisibility(View.INVISIBLE);
        textView16.setVisibility(View.GONE);
        ActSecondNextButton.setVisibility(View.INVISIBLE);

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
            Intent intent = new Intent(ActSecond.this, MainActivity.class);startActivity(intent);finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finish();
    }

    // С этого места начинается код AsyncTask
    class Delay extends AsyncTask<Void, Integer, Void> {

        @Override
        protected Void doInBackground(Void... params){
            while (line<=16){
                if(counter==0 & line==14){
                    line=14;
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
            final ImageView imageView4 = (ImageView)findViewById(R.id.imageView4);
            final TextView textView5 = (TextView)findViewById(R.id.textView5);
            final TextView textView6 = (TextView)findViewById(R.id.textView6);
            final TextView textView7 = (TextView)findViewById(R.id.textView7);
            final TextView textView8 = (TextView)findViewById(R.id.textView8);
            final TextView textView9 = (TextView)findViewById(R.id.textView9);
            final TextView textView10 = (TextView)findViewById(R.id.textView10);
            final TextView textView11 = (TextView)findViewById(R.id.textView11);
            final TextView textView12 = (TextView)findViewById(R.id.textView12);
            final TextView textView13 = (TextView)findViewById(R.id.textView13);
            final Button ActSecondAgreeButton = (Button)findViewById(R.id.ActSecondAgreeButton);
            final Button ActSecondRefuseButton = (Button)findViewById(R.id.ActSecondRefuseButton);
            final TextView textView15 = (TextView)findViewById(R.id.textView15);
            final TextView textView16 = (TextView)findViewById(R.id.textView16);
            final Button ActSecondNextButton = (Button)findViewById(R.id.ActSecondNextButton);

            final Animation a = AnimationUtils.loadAnimation(ActSecond.this, R.anim.alpha);

            switch(line){
                case 1: textView1.setVisibility(View.VISIBLE); textView1.startAnimation(a); break;
                case 2: textView2.setVisibility(View.VISIBLE); textView2.startAnimation(a); break;
                case 3: textView3.setVisibility(View.VISIBLE); textView3.startAnimation(a); break;
                case 4: imageView4.setVisibility(View.VISIBLE); imageView4.startAnimation(a); break;
                case 5: textView5.setVisibility(View.VISIBLE); textView5.startAnimation(a); break;
                case 6: textView6.setVisibility(View.VISIBLE); textView6.startAnimation(a); break;
                case 7: textView7.setVisibility(View.VISIBLE); textView7.startAnimation(a); break;
                case 8: textView8.setVisibility(View.VISIBLE); textView8.startAnimation(a); break;
                case 9: textView9.setVisibility(View.VISIBLE); textView9.startAnimation(a); break;
                case 10: textView10.setVisibility(View.VISIBLE); textView10.startAnimation(a); break;
                case 11: textView11.setVisibility(View.VISIBLE); textView11.startAnimation(a); break;
                case 12: textView12.setVisibility(View.VISIBLE); textView12.startAnimation(a); break;
                case 13: textView13.setVisibility(View.VISIBLE); textView13.startAnimation(a); break;
                case 14: ActSecondAgreeButton.setVisibility(View.VISIBLE); ActSecondAgreeButton.startAnimation(a);
                    ActSecondAgreeButton.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            try {
                                if (counter == 0) {
                                    ActSecondAgreeButton.setBackgroundColor(Color.parseColor("#56b1b5"));
                                    counter = 1;
                                }
                            } catch (Exception e){

                            }
                        }
                    });
                    ActSecondRefuseButton.setVisibility(View.VISIBLE); ActSecondRefuseButton.startAnimation(a);
                    ActSecondRefuseButton.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            try {
                                if (counter == 0) {
                                    ActSecondRefuseButton.setBackgroundColor(Color.parseColor("#56b1b5"));
                                    counter = 1;
                                    textView15.setVisibility(View.GONE);
                                    line = line + 1;
                                }
                            } catch (Exception e){

                            }
                        }
                    });break;
                case 15: textView15.setVisibility(View.VISIBLE); textView15.startAnimation(a);
                        textView16.setVisibility(View.GONE); line=line+1; break;
                case 16: textView16.setVisibility(View.VISIBLE); textView16.startAnimation(a); break;
                case 17: ActSecondNextButton.setVisibility(View.VISIBLE); ActSecondNextButton.startAnimation(a);
                    ActSecondNextButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v){
                            try {
                                Intent intent = new Intent(ActSecond.this, ActThird.class);startActivity(intent);finish();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                default: break;

            }


        }

    }
    // На этом месте заканчивается код AsyncTask
}

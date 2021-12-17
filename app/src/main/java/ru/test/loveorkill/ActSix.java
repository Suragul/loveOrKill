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

public class ActSix extends AppCompatActivity {

    TableSix tableSix = new TableSix();
    Delay delay = new Delay();
    public Animation a;
    public TextView textView1;
    public TextView textView2;
    public TextView textView3;
    public TextView textView4;
    public TextView textView5;
    public TextView textView6;
    public TextView textView7;
    public TextView textView8;
    public TextView textView9;
    public TextView textView10;
    public TextView textView11;
    public TextView textView12;
    public TextView textView13;
    public TextView textView14;
    public TextView textView15;
    public TextView textView16;
    public TextView textView17;
    public TextView textView18;
    public TextView textView19;
    public TextView textView20;
    public TextView textView21;
    public TextView textView22;
    public ImageView imageView23;
    public Button ActSixFinishButton;
    public int line=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_six);
        final TextView textView1 = (TextView)findViewById(R.id.textView1);
        final TextView textView2 = (TextView)findViewById(R.id.textView2);
        final TextView textView3 = (TextView)findViewById(R.id.textView3);
        final TextView textView4 = (TextView)findViewById(R.id.textView4);
        final TextView textView5 = (TextView)findViewById(R.id.textView5);
        final TextView textView6 = (TextView)findViewById(R.id.textView6);
        final TextView textView7 = (TextView)findViewById(R.id.textView7);
        final TextView textView8 = (TextView)findViewById(R.id.textView8);
        final TextView textView9 = (TextView)findViewById(R.id.textView9);
        final TextView textView10 = (TextView)findViewById(R.id.textView10);
        final TextView textView11 = (TextView)findViewById(R.id.textView11);
        final TextView textView12 = (TextView)findViewById(R.id.textView12);
        final TextView textView13 = (TextView)findViewById(R.id.textView13);
        final TextView textView14 = (TextView)findViewById(R.id.textView14);
        final TextView textView15 = (TextView)findViewById(R.id.textView15);
        final TextView textView16 = (TextView)findViewById(R.id.textView16);
        final TextView textView17 = (TextView)findViewById(R.id.textView17);
        final TextView textView18 = (TextView)findViewById(R.id.textView18);
        final TextView textView19 = (TextView)findViewById(R.id.textView19);
        final TextView textView20 = (TextView)findViewById(R.id.textView20);
        final TextView textView21 = (TextView)findViewById(R.id.textView21);
        final TextView textView22 = (TextView)findViewById(R.id.textView22);
        final ImageView imageView23 = (ImageView)findViewById(R.id.imageView23);
        final Button ActSixFinishButton = (Button)findViewById(R.id.ActSixFinishButton);

        textView1.setText(tableSix.dialogSix[0]);
        textView2.setText(tableSix.dialogSix[1]);
        textView3.setText(tableSix.dialogSix[2]);
        textView4.setText(tableSix.dialogSix[3]);
        textView5.setText(tableSix.dialogSix[4]);
        textView6.setText(tableSix.dialogSix[5]);
        textView7.setText(tableSix.dialogSix[6]);
        textView8.setText(tableSix.dialogSix[7]);
        textView9.setText(tableSix.dialogSix[8]);
        textView10.setText(tableSix.dialogSix[9]);
        textView11.setText(tableSix.dialogSix[10]);
        textView12.setText(tableSix.dialogSix[11]);
        textView13.setText(tableSix.dialogSix[12]);
        textView14.setText(tableSix.dialogSix[13]);
        textView15.setText(tableSix.dialogSix[14]);
        textView16.setText(tableSix.dialogSix[15]);
        textView17.setText(tableSix.dialogSix[16]);
        textView18.setText(tableSix.dialogSix[17]);
        textView19.setText(tableSix.dialogSix[18]);
        textView20.setText(tableSix.dialogSix[19]);
        textView21.setText(tableSix.dialogSix[20]);
        textView22.setText(tableSix.dialogSix[21]);

        //Внизу будет код, который прячет текст

        textView1.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        textView3.setVisibility(View.INVISIBLE);
        textView4.setVisibility(View.INVISIBLE);
        textView5.setVisibility(View.INVISIBLE);
        textView6.setVisibility(View.INVISIBLE);
        textView7.setVisibility(View.INVISIBLE);
        textView8.setVisibility(View.INVISIBLE);
        textView9.setVisibility(View.INVISIBLE);
        textView10.setVisibility(View.INVISIBLE);
        textView11.setVisibility(View.INVISIBLE);
        textView12.setVisibility(View.INVISIBLE);
        textView13.setVisibility(View.INVISIBLE);
        textView14.setVisibility(View.INVISIBLE);
        textView15.setVisibility(View.INVISIBLE);
        textView16.setVisibility(View.INVISIBLE);
        textView17.setVisibility(View.INVISIBLE);
        textView18.setVisibility(View.INVISIBLE);
        textView19.setVisibility(View.INVISIBLE);
        textView20.setVisibility(View.INVISIBLE);
        textView21.setVisibility(View.INVISIBLE);
        textView22.setVisibility(View.INVISIBLE);
        imageView23.setVisibility(View.INVISIBLE);
        ActSixFinishButton.setVisibility(View.INVISIBLE);

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
            Intent intent = new Intent(ActSix.this, MainActivity.class);startActivity(intent);finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finish();
    }

    // С этого места начинается код AsyncTask
    class Delay extends AsyncTask<Void, Integer, Void> {

        @Override
        protected Void doInBackground(Void... params){
            while (line<=23){
                publishProgress(line++);
                try{
                    Thread.sleep(5000);
                    if (isCancelled()) return null;
                }catch(Exception e){}
            }
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
            final TextView textView8 = (TextView)findViewById(R.id.textView8);
            final TextView textView9 = (TextView)findViewById(R.id.textView9);
            final TextView textView10 = (TextView)findViewById(R.id.textView10);
            final TextView textView11 = (TextView)findViewById(R.id.textView11);
            final TextView textView12 = (TextView)findViewById(R.id.textView12);
            final TextView textView13 = (TextView)findViewById(R.id.textView13);
            final TextView textView14 = (TextView)findViewById(R.id.textView14);
            final TextView textView15 = (TextView)findViewById(R.id.textView15);
            final TextView textView16 = (TextView)findViewById(R.id.textView16);
            final TextView textView17 = (TextView)findViewById(R.id.textView17);
            final TextView textView18 = (TextView)findViewById(R.id.textView18);
            final TextView textView19 = (TextView)findViewById(R.id.textView19);
            final TextView textView20 = (TextView)findViewById(R.id.textView20);
            final TextView textView21 = (TextView)findViewById(R.id.textView21);
            final TextView textView22 = (TextView)findViewById(R.id.textView22);
            final ImageView imageView23 = (ImageView)findViewById(R.id.imageView23);
            final Button ActSixFinishButton = (Button)findViewById(R.id.ActSixFinishButton);

            final Animation a = AnimationUtils.loadAnimation(ActSix.this, R.anim.alpha);

            switch(line){
                case 1: textView1.setVisibility(View.VISIBLE); textView1.startAnimation(a); break;
                case 2: textView2.setVisibility(View.VISIBLE); textView2.startAnimation(a); break;
                case 3: textView3.setVisibility(View.VISIBLE); textView3.startAnimation(a); break;
                case 4: textView4.setVisibility(View.VISIBLE); textView4.startAnimation(a); break;
                case 5: textView5.setVisibility(View.VISIBLE); textView5.startAnimation(a); break;
                case 6: textView6.setVisibility(View.VISIBLE); textView6.startAnimation(a); break;
                case 7: textView7.setVisibility(View.VISIBLE); textView7.startAnimation(a); break;
                case 8: textView8.setVisibility(View.VISIBLE); textView8.startAnimation(a); break;
                case 9: textView9.setVisibility(View.VISIBLE); textView9.startAnimation(a); break;
                case 10: textView10.setVisibility(View.VISIBLE); textView10.startAnimation(a); break;
                case 11: textView11.setVisibility(View.VISIBLE); textView11.startAnimation(a); break;
                case 12: textView12.setVisibility(View.VISIBLE); textView12.startAnimation(a); break;
                case 13: textView13.setVisibility(View.VISIBLE); textView13.startAnimation(a); break;
                case 14: textView14.setVisibility(View.VISIBLE); textView14.startAnimation(a); break;
                case 15: textView15.setVisibility(View.VISIBLE); textView15.startAnimation(a); break;
                case 16: textView16.setVisibility(View.VISIBLE); textView16.startAnimation(a); break;
                case 17: textView17.setVisibility(View.VISIBLE); textView17.startAnimation(a); break;
                case 18: textView18.setVisibility(View.VISIBLE); textView18.startAnimation(a); break;
                case 19: textView19.setVisibility(View.VISIBLE); textView19.startAnimation(a); break;
                case 20: textView20.setVisibility(View.VISIBLE); textView20.startAnimation(a); break;
                case 21: textView21.setVisibility(View.VISIBLE); textView21.startAnimation(a); break;
                case 22: textView22.setVisibility(View.VISIBLE); textView22.startAnimation(a); break;
                case 23: imageView23.setVisibility(View.VISIBLE); imageView23.startAnimation(a); break;
                case 24: ActSixFinishButton.setVisibility(View.VISIBLE); ActSixFinishButton.startAnimation(a);
                    ActSixFinishButton.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            try {
                                Intent intent = new Intent(ActSix.this, MainActivity.class);startActivity(intent);finish();
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

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

public class ActFourKeepGoing extends AppCompatActivity {

    TableFourKeepGoing tableFourKeepGoing = new TableFourKeepGoing();
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
    public ImageView imageView9;
    public Button ActFourNextButton;
    public int line=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_four_keep_going);
        final TextView textView1 = (TextView)findViewById(R.id.textView1);
        final TextView textView2 = (TextView)findViewById(R.id.textView2);
        final TextView textView3 = (TextView)findViewById(R.id.textView3);
        final TextView textView4 = (TextView)findViewById(R.id.textView4);
        final TextView textView5 = (TextView)findViewById(R.id.textView5);
        final TextView textView6 = (TextView)findViewById(R.id.textView6);
        final TextView textView7 = (TextView)findViewById(R.id.textView7);
        final TextView textView8 = (TextView)findViewById(R.id.textView8);
        final ImageView imageView9 = (ImageView)findViewById(R.id.imageView9);
        final Button ActFourNextButton = (Button)findViewById(R.id.ActFourNextButton);

        textView1.setText(tableFourKeepGoing.dialogFourthKeepGoing[0]);
        textView2.setText(tableFourKeepGoing.dialogFourthKeepGoing[1]);
        textView3.setText(tableFourKeepGoing.dialogFourthKeepGoing[2]);
        textView4.setText(tableFourKeepGoing.dialogFourthKeepGoing[3]);
        textView5.setText(tableFourKeepGoing.dialogFourthKeepGoing[4]);
        textView6.setText(tableFourKeepGoing.dialogFourthKeepGoing[5]);
        textView7.setText(tableFourKeepGoing.dialogFourthKeepGoing[6]);
        textView8.setText(tableFourKeepGoing.dialogFourthKeepGoing[7]);

        //Внизу будет код, который прячет текст

        textView1.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        textView3.setVisibility(View.INVISIBLE);
        textView4.setVisibility(View.INVISIBLE);
        textView5.setVisibility(View.INVISIBLE);
        textView6.setVisibility(View.INVISIBLE);
        textView7.setVisibility(View.INVISIBLE);
        textView8.setVisibility(View.INVISIBLE);
        imageView9.setVisibility(View.INVISIBLE);
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
            Intent intent = new Intent(ActFourKeepGoing.this, MainActivity.class);startActivity(intent);finish();
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
            final ImageView imageView9 = (ImageView)findViewById(R.id.imageView9);
            final Button ActFourNextButton = (Button)findViewById(R.id.ActFourNextButton);

            final Animation a = AnimationUtils.loadAnimation(ActFourKeepGoing.this, R.anim.alpha);

            switch(line){
                case 1: textView1.setVisibility(View.VISIBLE); textView1.startAnimation(a); break;
                case 2: textView2.setVisibility(View.VISIBLE); textView2.startAnimation(a); break;
                case 3: textView3.setVisibility(View.VISIBLE); textView3.startAnimation(a); break;
                case 4: textView4.setVisibility(View.VISIBLE); textView4.startAnimation(a); break;
                case 5: textView5.setVisibility(View.VISIBLE); textView5.startAnimation(a); break;
                case 6: textView6.setVisibility(View.VISIBLE); textView6.startAnimation(a); break;
                case 7: textView7.setVisibility(View.VISIBLE); textView7.startAnimation(a); break;
                case 8: textView8.setVisibility(View.VISIBLE); textView8.startAnimation(a); break;
                case 9: imageView9.setVisibility(View.VISIBLE); imageView9.startAnimation(a); break;
                case 10: ActFourNextButton.setVisibility(View.VISIBLE); ActFourNextButton.startAnimation(a);
                    ActFourNextButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v){
                            try {
                                Intent intent = new Intent(ActFourKeepGoing.this, ActFiveOldWomanHouse.class);startActivity(intent);finish();
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

package ru.test.loveorkill;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ActFirst extends AppCompatActivity {

    TableFirst tableFirst = new TableFirst();
    Delay delay = new Delay();
    public Animation a;
    public TextView textView1;
    public TextView textView2;
    public ImageView imageView3;
    public TextView textView4;
    public TextView textView5;
    public TextView textView6;
    public TextView textView7;
    public TextView textView8;
    public TextView textView9;
    public TextView textView10;
    public TextView textView11;
    public TextView textView12;
    public Button ActFirstNextButton;
    public int line=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_one);
        final TextView textView1 = (TextView)findViewById(R.id.textView1);
        final TextView textView2 = (TextView)findViewById(R.id.textView2);
        final ImageView imageView3 = (ImageView)findViewById(R.id.imageView3);
        final TextView textView4 = (TextView)findViewById(R.id.textView4);
        final TextView textView5 = (TextView)findViewById(R.id.textView5);
        final TextView textView6 = (TextView)findViewById(R.id.textView6);
        final TextView textView7 = (TextView)findViewById(R.id.textView7);
        final TextView textView8 = (TextView)findViewById(R.id.textView8);
        final TextView textView9 = (TextView)findViewById(R.id.textView9);
        final TextView textView10 = (TextView)findViewById(R.id.textView10);
        final TextView textView11 = (TextView)findViewById(R.id.textView11);
        final TextView textView12 = (TextView)findViewById(R.id.textView12);
        final Button ActFirstNextButton = (Button)findViewById(R.id.ActFirstNextButton);

        textView1.setText(tableFirst.dialogFirst[0]);
        textView2.setText(tableFirst.dialogFirst[1]);
        textView4.setText(tableFirst.dialogFirst[3]);
        textView5.setText(tableFirst.dialogFirst[4]);
        textView6.setText(tableFirst.dialogFirst[5]);
        textView7.setText(tableFirst.dialogFirst[6]);
        textView8.setText(tableFirst.dialogFirst[7]);
        textView9.setText(tableFirst.dialogFirst[8]);
        textView10.setText(tableFirst.dialogFirst[9]);
        textView11.setText(tableFirst.dialogFirst[10]);
        textView12.setText(tableFirst.dialogFirst[11]);

        //Внизу будет код, который прячет текст

        textView1.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        imageView3.setVisibility(View.INVISIBLE);
        textView4.setVisibility(View.INVISIBLE);
        textView5.setVisibility(View.INVISIBLE);
        textView6.setVisibility(View.INVISIBLE);
        textView7.setVisibility(View.INVISIBLE);
        textView8.setVisibility(View.INVISIBLE);
        textView9.setVisibility(View.INVISIBLE);
        textView10.setVisibility(View.INVISIBLE);
        textView11.setVisibility(View.INVISIBLE);
        textView12.setVisibility(View.INVISIBLE);
        ActFirstNextButton.setVisibility(View.INVISIBLE);

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
            Intent intent = new Intent(ActFirst.this, ActSecond.class);startActivity(intent);finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finish();
    }

    // С этого места начинается код AsyncTask
    class Delay extends AsyncTask<Void, Integer, Void> {

        @Override
        protected Void doInBackground(Void... params){
            while (line<=12){
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
            final ImageView imageView3 = (ImageView)findViewById(R.id.imageView3);
            final TextView textView4 = (TextView)findViewById(R.id.textView4);
            final TextView textView5 = (TextView)findViewById(R.id.textView5);
            final TextView textView6 = (TextView)findViewById(R.id.textView6);
            final TextView textView7 = (TextView)findViewById(R.id.textView7);
            final TextView textView8 = (TextView)findViewById(R.id.textView8);
            final TextView textView9 = (TextView)findViewById(R.id.textView9);
            final TextView textView10 = (TextView)findViewById(R.id.textView10);
            final TextView textView11 = (TextView)findViewById(R.id.textView11);
            final TextView textView12 = (TextView)findViewById(R.id.textView12);
            final Button ActFirstNextButton = (Button)findViewById(R.id.ActFirstNextButton);

            final Animation a = AnimationUtils.loadAnimation(ActFirst.this, R.anim.alpha);

            switch(line){
                case 1: textView1.setVisibility(View.VISIBLE); textView1.startAnimation(a); break;
                case 2: textView2.setVisibility(View.VISIBLE); textView2.startAnimation(a); break;
                case 3: imageView3.setVisibility(View.VISIBLE); imageView3.startAnimation(a); break;
                case 4: textView4.setVisibility(View.VISIBLE); textView4.startAnimation(a); break;
                case 5: textView5.setVisibility(View.VISIBLE); textView5.startAnimation(a); break;
                case 6: textView6.setVisibility(View.VISIBLE); textView6.startAnimation(a); break;
                case 7: textView7.setVisibility(View.VISIBLE); textView7.startAnimation(a); break;
                case 8: textView8.setVisibility(View.VISIBLE); textView8.startAnimation(a); break;
                case 9: textView9.setVisibility(View.VISIBLE); textView9.startAnimation(a); break;
                case 10: textView10.setVisibility(View.VISIBLE); textView10.startAnimation(a); break;
                case 11: textView11.setVisibility(View.VISIBLE); textView11.startAnimation(a); break;
                case 12: textView12.setVisibility(View.VISIBLE); textView12.startAnimation(a); break;
                case 13: ActFirstNextButton.setVisibility(View.VISIBLE); ActFirstNextButton.startAnimation(a);
                    ActFirstNextButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v){
                            try {
                                Intent intent = new Intent(ActFirst.this, ActSecond.class);startActivity(intent);finish();
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

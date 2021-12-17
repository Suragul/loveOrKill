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

public class ActFivePolice extends AppCompatActivity {

    TableFivePolice tableFivePolice = new TableFivePolice();
    Delay delay = new Delay();
    public Animation a;
    public ImageView imageView1;
    public TextView textView2;
    public TextView textView3;
    public TextView textView4;
    public TextView textView5;
    public TextView textView6;
    public Button ActFiveFinishButton;
    public int line=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_five_police);
        final ImageView imageView1 = (ImageView)findViewById(R.id.imageView1);
        final TextView textView2 = (TextView)findViewById(R.id.textView2);
        final TextView textView3 = (TextView)findViewById(R.id.textView3);
        final TextView textView4 = (TextView)findViewById(R.id.textView4);
        final TextView textView5 = (TextView)findViewById(R.id.textView5);
        final TextView textView6 = (TextView)findViewById(R.id.textView6);
        final Button ActFiveFinishButton = (Button)findViewById(R.id.ActFiveFinishButton);

        textView2.setText(tableFivePolice.dialogFivePolice[1]);
        textView3.setText(tableFivePolice.dialogFivePolice[2]);
        textView4.setText(tableFivePolice.dialogFivePolice[3]);
        textView5.setText(tableFivePolice.dialogFivePolice[4]);
        textView6.setText(tableFivePolice.dialogFivePolice[5]);

        //Внизу будет код, который прячет текст

        imageView1.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        textView3.setVisibility(View.INVISIBLE);
        textView4.setVisibility(View.INVISIBLE);
        textView5.setVisibility(View.INVISIBLE);
        textView6.setVisibility(View.INVISIBLE);
        ActFiveFinishButton.setVisibility(View.INVISIBLE);

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
            Intent intent = new Intent(ActFivePolice.this, MainActivity.class);startActivity(intent);finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finish();
    }

    // С этого места начинается код AsyncTask
    class Delay extends AsyncTask<Void, Integer, Void> {

        @Override
        protected Void doInBackground(Void... params){
            while (line<=6){
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

            final ImageView imageView1 = (ImageView)findViewById(R.id.imageView1);
            final TextView textView2 = (TextView)findViewById(R.id.textView2);
            final TextView textView3 = (TextView)findViewById(R.id.textView3);
            final TextView textView4 = (TextView)findViewById(R.id.textView4);
            final TextView textView5 = (TextView)findViewById(R.id.textView5);
            final TextView textView6 = (TextView)findViewById(R.id.textView6);
            final Button ActFiveFinishButton = (Button)findViewById(R.id.ActFiveFinishButton);

            final Animation a = AnimationUtils.loadAnimation(ActFivePolice.this, R.anim.alpha);

            switch(line){
                case 1: imageView1.setVisibility(View.VISIBLE); imageView1.startAnimation(a); break;
                case 2: textView2.setVisibility(View.VISIBLE); textView2.startAnimation(a); break;
                case 3: textView3.setVisibility(View.VISIBLE); textView3.startAnimation(a); break;
                case 4: textView4.setVisibility(View.VISIBLE); textView4.startAnimation(a); break;
                case 5: textView5.setVisibility(View.VISIBLE); textView5.startAnimation(a); break;
                case 6: textView6.setVisibility(View.VISIBLE); textView6.startAnimation(a); break;
                case 7:  ActFiveFinishButton.setVisibility(View.VISIBLE); ActFiveFinishButton.startAnimation(a);
                    ActFiveFinishButton.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            try {
                                Intent intent = new Intent(ActFivePolice.this, MainActivity.class);startActivity(intent);finish();
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

package com.sagancompany.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class dinleme extends AppCompatActivity {
    Button playBtn;
    SeekBar positionBar;
    SeekBar volumeBar;
    TextView elapsedTimeLabel;
    TextView remainingTimeLabel;
    MediaPlayer mp;
    ImageView img;
    int totalTime;
    int zaman;
    int saniye1;
    int dakika1;
    static ArrayList<Manzara> lstcontact3;
    static int position1;
    String calan;
    Handler handler;
    Runnable runnable;
    int current;
    int currentsec;
    int currentmin;
    AudioManager audioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinleme);
        playBtn=(Button)findViewById(R.id.playBtn);
        calan=lstcontact3.get(position1).getBaslik();
        remainingTimeLabel=(TextView)findViewById(R.id.remainingTimeLabel);
        elapsedTimeLabel=(TextView)findViewById(R.id.elapsedTimeLabel);

        img=(ImageView)findViewById(R.id.image) ;
mp=new MediaPlayer();
mp.setAudioStreamType(AudioManager.STREAM_MUSIC);

        handler=new Handler();
     positionBar=(SeekBar)findViewById(R.id.positionBar);
        volumeBar=(SeekBar)findViewById(R.id.volumeBar);
        if(calan.equalsIgnoreCase("cindirella")){
            mp=MediaPlayer.create(this,R.raw.kulkedisi);
            img.setImageResource(R.drawable.cindirella);
        }
        else if(calan.equalsIgnoreCase("agustos boce ve karınca")){
            mp=MediaPlayer.create(this,R.raw.agustos);
            img.setImageResource(R.drawable.agustos);

        }
        else if(calan.equalsIgnoreCase("deniz kızı")){
            mp=MediaPlayer.create(this,R.raw.denizkizi);
            img.setImageResource(R.drawable.denizkizi);
        }
        else if(calan.equalsIgnoreCase("kırmızı baslikli kız")){
            mp=MediaPlayer.create(this,R.raw.baslikli);
            img.setImageResource(R.drawable.kirmizibasliklikiz);

        } else if(calan.equalsIgnoreCase("kibritci kız")){
            mp=MediaPlayer.create(this,R.raw.kibrit);
            img.setImageResource(R.drawable.kibritcikiz);

        }
        else if(calan.equalsIgnoreCase("aslan ve fare")){
            mp=MediaPlayer.create(this,R.raw.aslanvefare);
            img.setImageResource(R.drawable.aslanvefare);

        }else if(calan.equalsIgnoreCase("hansel ve gratel")){
            mp=MediaPlayer.create(this,R.raw.hanselvegratel);
            img.setImageResource(R.drawable.hanselvegratel);

        }else if(calan.equalsIgnoreCase("bremen mızıkacıları")){
            mp=MediaPlayer.create(this,R.raw.bremen);
            img.setImageResource(R.drawable.bremenmizikacilari);

        }
        else if(calan.equalsIgnoreCase("cirkin ördek yavrusu")){
            mp=MediaPlayer.create(this,R.raw.cirkin);
            img.setImageResource(R.drawable.cirkin);

        }else if(calan.equalsIgnoreCase("pinokyo")){
            mp=MediaPlayer.create(this,R.raw.pinokyo);
            img.setImageResource(R.drawable.pinokyo);

        }else if(calan.equalsIgnoreCase("kırmızı balık")){
            mp=MediaPlayer.create(this,R.raw.balik);
            img.setImageResource(R.drawable.kirmizi);

        }
        else if(calan.equalsIgnoreCase("alaaddinin sihirli lambası")){
            mp=MediaPlayer.create(this,R.raw.alladdin);
            img.setImageResource(R.drawable.alladin);

        }
        else if(calan.equalsIgnoreCase("peterpan")){
            mp=MediaPlayer.create(this,R.raw.peterpan);
            img.setImageResource(R.drawable.peterpan);

        }
        else if(calan.equalsIgnoreCase("parmak cocuk")){
            mp=MediaPlayer.create(this,R.raw.parmak);
            img.setImageResource(R.drawable.parmakcocuk);

        }
        else if(calan.equalsIgnoreCase("mutlu prens")){
            mp=MediaPlayer.create(this,R.raw.mutluprens);
            img.setImageResource(R.drawable.mutluprens);

        }
        else if(calan.equalsIgnoreCase("altın saçlı kız")){
            mp=MediaPlayer.create(this,R.raw.altinsacli);
            img.setImageResource(R.drawable.altinsacli);

        }
        else if(calan.equalsIgnoreCase("dandini dandini")){
            mp=MediaPlayer.create(this,R.raw.dandini);
            img.setImageResource(R.drawable.bulutbebek);

        }
        else if(calan.equalsIgnoreCase("fisfis kayikci")){
            mp=MediaPlayer.create(this,R.raw.fisfis);
            img.setImageResource(R.drawable.ninni);

        }
        else if(calan.equalsIgnoreCase("benim annem guzel annem")){
            mp=MediaPlayer.create(this,R.raw.benimannem);
            img.setImageResource(R.drawable.benimannem);

        }
        else if(calan.equalsIgnoreCase("kirmizi balik gölde")){
            mp=MediaPlayer.create(this,R.raw.kirmizibalikgolde);
            img.setImageResource(R.drawable.kirmizi);

        }
        else if(calan.equalsIgnoreCase("annesi onu çok severmiş")){
            mp=MediaPlayer.create(this,R.raw.annesi);
            img.setImageResource(R.drawable.annesi);

        }
        else if(calan.equalsIgnoreCase("ali babanın çiftliği")){
            mp=MediaPlayer.create(this,R.raw.alibaba);
            img.setImageResource(R.drawable.alibaba);

        }

        else if(calan.equalsIgnoreCase("kedi")){
            mp=MediaPlayer.create(this,R.raw.hayvankedi);
            img.setImageResource(R.drawable.kedihayvan);

        }
        else if(calan.equalsIgnoreCase("köpek")){
            mp=MediaPlayer.create(this,R.raw.hayvankopek);
            img.setImageResource(R.drawable.kopekhayvan);

        }
        else if(calan.equalsIgnoreCase("aslan")){
            mp=MediaPlayer.create(this,R.raw.hayvanaslan);
            img.setImageResource(R.drawable.aslanhayvan);

        }
        else if(calan.equalsIgnoreCase("yilan")){
            mp=MediaPlayer.create(this,R.raw.hayvanyilan);
            img.setImageResource(R.drawable.yilanhayvan);

        }
        else if(calan.equalsIgnoreCase("fil")){
            mp=MediaPlayer.create(this,R.raw.hayvanfil);
            img.setImageResource(R.drawable.filhayvan);

        }
        else if(calan.equalsIgnoreCase("kurt")){
            mp=MediaPlayer.create(this,R.raw.hayvankurt);
            img.setImageResource(R.drawable.kurthayvan);

        }
        else if(calan.equalsIgnoreCase("tavuk")){
            mp=MediaPlayer.create(this,R.raw.hayvantavuk);
            img.setImageResource(R.drawable.tavukhayvan);

        }
        else if(calan.equalsIgnoreCase("civciv")){
            mp=MediaPlayer.create(this,R.raw.hayvancivciv);
            img.setImageResource(R.drawable.civcivhayvan);

        }
        else if(calan.equalsIgnoreCase("at")){
            mp=MediaPlayer.create(this,R.raw.hayvanat);
            img.setImageResource(R.drawable.athayvan);

        }
        else if(calan.equalsIgnoreCase("eşek")){
            mp=MediaPlayer.create(this,R.raw.hayvanesek);
            img.setImageResource(R.drawable.esekhayvan);

        }
        else if(calan.equalsIgnoreCase("inek")){
            mp=MediaPlayer.create(this,R.raw.hayvaninek);
            img.setImageResource(R.drawable.inekhayvan);

        }
        else if(calan.equalsIgnoreCase("kuzu")){
            mp=MediaPlayer.create(this,R.raw.hayvankuzu);
            img.setImageResource(R.drawable.kuzuhayvan);

        }
        else if(calan.equalsIgnoreCase("horoz")){
            mp=MediaPlayer.create(this,R.raw.hayvanhoroz);
            img.setImageResource(R.drawable.horoz);

        } else if(calan.equalsIgnoreCase("ari")){
            mp=MediaPlayer.create(this,R.raw.hayvanari);
            img.setImageResource(R.drawable.arihayvan);

        }
mp.setLooping(true);


        totalTime=mp.getDuration();
        Log.d("alo", "totalTime"+totalTime);
        totalTime=totalTime/1000;
        int saniye=totalTime%60;
        int dakika=totalTime/60;



        remainingTimeLabel.setText(dakika+":"+saniye);





        mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                positionBar.setMax(mp.getDuration());
                mp.start();
                playCycle();



            }
        });

        audioManager=(AudioManager)getSystemService(Context.AUDIO_SERVICE);
        int maxV=audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int curV=audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        volumeBar.setMax(maxV);
        volumeBar.setProgress(curV);
        volumeBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,i,0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



        positionBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean user) {
                if(user){
                    zaman=progress/1000;
                    saniye1= zaman%60;
                    dakika1=zaman/60;


                    elapsedTimeLabel.setText(dakika1+":"+saniye1);

                    mp.seekTo(progress);
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });







    }
    public void playCycle(){

        positionBar.setProgress(mp.getCurrentPosition());
        current=mp.getCurrentPosition()/1000;
        currentsec=current%60;
        currentmin=current/60;


        elapsedTimeLabel.setText(currentmin+":"+currentsec);

        if(mp.isPlaying()){

            runnable=new Runnable() {
                @Override
                public void run() {
                    playCycle();
                }
            };
            handler.postDelayed(runnable,10);
        }


    }

    public  void Dinle(View v){
        calan=lstcontact3.get(position1).getBaslik();

        if(mp==null){

            if(calan.equalsIgnoreCase("cindirella")){
                mp=MediaPlayer.create(this,R.raw.kulkedisi);
            }
            else if(calan.equalsIgnoreCase("agustos boce ve karınca")){
                mp=MediaPlayer.create(this,R.raw.agustos);

            }
            else if(calan.equalsIgnoreCase("deniz kızı")){
                mp=MediaPlayer.create(this,R.raw.denizkizi);

            }
            else if(calan.equalsIgnoreCase("kırmızı baslikli kız")){
                mp=MediaPlayer.create(this,R.raw.baslikli);

            }





            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    playerKapat();
                }
            });

        }
        if (!mp.isPlaying()) {
            // Stopping
            mp.start();
            playCycle();
            playBtn.setBackgroundResource(R.drawable.stop);

        }
        else {
            // Playing
            mp.pause();

            playBtn.setBackgroundResource(R.drawable.play);
        }


    }

    public  void kapat(View v){
        playerKapat();
    }

    public void playerKapat(){
        if(mp!=null){
           // mp.release();
            //handler.removeCallbacks(runnable);
            //mp=null;

            Toast.makeText(this,"player kapatıldı",Toast.LENGTH_LONG).show();


        }

    }

    @Override
    protected void onStop() {
        super.onStop();
        playerKapat();
    }

    public static void sendarraylist( ArrayList<Manzara> lstcontact2,int position){
        lstcontact3=lstcontact2;
        position1=position;

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
         mp.release();
        handler.removeCallbacks(runnable);
        mp=null;

    }
}

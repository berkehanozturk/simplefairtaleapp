package com.sagancompany.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;

import java.util.ArrayList;

public class masal extends AppCompatActivity {
    RecyclerView recyclerView1;
    EmreAdapter mAdapter1;
    RecyclerView.LayoutManager mLayoutManager1;
    private SoundPool soundPool;
    MediaPlayer ply;
    private int sound1,sound2,sound3,sound4;

    private ArrayList<Manzara> lstcontact1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masal);
        lstcontact1=new ArrayList<>();
        Resources res = getResources();
        String[] icerik2 = res.getStringArray(R.array.masallar);
        int resimler[]={R.drawable.kirmizibasliklikiz,R.drawable.cindirella,R.drawable.agustos,R.drawable.denizkizi,R.drawable.kibritcikiz,R.drawable.aslanvefare,R.drawable.hanselvegratel,R.drawable.bremenmizikacilari,
                R.drawable.cirkin,R.drawable.pinokyo,R.drawable.kirmizi,R.drawable.alladin,R.drawable.peterpan,R.drawable.parmakcocuk,R.drawable.mutluprens,R.drawable.altinsacli
                };
        for (int i = 0; i <resimler.length ; i++) {
            Manzara gecici=new Manzara(icerik2[i],"masal",resimler[i]);

           lstcontact1.add(gecici);


        }

        recyclerView1=(RecyclerView)findViewById(R.id.recyclerview2);
        recyclerView1.setHasFixedSize(true);
        mLayoutManager1=new LinearLayoutManager(this);
        mAdapter1 =new EmreAdapter(this,lstcontact1);
        recyclerView1.setLayoutManager(mLayoutManager1);
        recyclerView1.setAdapter(mAdapter1);






        mAdapter1.setOnItemClickListener(new EmreAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                String a=lstcontact1.get(position).getBaslik();
                if(a.equalsIgnoreCase("agustos boce ve karınca")) {
                    dinleme.sendarraylist(lstcontact1,position);
                    startActivity(new Intent(masal.this, dinleme.class));



                }
                else if (a.equalsIgnoreCase("kırmızı baslikli kız")){
                    dinleme.sendarraylist(lstcontact1,position);
                    startActivity(new Intent(masal.this, dinleme.class));

                }
                else if (a.equalsIgnoreCase("cindirella")){
                    dinleme.sendarraylist(lstcontact1,position);
                    startActivity(new Intent(masal.this, dinleme.class));


                }
                else if (a.equalsIgnoreCase("deniz kızı")){
                    dinleme.sendarraylist(lstcontact1,position);
                    startActivity(new Intent(masal.this, dinleme.class));


                }
                else if (a.equalsIgnoreCase("kibritci kız")){
                    dinleme.sendarraylist(lstcontact1,position);
                    startActivity(new Intent(masal.this, dinleme.class));


                }
                else if (a.equalsIgnoreCase("aslan ve fare")){
                    dinleme.sendarraylist(lstcontact1,position);
                    startActivity(new Intent(masal.this, dinleme.class));


                }
                else if (a.equalsIgnoreCase("hansel ve gratel")){
                    dinleme.sendarraylist(lstcontact1,position);
                    startActivity(new Intent(masal.this, dinleme.class));


                }
                else if (a.equalsIgnoreCase("bremen mızıkacıları")){
                    dinleme.sendarraylist(lstcontact1,position);
                    startActivity(new Intent(masal.this, dinleme.class));


                }
                else if (a.equalsIgnoreCase("cirkin ördek yavrusu")){
                    dinleme.sendarraylist(lstcontact1,position);
                    startActivity(new Intent(masal.this, dinleme.class));


                }
                else if (a.equalsIgnoreCase("pinokyo")){
                    dinleme.sendarraylist(lstcontact1,position);
                    startActivity(new Intent(masal.this, dinleme.class));


                }
                else if (a.equalsIgnoreCase("kırmızı balık")){
                    dinleme.sendarraylist(lstcontact1,position);
                    startActivity(new Intent(masal.this, dinleme.class));


                }
                else if (a.equalsIgnoreCase("alaaddinin sihirli lambası")){
                    dinleme.sendarraylist(lstcontact1,position);
                    startActivity(new Intent(masal.this, dinleme.class));


                }
                else if (a.equalsIgnoreCase("peterpan")){
                    dinleme.sendarraylist(lstcontact1,position);
                    startActivity(new Intent(masal.this, dinleme.class));


                }
                else if (a.equalsIgnoreCase("parmak cocuk")){
                    dinleme.sendarraylist(lstcontact1,position);
                    startActivity(new Intent(masal.this, dinleme.class));


                }
                else if (a.equalsIgnoreCase("mutlu prens")){
                    dinleme.sendarraylist(lstcontact1,position);
                    startActivity(new Intent(masal.this, dinleme.class));


                }
                else if (a.equalsIgnoreCase("altın saçlı kız")){
                    dinleme.sendarraylist(lstcontact1,position);
                    startActivity(new Intent(masal.this, dinleme.class));


                }
            }

        });




    }



}


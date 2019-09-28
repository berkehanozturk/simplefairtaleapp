package com.sagancompany.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Resources;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class ninni extends AppCompatActivity {
    RecyclerView recyclerView2;
    EmreAdapter mAdapter2;
    RecyclerView.LayoutManager mLayoutManager2;

    private ArrayList<Manzara> lstcontact5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninni);
        Resources res = getResources();
        lstcontact5=new ArrayList<>();
        String[] icerik2 = res.getStringArray(R.array.ninniler);

        int resimler[]={R.drawable.bulutbebek,R.drawable.ninni,R.drawable.benimannem,R.drawable.kirmizi,R.drawable.annesi,R.drawable.alibaba
        };
        for (int i = 0; i <resimler.length ; i++) {
            Manzara gecici3=new Manzara(icerik2[i],"ninni",resimler[i]);

            lstcontact5.add(gecici3);


        }
        recyclerView2=(RecyclerView)findViewById(R.id.recyclerview5);
        recyclerView2.setHasFixedSize(true);
        mLayoutManager2=new LinearLayoutManager(this);
        mAdapter2 =new EmreAdapter(this,lstcontact5);
        recyclerView2.setLayoutManager(mLayoutManager2);
        recyclerView2.setAdapter(mAdapter2);
        mAdapter2.setOnItemClickListener(new EmreAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                String a=lstcontact5.get(position).getBaslik();
                Log.d("alo", "onItemClick: "+a);
                if(a.equalsIgnoreCase("dandini dandini")) {
                    dinleme.sendarraylist(lstcontact5,position);
                    startActivity(new Intent(ninni.this, dinleme.class));



                }
                else if (a.equalsIgnoreCase("fisfis kayikci")){
                    dinleme.sendarraylist(lstcontact5,position);
                    startActivity(new Intent(ninni.this, dinleme.class));

                } else if (a.equalsIgnoreCase("benim annem guzel annem")){
                    dinleme.sendarraylist(lstcontact5,position);
                    startActivity(new Intent(ninni.this, dinleme.class));

                }
                else if (a.equalsIgnoreCase("kirmizi balik gölde")){
                    dinleme.sendarraylist(lstcontact5,position);
                    startActivity(new Intent(ninni.this, dinleme.class));

                }
                else if (a.equalsIgnoreCase("annesi onu çok severmiş")){
                    dinleme.sendarraylist(lstcontact5,position);
                    startActivity(new Intent(ninni.this, dinleme.class));

                }
                else if (a.equalsIgnoreCase("ali babanın çiftliği")){
                    dinleme.sendarraylist(lstcontact5,position);
                    startActivity(new Intent(ninni.this, dinleme.class));

                }













            }

        });

    }
}

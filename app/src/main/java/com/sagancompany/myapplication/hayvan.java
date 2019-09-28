package com.sagancompany.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class hayvan extends AppCompatActivity {
    RecyclerView recyclerView3;
    EmreAdapter mAdapter3;
    RecyclerView.LayoutManager mLayoutManager3;

    private ArrayList<Manzara> lstcontact6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayvan);
        Resources res = getResources();
        lstcontact6=new ArrayList<>();
        String[] icerik2 = res.getStringArray(R.array.hayvansesleri);

        int resimler[]={R.drawable.kedihayvan,R.drawable.kopekhayvan,R.drawable.aslanhayvan,R.drawable.yilanhayvan,R.drawable.filhayvan,R.drawable.arihayvan
                ,R.drawable.kurthayvan,R.drawable.tavukhayvan,R.drawable.civcivhayvan,R.drawable.athayvan,R.drawable.esekhayvan,R.drawable.inekhayvan,R.drawable.kuzuhayvan,R.drawable.horoz

        };

        for (int i = 0; i <resimler.length ; i++) {
            Manzara gecici4=new Manzara(icerik2[i],"hayvansesleri",resimler[i]);

            lstcontact6.add(gecici4);


        }
        recyclerView3=(RecyclerView)findViewById(R.id.recyclerview7);
        recyclerView3.setHasFixedSize(true);
        mLayoutManager3=new LinearLayoutManager(this);
        mAdapter3 =new EmreAdapter(this,lstcontact6);
        recyclerView3.setLayoutManager(mLayoutManager3);
        recyclerView3.setAdapter(mAdapter3);
        mAdapter3.setOnItemClickListener(new EmreAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                String a = lstcontact6.get(position).getBaslik();
                Log.d("alo", "onItemClick: " + a);
                if (a.equalsIgnoreCase("kedi")) {
                    dinleme.sendarraylist(lstcontact6, position);
                    startActivity(new Intent(hayvan.this, dinleme.class));


                } else if (a.equalsIgnoreCase("köpek")) {
                    dinleme.sendarraylist(lstcontact6, position);
                    startActivity(new Intent(hayvan.this, dinleme.class));

                } else if (a.equalsIgnoreCase("aslan")) {
                    dinleme.sendarraylist(lstcontact6, position);
                    startActivity(new Intent(hayvan.this, dinleme.class));

                } else if (a.equalsIgnoreCase("yilan")) {
                    dinleme.sendarraylist(lstcontact6, position);
                    startActivity(new Intent(hayvan.this, dinleme.class));

                } else if (a.equalsIgnoreCase("fil")) {
                    dinleme.sendarraylist(lstcontact6, position);
                    startActivity(new Intent(hayvan.this, dinleme.class));

                } else if (a.equalsIgnoreCase("ari")) {
                    dinleme.sendarraylist(lstcontact6, position);
                    startActivity(new Intent(hayvan.this, dinleme.class));

                }
                else if (a.equalsIgnoreCase("kurt")) {
                    dinleme.sendarraylist(lstcontact6, position);
                    startActivity(new Intent(hayvan.this, dinleme.class));

                }
                else if (a.equalsIgnoreCase("tavuk")) {
                    dinleme.sendarraylist(lstcontact6, position);
                    startActivity(new Intent(hayvan.this, dinleme.class));

                }
                else if (a.equalsIgnoreCase("civciv")) {
                    dinleme.sendarraylist(lstcontact6, position);
                    startActivity(new Intent(hayvan.this, dinleme.class));

                }
                else if (a.equalsIgnoreCase("at")) {
                    dinleme.sendarraylist(lstcontact6, position);
                    startActivity(new Intent(hayvan.this, dinleme.class));

                }
                else if (a.equalsIgnoreCase("eşek")) {
                    dinleme.sendarraylist(lstcontact6, position);
                    startActivity(new Intent(hayvan.this, dinleme.class));

                }
                else if (a.equalsIgnoreCase("inek")) {
                    dinleme.sendarraylist(lstcontact6, position);
                    startActivity(new Intent(hayvan.this, dinleme.class));

                }
                else if (a.equalsIgnoreCase("kuzu")) {
                    dinleme.sendarraylist(lstcontact6, position);
                    startActivity(new Intent(hayvan.this, dinleme.class));

                }
                else if (a.equalsIgnoreCase("horoz")) {
                    dinleme.sendarraylist(lstcontact6, position);
                    startActivity(new Intent(hayvan.this, dinleme.class));

                }
            }
        });
    }
}



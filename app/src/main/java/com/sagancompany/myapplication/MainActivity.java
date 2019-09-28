package com.sagancompany.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    RecyclerView recyclerView;
    EmreAdapter mAdapter;


    RecyclerView.LayoutManager mLayoutManager;

    View v;
    private ArrayList<Manzara> lstcontact;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lstcontact=new ArrayList<>();









        doldur();
        recycleryap();











    }
    public void doldur(){

        int resimler[]={R.drawable.aslan,R.drawable.kirmizi,R.drawable.ninni
        };
        Resources res = getResources();
        String[] icerik1 = res.getStringArray(R.array.icerik);
        Log.e("alo",icerik1[0]);

        for (int i = 0; i <resimler.length ; i++) {

            Manzara gecici=new Manzara(icerik1[i],"",resimler[i]);

            lstcontact.add(gecici);
        }

    }
    public void recycleryap(){


        recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        mLayoutManager=new LinearLayoutManager(this);
        mAdapter =new EmreAdapter(getApplicationContext(),lstcontact);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new EmreAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {

                String a=lstcontact.get(position).getBaslik();
                Toast.makeText(getApplicationContext(),a,Toast.LENGTH_LONG).show();


                if (a.equalsIgnoreCase("masallar")) {
                    startActivity(new Intent(MainActivity.this, masal.class));

                }
                else if(a.equalsIgnoreCase("ninniler")){

                    startActivity(new Intent(MainActivity.this, ninni.class));




                }   else if(a.equalsIgnoreCase("hayvan sesleri")){

                    startActivity(new Intent(MainActivity.this, hayvan.class));




                }


                Log.e("alo", a);
            }
        });


    }
}

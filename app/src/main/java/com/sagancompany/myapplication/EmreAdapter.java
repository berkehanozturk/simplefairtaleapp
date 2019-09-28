package com.sagancompany.myapplication;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class EmreAdapter extends RecyclerView.Adapter<EmreAdapter.MyViewHolder> {

    private OnItemClickListener mListener;

    ArrayList<Manzara>mDataList;
    public interface OnItemClickListener{
        void onItemClick(int position);

    }
    public void setOnItemClickListener(OnItemClickListener listener){
        mListener=listener;

    }




    LayoutInflater inflater;

    Context c;
    Dialog myDialog;


    public  EmreAdapter(Context context ,ArrayList<Manzara> data){
       this.c = context;


        this.mDataList=data;


    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {



        View v = LayoutInflater.from(c).inflate(R.layout.item_line,parent,false);
        final MyViewHolder holder=new MyViewHolder(v,mListener);


        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.mManzaraAciklama.setText(mDataList.get(position).getTanim());
        holder.mManzaraBaslik.setText(mDataList.get(position).getBaslik());

        Manzara tiklanilanManzara = mDataList.get(position);
        holder.setData(tiklanilanManzara,position);


    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
 public TextView mManzaraBaslik,mManzaraAciklama;
 public ImageView mManzaraResmi;
public LinearLayout item_contact;
public CardView list_item;





        public MyViewHolder(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);
            list_item= (CardView)itemView.findViewById(R.id.rootCardView);

            item_contact= (LinearLayout)itemView.findViewById(R.id.concat_item_id);
            mManzaraBaslik= (TextView) itemView.findViewById(R.id.Baslik);
            mManzaraAciklama= (TextView) itemView.findViewById(R.id.Aciklama);
            mManzaraResmi=(ImageView)itemView.findViewById(R.id.manzara);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(listener!= null){

                        int position = getAdapterPosition();
                        if(position!=RecyclerView.NO_POSITION){
                            listener.onItemClick(position);

                        }
                    }
                }
            });

        }

        public void setData(Manzara tiklanilanManzara, int position) {

            this.mManzaraBaslik.setText(tiklanilanManzara.getBaslik());
            this.mManzaraAciklama.setText(tiklanilanManzara.getTanim());
            Picasso.get().load(tiklanilanManzara.getImageID()).into(mManzaraResmi);

        }
    }
}

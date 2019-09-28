package com.sagancompany.myapplication;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class ViewHolder extends RecyclerView.ViewHolder {
    static View mViev;

    public ViewHolder(View itemView){

        super(itemView);
        mViev=itemView;


    }

    public  void  setDetails(Context ctx,String Title,String description,String image){


        TextView mTitleTv=mViev.findViewById(R.id.Baslik);
        TextView mDetailTv=mViev.findViewById(R.id.Aciklama);
        ImageView mImageTv =mViev.findViewById(R.id.manzara);


        //set data

        mTitleTv.setText(Title);
        mDetailTv.setText(description);
        Picasso.get().load(image).into(mImageTv);


    }


}

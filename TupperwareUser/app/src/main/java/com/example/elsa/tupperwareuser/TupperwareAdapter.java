package com.example.elsa.tupperwareuser;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.elsa.tupperwareuser.Rest.ApiInterface;


import java.util.List;

public class TupperwareAdapter extends RecyclerView.Adapter<TupperwareAdapter.TupperwareViewHolder> {
    List<Tupperware> listTupperware;
    ApiInterface mApiInterface;

    public TupperwareAdapter(List<Tupperware> listTupperware, Context mContex) {
        this.listTupperware = listTupperware;

    }

    @Override
    public TupperwareViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_tupperware, parent, false);
        TupperwareViewHolder mHolder = new TupperwareViewHolder(view);
        return mHolder;
    }


    @Override
    public void onBindViewHolder(TupperwareViewHolder holder, int position) {


        holder.tvId_Tup.setText(listTupperware.get(position).getId_Tup());
        holder.tvnama.setText(listTupperware.get(position).getNama());
        holder.tvjenis_tup.setText(listTupperware.get(position).getJenis());
        holder.tvWarna.setText (listTupperware.get(position).getWarna());
        holder.tvHarga.setText(listTupperware.get(position).getHarga());


        if (listTupperware.get(position).getPhotoUrl() != null ){

            Glide.with(holder.itemView.getContext()).load(listTupperware.get
                    (position).getPhotoUrl())
                    .into(holder.mPhotoURL);
        } else {


            Glide.with(holder.itemView.getContext()).load(R.drawable.minum).into(holder
                    .mPhotoURL);

        }

    }

    @Override
    public int getItemCount() {
        return listTupperware.size();
    }

    public class TupperwareViewHolder extends RecyclerView.ViewHolder{
        ImageView mPhotoURL;
        TextView tvId_Tup, tvnama, tvjenis_tup , tvWarna, tvHarga;

        public TupperwareViewHolder(View itemView) {

            super(itemView);

            mPhotoURL = (ImageView) itemView.findViewById(R.id.imgminum);
            tvId_Tup = (TextView) itemView.findViewById(R.id.tvIdTupperware);
            tvnama = (TextView) itemView.findViewById(R.id.tvnamaContent);
            tvjenis_tup = (TextView) itemView.findViewById(R.id.tvjenisContent);
            tvWarna = (TextView) itemView.findViewById(R.id.tvWarnaContent);
            tvHarga = (TextView) itemView.findViewById(R.id.tvHargaContent);
            final ImageView imageView = (ImageView)itemView.findViewById(R.id.imageview_cover_art);
            final ImageView imageViewFavorite = (ImageView)itemView.findViewById(R.id.imageview_favorite);


        }
    }

}


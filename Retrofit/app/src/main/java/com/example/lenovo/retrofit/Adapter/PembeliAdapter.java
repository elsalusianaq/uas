package com.example.lenovo.retrofit.Adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



import com.bumptech.glide.Glide;
import com.example.lenovo.retrofit.LayarEditPembeli;
import com.example.lenovo.retrofit.Model.Pembeli;
import com.example.lenovo.retrofit.R;
import com.example.lenovo.retrofit.Rest.ApiClient;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PembeliAdapter extends RecyclerView.Adapter<PembeliAdapter.PembeliViewHolder> {

    List<Pembeli> listPembeli;

    public PembeliAdapter(List<Pembeli> listPembeli) {
        this.listPembeli = listPembeli;
    }

    @Override
    public PembeliAdapter.PembeliViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_pembeli, parent, false);
        PembeliViewHolder mHolder = new PembeliViewHolder(view);
        return mHolder;
    }

    @Override
    public void onBindViewHolder(PembeliAdapter.PembeliViewHolder holder, final int position) {

//        holder.mPhotoURL.setImageResource(listPembeli.get(position).getPhotoUrl());
        holder.tvIdPembeli.setText(listPembeli.get(position).getIdPembeli());
        holder.tvNama.setText(listPembeli.get(position).getNama());
        holder.tvAlamat.setText(listPembeli.get(position).getAlamat());
        holder.tvTelp.setText(listPembeli.get(position).getTelp());
        if (listPembeli.get(position).getPhotoUrl() != null ){
//            Picasso.with(holder.itemView.getContext()).load(ApiClient.BASE_URL+listPembeli.get(position).getPhotoUrl())
//                    .into(holder.mPhotoURL);
            Glide.with(holder.itemView.getContext()).load(listPembeli.get
                    (position).getPhotoUrl())
                    .into(holder.mPhotoURL);
        } else {
//          Picasso.with(holder.itemView.getContext()).load(R.drawable.biru).into(holder
// .mPhotoURL);
            Glide.with(holder.itemView.getContext()).load(R.drawable.tas).into(holder
                    .mPhotoURL);


        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), LayarEditPembeli.class);
                intent.putExtra("id_pembeli", listPembeli.get(position).getIdPembeli());
                intent.putExtra("nama", listPembeli.get(position).getNama());
                intent.putExtra("alamat", listPembeli.get(position).getAlamat());
                intent.putExtra("telp", listPembeli.get(position).getTelp());
                intent.putExtra("photo_url", listPembeli.get(position).getPhotoUrl());
                view.getContext().startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return listPembeli.size();
    }

    public class PembeliViewHolder extends RecyclerView.ViewHolder {
        ImageView mPhotoURL;
        TextView tvIdPembeli, tvNama, tvAlamat, tvTelp;

        public PembeliViewHolder(View itemView) {
            super(itemView);
            mPhotoURL = (ImageView) itemView.findViewById(R.id.imgPembeli);
            tvIdPembeli = (TextView) itemView.findViewById(R.id.tvIdPembeli);
            tvNama = (TextView) itemView.findViewById(R.id.tvNama);
            tvAlamat = (TextView) itemView.findViewById(R.id.tvAlamatContent);
            tvTelp = (TextView) itemView.findViewById(R.id.tvTelpContent);
        }
    }


}

package com.example.lenovo.retrofit.Adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lenovo.retrofit.LayarDetail;
import com.example.lenovo.retrofit.Model.Pembelian;
import com.example.lenovo.retrofit.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    List<Pembelian> mPembelianList;

    public MyAdapter(List<Pembelian> pembelianList) {
        mPembelianList = pembelianList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        MyViewHolder mViewHolder = new MyViewHolder(mView);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.mTextViewIdPembelian.setText("Id Pembelian :  " + mPembelianList.get(position)
                .getId_pembelian());
        holder.mTextViewIdPembeli.setText("Id Pembeli :  " + mPembelianList.get(position)
                .getId_pembeli());
        holder.mTextViewIdTup.setText("Id Tup :  " + mPembelianList.get(position).getId_tup
                ());
        holder.mTextViewTanggal.setText("Tanggal Beli :  " + mPembelianList.get(position)
                .getTanggal_beli());
        holder.mTextViewTotalHarga.setText("Total Harga :  " + String.valueOf(mPembelianList.get
                (position).getTotal_harga()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mintent = new Intent(v.getContext(), LayarDetail.class);
                mintent.putExtra("id_pembelian",mPembelianList.get(position).getId_pembelian());
                mintent.putExtra("id_pembeli",mPembelianList.get(position).getId_pembeli());
                mintent.putExtra("tanggal_beli",mPembelianList.get(position).getTanggal_beli());
                mintent.putExtra("id_tup",mPembelianList.get(position).getId_tup());
                mintent.putExtra("total_harga",String.valueOf(mPembelianList.get(position).getTotal_harga()));
                v.getContext().startActivity(mintent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return mPembelianList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextViewIdPembelian, mTextViewIdPembeli, mTextViewTanggal,mTextViewIdTup,mTextViewTotalHarga;
        public MyViewHolder(View itemView) {
            super(itemView);
            mTextViewIdPembelian = (TextView) itemView.findViewById(R.id.tvIdPembelian);
            mTextViewIdPembeli = (TextView) itemView.findViewById(R.id.tvIdPembeli);
            mTextViewTanggal = (TextView) itemView.findViewById(R.id.tvTanggalBeli);
            mTextViewIdTup = (TextView) itemView.findViewById(R.id.tvIdTup);
            mTextViewTotalHarga = (TextView) itemView.findViewById(R.id.tvTotalHarga);
        }
    }

}

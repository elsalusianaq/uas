package com.example.elsa.tupperwareuser;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;

import com.example.elsa.tupperwareuser.Rest.ApiClient;
import com.example.elsa.tupperwareuser.Rest.ApiInterface;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LayarListTupperware extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager mLayoutManager;
    Context mContext;
    ApiInterface mApiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layar_list_tupperware);

        mContext = getApplicationContext();
        mRecyclerView = (RecyclerView) findViewById(R.id.list_data_tupperware);

        mLayoutManager = new LinearLayoutManager(mContext);
        mRecyclerView.setLayoutManager(mLayoutManager);

        dapatkanData();
    }

    private void dapatkanData() {
        mApiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<GetTupperware> mTupperwareCall = mApiInterface.getTupperware();
        mTupperwareCall.enqueue(new Callback<GetTupperware>() {
            @Override
            public void onResponse(Call<GetTupperware> call, Response<GetTupperware> response) {
                Log.d("GetTupperware",String.valueOf(response.body().getResult()));
                List<Tupperware> listTupperware = response.body().getResult();
                mAdapter = new TupperwareAdapter(listTupperware, LayarListTupperware.this);
                mRecyclerView.setAdapter(mAdapter);
            }
            @Override
            public void onFailure(Call<GetTupperware> call, Throwable  t) {
                Log.d("Get Tupperware",t.getMessage());
            }
        });



    }
}


package com.example.lenovo.retrofit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class OpsiMenu extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_layout, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent mIntent;
        switch (item.getItemId()) {

            case R.id.menulisPembelian:
                mIntent = new Intent(this, MainActivity.class);
                startActivity(mIntent);
                return true;

            case R.id.menuTambahTransPembelian:
                mIntent = new Intent(this, LayarDetail.class);
                startActivity(mIntent);
                return true;

            case R.id.menuListPembeli:
                mIntent = new Intent(this, LayarListPembeli.class);
                startActivity(mIntent);
                return true;

            case R.id.menuInsertDataPembeli:
                Intent intent = new Intent(this, LayarInsertPembeli.class);
                startActivity(intent);
                return true;


            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

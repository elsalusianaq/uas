package com.example.elsa.tupperwareuser;

import com.google.gson.annotations.SerializedName;

public class Tupperware {
    @SerializedName("id_tup")
    private String id_Tup;
    @SerializedName("nama")
    private String nama;
    @SerializedName("jenis_tup")
    private String jenis;
    @SerializedName("warna_tup")
    private String warna;
    @SerializedName("harga")
    private int harga;
    @SerializedName("photo_url")
   private String photoUrl;
    private String action;
//    private boolean isFavorite = false;

    public Tupperware(String id_Tup, String nama, String jenis_tup, String warna_tup, int harga, String
            action) {
        this.id_Tup= id_Tup;
        this.nama = nama;
        this.jenis = jenis_tup;
        this.warna = warna_tup;
        this.harga = harga;
//        this.photoUrl = photoUrl;
        this.action = action;
    }

    public String getId_Tup() {
        return id_Tup;
    }

    public void setId_Tup(String id_Tup) {
        this.id_Tup = id_Tup;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String Warna) {
        this.warna = warna;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }


    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getAction() { return action; }

    public void setAction(String action) {
        this.action = action;
    }



}

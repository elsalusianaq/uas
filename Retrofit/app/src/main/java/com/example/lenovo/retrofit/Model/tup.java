package com.example.lenovo.retrofit.Model;

import com.google.gson.annotations.SerializedName;

public class tup {
    public class Pembeli {
        @SerializedName("id_tup")
        private String idTup;
        @SerializedName("nama")
        private String nama;
        @SerializedName("jenis_tup")
        private String jenis_tup;
        @SerializedName("warna_tup")
        private String warna_tup;
        @SerializedName("harga")
        private String harga;
        private String action;

        public Pembeli(String idTup, String nama, String jenis_tup, String warna_tup, String harga, String
                action) {
            this.idTup = idTup;
            this.nama = nama;
            this.jenis_tup = jenis_tup;
            this.warna_tup = warna_tup;
            this.harga = harga;
            this.action = action;
        }

        public String getIdTup() {
            return idTup;
        }

        public void setIdTup(String idTup) {
            this.idTup = idTup;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getJenis_tup() {
            return jenis_tup;
        }

        public void setJenis_tup(String jenis_tup) {
            this.jenis_tup = jenis_tup;
        }

        public String getWarna_tup() { return warna_tup; }

        public void setWarna_tup(String warna_tup) {
            this.warna_tup = warna_tup;
        }

        public String getHarga() {
            return harga;
        }

        public void setHarga(String harga) {
            this.harga = harga;
        }

        public String getAction() { return action; }

        public void setAction(String action) {
            this.action = action;
        }

    }

}

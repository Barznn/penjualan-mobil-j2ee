package com.penjualan.model;

import java.math.BigDecimal;

public class Mobil {
    private int id;
    private String nama;
    private String merk;
    private long harga;
    private int tahun;
    private String warna;
    private String transmisi;
    private String deskripsi;
    private String gambar;
    private String status;

    public Mobil() {}

    public Mobil(String nama, String merk, long harga, int tahun, String warna, 
                 String transmisi, String deskripsi, String gambar, String status) {
        this.nama = nama;
        this.merk = merk;
        this.harga = harga;
        this.tahun = tahun;
        this.warna = warna;
        this.transmisi = transmisi;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public long getHarga() {
        return harga;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getTransmisi() {
        return transmisi;
    }

    public void setTransmisi(String transmisi) {
        this.transmisi = transmisi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHargaFormatted() {
        return String.format("Rp %,d", harga).replace(",", ".");
    }
}

package com.penjualan.model;

import java.time.LocalDateTime;

public class Pembelian {
    private int id;
    private int userId;
    private int mobilId;
    private long hargaPembelian;
    private LocalDateTime tanggalPembelian;
    private String statusPembayaran;
    private String namaMobil;
    private String merkMobil;

    public Pembelian() {}

    public Pembelian(int userId, int mobilId, long hargaPembelian, String statusPembayaran) {
        this.userId = userId;
        this.mobilId = mobilId;
        this.hargaPembelian = hargaPembelian;
        this.statusPembayaran = statusPembayaran;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getMobilId() {
        return mobilId;
    }

    public void setMobilId(int mobilId) {
        this.mobilId = mobilId;
    }

    public long getHargaPembelian() {
        return hargaPembelian;
    }

    public void setHargaPembelian(long hargaPembelian) {
        this.hargaPembelian = hargaPembelian;
    }

    public LocalDateTime getTanggalPembelian() {
        return tanggalPembelian;
    }

    public void setTanggalPembelian(LocalDateTime tanggalPembelian) {
        this.tanggalPembelian = tanggalPembelian;
    }

    public String getStatusPembayaran() {
        return statusPembayaran;
    }

    public void setStatusPembayaran(String statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }

    public String getNamaMobil() {
        return namaMobil;
    }

    public void setNamaMobil(String namaMobil) {
        this.namaMobil = namaMobil;
    }

    public String getMerkMobil() {
        return merkMobil;
    }

    public void setMerkMobil(String merkMobil) {
        this.merkMobil = merkMobil;
    }

    public String getHargaFormatted() {
        return String.format("Rp %,d", hargaPembelian).replace(",", ".");
    }
}

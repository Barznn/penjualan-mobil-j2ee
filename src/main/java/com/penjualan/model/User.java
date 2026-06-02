package com.penjualan.model;

public class User {
    private int id;
    private String nama;
    private String email;
    private String password;
    private String noTelp;
    private String alamat;

    public User() {}

    public User(String nama, String email, String password, String noTelp, String alamat) {
        this.nama = nama;
        this.email = email;
        this.password = password;
        this.noTelp = noTelp;
        this.alamat = alamat;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

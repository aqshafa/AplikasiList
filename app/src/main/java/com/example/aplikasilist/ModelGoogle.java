package com.example.aplikasilist;

public class ModelGoogle {
    private String id;
    private String judul;
    private int gambar;

    public ModelGoogle(String id, String judul, int gambar) {
        this.id = id;
        this.judul = judul;
        this.gambar = gambar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}

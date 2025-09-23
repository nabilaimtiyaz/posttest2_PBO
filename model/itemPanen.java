/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */
public class itemPanen {
    
    private String kategori;
    private String nama;
    private double beratKg;
    private String kualitas;

    public itemPanen(String kategori, String nama, double beratKg, String kualitas) {
        this.kategori = kategori;
        this.nama = nama;
        this.beratKg = beratKg;
        this.kualitas = kualitas;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getBeratKg() {
        return beratKg;
    }

    public void setBeratKg(double beratKg) {
        this.beratKg = beratKg;
    }

    public String getKualitas() {
        return kualitas;
    }

    public void setKualitas(String kualitas) {
        this.kualitas = kualitas;
    }

    @Override
    public String toString() {
        return kategori + " | " + nama + " | " + beratKg + " Kg | " + kualitas;
    }
}

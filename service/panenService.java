/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.util.ArrayList;
import java.util.Scanner;
import model.itemPanen;

/**
 *
 * @author User
 */
public class panenService {

    private ArrayList<itemPanen> daftarPanen = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void tambahItem() {
        System.out.print("Masukkan kategori (Sayur/Buah): ");
        String kategori = scanner.nextLine();
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan berat (Kg): ");
        double berat = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Masukkan kualitas: ");
        String kualitas = scanner.nextLine();

        daftarPanen.add(new itemPanen(kategori, nama, berat, kualitas));
        System.out.println("Data panen berhasil ditambahkan.");
    }

    public void tampilkanItem() {
        if (daftarPanen.isEmpty()) {
            System.out.println("Belum ada data panen.");
        } else {
            System.out.println("===== Daftar Hasil Panen =====");
            for (int i = 0; i < daftarPanen.size(); i++) {
                System.out.println((i + 1) + ". " + daftarPanen.get(i));
            }
        }
    }

    public void editItem() {
        tampilkanItem();
        if (daftarPanen.isEmpty()) return;

        System.out.print("Pilih nomor item yang mau diedit: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index >= 0 && index < daftarPanen.size()) {
            System.out.print("Kategori baru: ");
            String kategori = scanner.nextLine();
            System.out.print("Nama baru: ");
            String nama = scanner.nextLine();
            System.out.print("Berat baru (Kg): ");
            double berat = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Kualitas baru: ");
            String kualitas = scanner.nextLine();

            daftarPanen.set(index, new itemPanen(kategori, nama, berat, kualitas));
            System.out.println("Item berhasil diedit.");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    public void hapusItem() {
        tampilkanItem();
        if (daftarPanen.isEmpty()) return;

        System.out.print("Pilih nomor item yang mau dihapus: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index >= 0 && index < daftarPanen.size()) {
            daftarPanen.remove(index);
            System.out.println("Item berhasil dihapus.");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    public void cariItem() {
        System.out.print("Masukkan nama item yang dicari: ");
        String keyword = scanner.nextLine().toLowerCase();

        boolean ditemukan = false;
        for (itemPanen p : daftarPanen) {
            if (p.getNama().toLowerCase().contains(keyword)) {
                System.out.println("Ditemukan: " + p);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Item tidak ditemukan.");
        }
    }
}
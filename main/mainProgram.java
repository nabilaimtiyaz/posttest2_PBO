/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.util.Scanner;
import service.panenService;
/**
 *
 * @author User
 */
public class mainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        panenService service = new panenService();

        int pilihan;
        do {
            System.out.println("\n===== Menu Hasil Panen =====");
            System.out.println("1. Tambah Item");
            System.out.println("2. Lihat Item");
            System.out.println("3. Edit Item");
            System.out.println("4. Hapus Item");
            System.out.println("5. Cari Item");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1: service.tambahItem(); break;
                case 2: service.tampilkanItem(); break;
                case 3: service.editItem(); break;
                case 4: service.hapusItem(); break;
                case 5: service.cariItem(); break;
                case 6: System.out.println("Terima kasih yaa"); break;
                default: System.out.println("️Pilihan tidak valid.");
            }
        } while (pilihan != 6);

        scanner.close();
    }
}
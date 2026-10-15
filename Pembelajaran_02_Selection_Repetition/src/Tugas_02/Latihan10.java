package Tugas_02;

import java.util.Scanner;

public class Latihan10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int PIN = 252310030;    // PIN = NPM anda
        long saldo = 50000;         // saldo awal

        int pin;
        do {
            System.out.print("Masukkan PIN: ");
            pin = sc.nextInt();
            if (pin != PIN) System.out.println("PIN salah, silakan coba lagi.");
        } while (pin != PIN);

        char keluar = 'n';
        do {
            System.out.println("\n=== MENU ATM ===");
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Masukkan menu: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Saldo anda: Rp " + saldo);
                    break;
                case 2:
                    System.out.print("Masukkan nominal setor tunai: ");
                    saldo += sc.nextLong();
                    System.out.println("Saldo anda: Rp " + saldo);
                    break;
                case 3:
                    System.out.print("Masukkan nominal tarik tunai: ");
                    long tarik = sc.nextLong();
                    if (tarik <= saldo) {
                        saldo -= tarik;
                        System.out.println("Saldo anda: Rp " + saldo);
                    } else {
                        System.out.println("Saldo tidak cukup.");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }

            System.out.print("Apakah anda akan keluar aplikasi? (y/n) : ");
            keluar = sc.next().charAt(0);
        } while (keluar == 'n' || keluar == 'N');

        System.out.println("Terimakasih telah menggunakan ATM.");
        sc.close();
    }
}
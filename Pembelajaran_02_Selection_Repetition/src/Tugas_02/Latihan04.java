package Tugas_02;

import java.util.Scanner;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NPM anda: ");
        int npm = sc.nextInt();

        if (npm < 20) {
            System.out.println("Nilai NPM tidak boleh kurang dari 20.");
        } else {
            System.out.print("Masukkan nilai yang akan difaktorkan: ");
            int nilai = sc.nextInt();

            if (nilai < 20) {
                System.out.println("Nilai inputan factor tidak boleh kurang dari 20.");
            } else {
                String hasil = "";
                if (npm % 2 == 0) {                       // GENAP -> ASCENDING
                    for (int i = 1; i <= nilai; i++)
                        if (nilai % i == 0) hasil += (hasil.isEmpty() ? "" : ", ") + i;
                    System.out.println("ASC: Faktor " + nilai + " adalah " + hasil);
                } else {                                  // GANJIL -> DESCENDING
                    for (int i = nilai; i >= 1; i--)
                        if (nilai % i == 0) hasil += (hasil.isEmpty() ? "" : ", ") + i;
                    System.out.println("DESC: Faktor " + nilai + " adalah " + hasil);
                }
            }
        }
        sc.close();
    }
}
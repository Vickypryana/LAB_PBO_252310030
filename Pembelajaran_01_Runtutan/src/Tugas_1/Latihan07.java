package Tugas_1;

import java.util.Scanner;

public class Latihan07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nama lengkap: ");
        String nama = sc.nextLine();
        String hasil = nama.replaceAll("[aiueoAIUEO]", "X");
        System.out.println("Hasil: " + hasil);
        sc.close();
    }
}
package Tugas_02;

import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NPM anda: ");
        int npm = sc.nextInt();
        System.out.print("Masukkan jumlah baris: ");
        int n = sc.nextInt();

        int size = (2 * n) - 4;      // ukuran sisi persegi
        int t = (size / 2) - 1;      // batas ketebalan pola

        if (npm % 2 != 0) {
            // NPM GANJIL -> WHILE
            int r = 0;
            while (r < size) {
                int c = 0;
                while (c < size) {
                    int dr = Math.min(r, size - 1 - r);
                    int dc = Math.min(c, size - 1 - c);
                    System.out.print((dr + dc <= t) ? "* " : "  ");
                    c++;
                }
                System.out.println();
                r++;
            }
        } else {
            // NPM GENAP -> FOR
            for (int r = 0; r < size; r++) {
                for (int c = 0; c < size; c++) {
                    int dr = Math.min(r, size - 1 - r);
                    int dc = Math.min(c, size - 1 - c);
                    System.out.print((dr + dc <= t) ? "* " : "  ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
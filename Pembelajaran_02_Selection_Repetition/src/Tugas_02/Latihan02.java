package Tugas_02;

import java.util.Scanner;

public class Latihan02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NPM anda: ");
        int npm = sc.nextInt();

        boolean prima = npm >= 2;
        int pembagi = -1;
        for (int i = 2; i <= npm / 2; i++) {
            if (npm % i == 0) { prima = false; pembagi = i; break; }
        }

        if (prima) System.out.println("Termasuk bilangan PRIMA");
        else System.out.println("Bukan termasuk bilangan prima karena dapat dibagi dengan " + pembagi);
        sc.close();
    }
}
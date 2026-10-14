package Tugas_1;

import java.util.Scanner;

public class Latihan06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Usia      : ");
        int usia = sc.nextInt();
        System.out.print("Masukan Firstname : ");
        String firstname = sc.next();
        System.out.print("Masukan Lastname  : ");
        String lastname = sc.next();
        System.out.print("Masukan NPM       : ");
        String npm = sc.next();

        // CONCAT : penggabungan nilai variabel
        System.out.println("Output: " + usia + firstname + lastname + npm);

        sc.close();
    }
}
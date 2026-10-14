package Tugas_1;

import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan kata/kalimat: ");
        String input = sc.nextLine();
        System.out.println("Hasil: " + input.toUpperCase());
        sc.close();
    }
}
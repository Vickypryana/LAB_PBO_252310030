package Tugas_1;

import java.util.Scanner;

public class Latihan03 {
    // Class Variable
    static double luas, keliling, volume;
    static final double PHI = 3.14;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SEGITIGA KERUCUT ===");
        System.out.print("Jari-jari alas : ");
        double r = sc.nextDouble();          // Local Variable
        System.out.print("Tinggi         : ");
        double t = sc.nextDouble();
        hitungKerucut(r, t);                 // METHOD TANPA NILAI BALIK

        System.out.println("\n=== LAYANG-LAYANG ===");
        System.out.print("Diagonal 1 : ");
        double d1 = sc.nextDouble();
        System.out.print("Diagonal 2 : ");
        double d2 = sc.nextDouble();
        System.out.print("Sisi pendek : ");
        double a = sc.nextDouble();
        System.out.print("Sisi panjang: ");
        double b = sc.nextDouble();
        luas = luasLayang(d1, d2);           // METHOD DENGAN NILAI BALIK
        keliling = kelilingLayang(a, b);
        System.out.println("Luas     : " + luas);
        System.out.println("Keliling : " + keliling);

        System.out.println("\n=== TABUNG ===");
        System.out.print("Jari-jari : ");
        r = sc.nextDouble();
        System.out.print("Tinggi    : ");
        t = sc.nextDouble();
        hitungTabung(r, t);                  // METHOD TANPA NILAI BALIK

        System.out.println("\n=== PRISMA SEGITIGA ===");
        System.out.print("Alas segitiga   : ");
        double alas = sc.nextDouble();
        System.out.print("Tinggi segitiga : ");
        double tSegitiga = sc.nextDouble();
        System.out.print("Tinggi prisma   : ");
        double tPrisma = sc.nextDouble();
        System.out.println("Luas Permukaan : " + luasPrisma(alas, tSegitiga, tPrisma));
        System.out.println("Volume         : " + volumePrisma(alas, tSegitiga, tPrisma));

        sc.close();
    }

    // Method TANPA nilai balik (void), hasil disimpan ke class variable
    static void hitungKerucut(double r, double t) {
        double s = Math.sqrt((r * r) + (t * t));   // garis pelukis
        volume = (1.0 / 3) * PHI * r * r * t;
        luas = PHI * r * (r + s);
        keliling = 2 * PHI * r;
        System.out.println("Luas Permukaan : " + luas);
        System.out.println("Keliling Alas  : " + keliling);
        System.out.println("Volume         : " + volume);
    }

    // Method TANPA nilai balik (void)
    static void hitungTabung(double r, double t) {
        volume = PHI * r * r * t;
        luas = 2 * PHI * r * (r + t);
        keliling = 2 * PHI * r;
        System.out.println("Luas Permukaan : " + luas);
        System.out.println("Keliling Alas  : " + keliling);
        System.out.println("Volume         : " + volume);
    }

    // Method DENGAN nilai balik
    static double luasLayang(double d1, double d2) {
        return (d1 * d2) / 2;
    }

    static double kelilingLayang(double a, double b) {
        return 2 * (a + b);
    }

    static double luasPrisma(double alas, double tSegitiga, double tPrisma) {
        double luasAlas = (alas * tSegitiga) / 2;
        return (2 * luasAlas) + (3 * alas * tPrisma);
    }

    static double volumePrisma(double alas, double tSegitiga, double tPrisma) {
        double luasAlas = (alas * tSegitiga) / 2;
        return luasAlas * tPrisma;
    }
}
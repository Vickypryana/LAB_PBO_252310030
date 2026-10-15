package Tugas_02;

public class Resto {
    private long Harga;

    public void chooseMenu() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Menu Sarapan:");
        System.out.println("    1. Nasi Goreng");
        System.out.println("    2. Bubur Ayam");
        System.out.println("    3. Soto Ayam");
        System.out.print("Masukkan pilihan menu: ");
        int pilihan = sc.nextInt();
        System.out.println("Harga: Rp " + getPrices(pilihan));
    }

    private long getPrices(int value) {
        switch (value) {
            case 1:  Harga = 22000; break;
            case 2:  Harga = 15000; break;
            case 3:  Harga = 25000; break;
            default: Harga = 0;     break;
        }
        return Harga;
    }
}
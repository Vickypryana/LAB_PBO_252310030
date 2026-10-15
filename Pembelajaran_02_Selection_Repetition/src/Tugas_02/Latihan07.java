package Tugas_02;

import java.util.Scanner;

public class Latihan07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Resto menu = new Resto();
        char pesanLagi;
        do {
            menu.chooseMenu();
            System.out.print("Apakah anda akan memesan kembali? (y/n) : ");
            pesanLagi = sc.next().charAt(0);
        } while (pesanLagi == 'y' || pesanLagi == 'Y');

        System.out.println("Terimakasih telah memesan.");
        sc.close();
    }
}

//8.
//+-------------------------------+         +---------------+
//|            Resto              |         |   Latihan07   |
//+-------------------------------+         +---------------+
//| - Harga : long                |    1    | main()        |
//+-------------------------------+  -----  +---------------+
//| + chooseMenu() : void         |    1    | menu : Resto  |
//| - getPrices(value:int) : long |         +---------------+
//+-------------------------------+
//
//9.
//Start → tampilkan menu & input pilihan → decision [1/2/3]? → ya: getPrices → set Harga
//→ cetak pesanan&harga / tidak: cetak "Maaf menu yang anda masukan salah." → gabung
//→ input "Apakah anda akan memesan kembali? (y/n)"
//→ y: kembali ke tampilkan menu / n: cetak "Terimakasih telah memesan." → End.
Kpackage Tugas_1;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Latihan10 {
    public static void main(String[] args) {
        final int HARGA_SATUAN = 6300;
        Scanner sc = new Scanner(System.in);
        Students myBio = new Students();   // nama member dari class Students (soal 9)

        System.out.println("============================================================");
        System.out.println("                     TOKO SERBAGUNA IBIK");
        System.out.println("============================================================");
        System.out.print("Masukan jumlah produk yang dibeli: ");
        int qty = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukan nama Member: ");
        String memberName = sc.nextLine();

        LocalDateTime waktu = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");
        System.out.println("\n" + waktu.format(fmt));

        int total = HARGA_SATUAN * qty;
        double diskonPersen = (qty % 3 == 0) ? 5 : 0;
        int subTotal = (int) (total - (total * diskonPersen / 100));

        System.out.printf("%-15s %6s %15s %15s%n", "ITEM", "QTY", "HARGA", "TOTAL");
        System.out.println("============================================================");
        System.out.printf("%-15s %6d %15s %15s%n",
                "ROTI ENAK.", qty, "Rp 6.300,-", "Rp " + String.format("%,d", total));
        System.out.println("------------------------------------------------------------");
        System.out.println("Diskon: " + (int) diskonPersen + "%");
        System.out.println("Sub Total: Rp " + String.format("%,d", subTotal) + ",-");
        System.out.println("Member Name: " + myBio.getFullname(memberName));   // di bawah SubTotal

        sc.close();
    }
}

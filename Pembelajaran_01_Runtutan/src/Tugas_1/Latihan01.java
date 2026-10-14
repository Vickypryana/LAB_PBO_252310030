package Tugas_1;

import java.util.Scanner;

public class Latihan01 {
    public static void main(String[] args) {
        // Local Variable
        double celcius, fahrenheit, reamur, kelvin;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan suhu dalam Celcius: ");
        celcius = input.nextDouble();

        fahrenheit = (celcius * 9 / 5) + 32;   // F = (C x 9/5) + 32
        reamur     = celcius * 4 / 5;          // R = C x 4/5
        kelvin     = celcius + 273.15;         // K = C + 273.15

        System.out.println("Hasil Konversi Suhu");
        System.out.println("Fahrenheit : " + fahrenheit);
        System.out.println("Reamur     : " + reamur);
        System.out.println("Kelvin     : " + kelvin);
    }
}
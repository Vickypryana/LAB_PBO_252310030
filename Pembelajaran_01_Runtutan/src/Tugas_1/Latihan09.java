package Tugas_1;

import java.util.Scanner;

public class Latihan09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students myBio = new Students();

        System.out.print("Masukan NPM       : ");
        Integer npm = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukan Fullname  : ");
        String fullname = sc.nextLine();
        System.out.print("Masukan ClassName : ");
        String className = sc.nextLine();
        System.out.print("Masukan Semester  : ");
        Integer semester = sc.nextInt();
        System.out.print("Masukan GPA       : ");
        Float gpa = sc.nextFloat();

        // Panggil 5 method di class Students
        System.out.println("\n===== BIODATA =====");
        System.out.println("NPM       : " + myBio.getNPM(npm));
        System.out.println("Fullname  : " + myBio.getFullname(fullname));
        System.out.println("ClassName : " + myBio.getClassName(className));
        System.out.println("Semester  : " + myBio.getSemester(semester));
        System.out.println("GPA       : " + myBio.getGPA(gpa));

        sc.close();
    }
}
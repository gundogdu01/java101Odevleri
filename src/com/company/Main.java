package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();

        int sonuc = mat+fizik+kimya+tarih+turkce+muzik;
        double ortalama = sonuc/6;
        System.out.println("Ortalamanız: "+ortalama);

        String durum = (ortalama > 60)? "Geçti" : "Kaldı";
        System.out.println("Sınıfı : "+durum);

    }
}

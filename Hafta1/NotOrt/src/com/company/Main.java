package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner k=new Scanner(System.in);

   int Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik,Toplam,ortalama;
   Matematik=k.nextInt();
   Fizik= k.nextInt();
   Kimya=k.nextInt();
   Türkçe=k.nextInt();
   Tarih=k.nextInt();
   Müzik=k.nextInt();

   Toplam=Matematik+Fizik+Kimya+Türkçe+Tarih+Müzik;
   ortalama=Toplam/6;
        System.out.println(ortalama);


    }
}

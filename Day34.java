package day34.java;

public class Day34Java {

    
    public static void main(String[] args) {
       
int umur = 18;
int tinggi = 165;
int  nilai = 80;

boolean ketentuanumur = umur>= 17 && umur <=20;
boolean syarattinggi = tinggi > 160 || nilai >=85;
boolean hasil = ketentuanumur && syarattinggi;

        System.out.println("ketentuan umur : " +ketentuanumur);
        System.out.println("syarat tinggi dan nilai: " +syarattinggi);
        System.out.println("apakah memenuhi semua ketentuan? " +hasil);
        }
    
}

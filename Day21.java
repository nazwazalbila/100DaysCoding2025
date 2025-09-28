package day21.java;


public class Day21Java {
    public static void main(String[] args) {
        
        int jumlah = 20;
        int angka = 15;
        
        System.out.println("Sebelum ditukar : jumlah = " +jumlah+ " angka = " +angka);
        
        jumlah = jumlah + angka;
        angka= jumlah - angka;
        jumlah= jumlah - angka;
        
        System.out.println("Sesudah ditukar : jumlah = " +jumlah+ " angka = " +angka);
        
    }
    
}

package day22.java;

import java.util.Scanner;

public class Day22Java {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan panjang sisi persegi : ");
        int sisi = input.nextInt();
        
        int luas= sisi*sisi;
        System.out.println("Luas persegi adalah : " +luas);
    }
    
}

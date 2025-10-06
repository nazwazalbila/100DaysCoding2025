package day29.java;

import java.util.Scanner;

public class Day29Java {

    public static void main(String[] args) {
        
    Scanner input = new Scanner (System.in);
        System.out.print("Masukkan angka :");
        int angka = input.nextInt();
        
        if (angka >15){
            System.out.println("Angkanya lebih besar dari 15");
        }else if (angka<15){
            System.out.println("Angkanya tidak lebih besar dari 15");
        }
    }
    
}

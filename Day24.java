package day24.java;

import java.util.Scanner;

public class DAy24Java {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan jari-jari lingkaran : ");
        double jarijari = input.nextDouble();
        
        double luas = Math.PI * jarijari * jarijari;
        
        System.out.printf("Luas lingkaran adalah = %.2f " ,luas);
    }
    
}

package day23.javaa;

import java.util.Scanner;


public class Day23Javaa {

    
    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan panjang : ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar : ");
        double lebar = input.nextDouble();
        
        double luas = panjang*lebar;
        
        System.out.println("Luas persegi panjang adalah : " +luas);
    }
    
}

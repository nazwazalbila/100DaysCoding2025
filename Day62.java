package Day62;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan nilai N : ");
        int nilai = sc.nextInt();
        
        int total =0;
        for (int i = 1; i <= nilai; i++){
            total = total + i;
     
        }
        System.out.println("Jumlah dari 1 sampai " +nilai+ " adalah : " +total);
    }
    
}

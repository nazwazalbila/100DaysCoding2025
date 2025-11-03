package Day57;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan jumlah baris : ");
        int jumlah = input.nextInt();
        
        for(int i = 1; i <= jumlah; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
  
}
 

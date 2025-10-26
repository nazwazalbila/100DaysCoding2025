package Day49;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan umur :");
        int umur = input.nextInt();
        
        String status = (umur>=18) ? "Dewasa" : "Belum Dewasa";
        
        System.out.println("status = " +status);
        
    }
 
}

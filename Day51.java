package Day51;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Berapa kali Anda ingin mencetak? :");
        int jumlah = input.nextInt();
        
        for (int i=1; i<=jumlah; i++){
            System.out.println("Hello word " +i);
        }
        
    }
    
} 

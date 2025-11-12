package Day66;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan jumlah  : ");
        int jumlah = input.nextInt();
        
        for (int i = 1; i <=jumlah; i++){
            System.out.println("=");
        }
    }
    
}

package Day70;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        
        System.out.print("Masukkan tinggi :");
        int tinggi = in.nextInt();
        System.out.print("Masukkan panjang :");
        int panjang = in.nextInt();
        
        for(int i=1; i<= tinggi; i++){
            for (int j= 1; j<=panjang; j++){
                System.out.print("*");
            }
        
        System.out.println();
        }
    }
  
}

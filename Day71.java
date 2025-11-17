package Day71;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        System.out.print("Masukkan nilai N :");
        int nilai =in.nextInt();
        for (int i = 1; i <= nilai; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    
    }
   
}

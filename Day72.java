package Day72;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        
        System.out.print("Masukkan jumlah baris :");
        int jumlah = in.nextInt();
        
        for (int i = jumlah; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    }
   


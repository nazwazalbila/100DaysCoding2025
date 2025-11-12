package Day67;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan jumlah simbol : ");
        int jumlahsimbol = input.nextInt();
        
        for (int i = 1; i <= jumlahsimbol; i++) {
            System.out.print("* "); 
        }
    }
    }

package Day60;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan nilai N :");
        int Nilai = input.nextInt();
        
        System.out.println("\nAngka Ganjil (1 sampai N-1):");
        for (int i = 1; i < Nilai; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nAngka Genap (1 sampai N-1):");
        for (int i = 1; i < Nilai; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
  
}

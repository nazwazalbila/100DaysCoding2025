package Day65;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan nilai N : ");
        int Nilai = input.nextInt();
        
        int hasil = 1;
        
        for (int i = 1; i <=Nilai; i++){
            hasil = hasil * i;
        }
        System.out.println("Hasil dari " +Nilai+ " ! adalah : " +hasil );
    }
  
}

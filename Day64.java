package Day64;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Nilai M : ");
        int M = input.nextInt();
        System.out.print("Masukkan Nilai N : ");
        int N = input.nextInt();
        
        int hasil = 1;
        
        for (int i =1; i <= N; i++){
            hasil = hasil * M;
        }
        System.out.println("Hasil dari " +M+ " Pangkat " +N+ " adalah : " +hasil);
    }
 
}

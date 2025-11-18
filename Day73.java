package Day73;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        int jumlah = 0;
        int angka;
        
        while (true){
            System.out.print("Masukkan angka :");
            angka = in.nextInt();
            if(angka < 0){
                break;
            }
            jumlah +=angka;
        }
        System.out.println("Total penjumlahan = " +jumlah);
    }
    
}

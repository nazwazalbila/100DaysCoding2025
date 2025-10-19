package Day42;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan gaji pokok : ");
        double gajipokok=input.nextDouble();
        
        double tunjangan = 0.2*gajipokok;
        double gajikotor = gajipokok+tunjangan;
        double pajak = 0.1* gajikotor;
        double gajibersih= gajikotor-pajak;
        
        System.out.println("Tunjangan = " +tunjangan);
        System.out.println("Pajak = " +pajak);
        System.out.println("Gaji bersih = " +gajibersih);
        
    }
    
}

package Day75;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Masukkan sebuah kalimat :");
        String kalimat = in.nextLine();
        
        int panjang = kalimat.length();
        String hurufBesar = kalimat.toUpperCase();
        String hurufKecil = kalimat.toLowerCase();
        
        System.out.println("Panjang kalimat: " + panjang);
        System.out.println("Huruf besar: " + hurufBesar);
        System.out.println("Huruf kecil: " + hurufKecil);
    
    }
 
}

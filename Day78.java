package Day78;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        System.out.print("Masukkan sebuah kalimat : ");
        String kalimat = in.nextLine();
        
        System.out.println("\n=== HASIL METHOD STRING ===");
        System.out.println("Panjang kalimat : " + kalimat.length());
        System.out.println("Huruf besar : " + kalimat.toUpperCase());
        System.out.println("Huruf kecil : " + kalimat.toLowerCase());
        System.out.println("Trim (hapus spasi) : " + kalimat.trim());
        System.out.println("Substring (0–3) : " + kalimat.substring(0, 3));
        System.out.println("Ganti 'a' jadi 'u' : " + kalimat.replace("a", "u"));

        
        System.out.println("apakah di dalam kalimat ada kata 'Java'? : " + kalimat.contains("Java"));
    }
  
}

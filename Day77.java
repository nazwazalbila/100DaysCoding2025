package Day77;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Masukkan kalimat :");
        String kalimat = in.nextLine();
        
        System.out.println("Substring (0-4): " + kalimat.substring(0, 4));
        System.out.println("Ganti 'a' jadi 'e': " + kalimat.replace("a", "e"));
        System.out.println("Hapus spasi: '" + kalimat.trim() + "'");
    }
  
}

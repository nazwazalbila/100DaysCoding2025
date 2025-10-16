package Day39;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=====MENU JUS=====");
        System.out.println("1. Jus Apel");
        System.out.println("2. Jus Melon");
        System.out.println("3. Jus Alpukat");
        System.out.println("==================");
        System.out.print("Pilih menu (1-3): ");
        int pilihan = input.nextInt();
        
        if (pilihan ==1){
            System.out.println("Anda memilih jus apel . Harga Rp.15.000");
        }else if (pilihan ==2){
            System.out.println("Anda memilih jus Melon. Harga Rp.12.000");
        }else if (pilihan ==3){
            System.out.println("Anda memilih jus Alpukat. Harga Rp.13.000");
        }else{
            System.out.println("Maaf Pilihan tidak tersedia");
        }
        
    
    }
   
}

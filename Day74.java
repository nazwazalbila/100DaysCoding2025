package Day74;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int pilihan ;
        
         do {
            System.out.println("\n======= MENU MAKANAN =======");
            System.out.println("1. Nasi Goreng");
            System.out.println("2. Mie Ayam");
            System.out.println("3. Bakso");
            System.out.println("4. Seblak");
            System.out.println("5. Selesai");
            System.out.print("Masukkan pilihan: ");
            pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Kamu memilih Nasi Goreng");
                    break;
                case 2:
                    System.out.println("Kamu memilih Mie Ayam ");
                    break;
                case 3:
                    System.out.println("Kamu memilih Bakso ");
                    break;
                case 4:
                    System.out.println("Kamu memilih Seblak ");
                    break;
                case 5:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
            }

        } while (pilihan != 5);
    }
  
}

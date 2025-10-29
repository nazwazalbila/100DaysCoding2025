package Day52;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama :");
        String nama =input.nextLine();
        
        System.out.print("Mau dicetak sampai berapa kali? :");
        int jumlah = input.nextInt();
        
        int i = 1;
        
        while(i <=jumlah){
            System.out.println(nama);
            i++;
        }
        System.out.println("Nama anda telah selesai dicetak");
    }
}

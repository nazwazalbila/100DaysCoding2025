package Day56;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String prodi;
        int jumlah;
        int i = 1;
        
        System.out.print("Masukkan prodi  : ");
         prodi = input.nextLine();
        System.out.print("Mau dicetak berapa kali ? : ");
        jumlah = input.nextInt();
        
        do {
            System.out.println(prodi);
            i++;
            
        }while (i<= jumlah);
    }
   
}

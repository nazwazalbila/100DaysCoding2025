package Day46;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("=====MENU MAKANAN CAFE DELIGHT=====");
        System.out.println("1.Dessert ");
        System.out.println("2.Tiramisu ");
        System.out.println("3.Kentang goreng ");
        System.out.println("4.Nasi goreng varian rasa ");
        System.out.println("5.Roti bakar ");
        System.out.println("===================================");
        System.out.print("Masukkan pilihan (1-5) : ");
        
        int pilihan = input.nextInt();
        
        switch(pilihan){
            case 1:
                System.out.println("Kamu memilih Dessert harga Rp.18.000");
                break;
            case 2:
                System.out.println("Kamu memilih Tiramisu harga Rp.20.000");
                break;
            case 3:
                System.out.println("Kamu memilih Kentang goreng harga Rp.12.000");
                break;
            case 4:
                System.out.println("Kamu memilih Nasi goreng varian rasa harga Rp.15.000");
                break;
            case 5:
                System.out.println("Kamu memilih Roti bakar harga Rp.17.0000");
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                
        }
    }
 
}

package Day44;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai : ");
        int nilai = input.nextInt();
        
        if(nilai >=90 && nilai <=100){
            System.out.println("Predikat A");
        }else if (nilai >=80 && nilai <90){
            System.out.println("Predikat B");
        }else if (nilai >=70 && nilai <80){
            System.out.println("Predikat C");
        }else if (nilai >=60 && nilai < 70){
            System.out.println("Predikat D");
        }else {
            System.out.println("Predikat E");
        }
    }
 
}

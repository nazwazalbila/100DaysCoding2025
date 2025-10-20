package Day43;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah angka : ");
        int angka=sc.nextInt();
        
        if(angka %3==0){
            System.out.println(+angka+ " = Kelipatan 3");
        }else if (angka %5==0){
            System.out.println(+angka+ " = Kelipatan 5");
        }else if (angka %3==0 && angka %5==0){
            System.out.println(+angka+ " = Kelipatan 3 dan 5 ");
        }else{
            System.out.println("Bukan kelipatan 3 maupun 5");
        }
    }
    
}

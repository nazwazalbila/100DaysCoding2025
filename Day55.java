package Day55;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Angka : ");
        int angka= input.nextInt();
        
        if (angka %2==0){
            System.out.println("iyaji");
        }else{
            System.out.println("Tidakji");
        }
    }
}

package Day54;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan batas angka : ");
        int batas = input.nextInt();
        
        for (int i = 1; i <= batas; i ++){
            if (i == 5){
                continue;
            }
            System.out.println(i);
        }
        
    }
    
}

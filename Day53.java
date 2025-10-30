package Day53;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan batas angka :");
        int batas = input.nextInt();
        
        for (int i=1; i<=batas; i++){
            if (i == batas){
                break;
            }
            System.out.println(i);
        }
    }
}

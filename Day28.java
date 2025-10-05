import java.util.Scanner;

public class Day28javaa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama :");
        int angkapertama = input.nextInt();
        
        System.out.print("Masukkan angka kedua : ");
        int angkakedua = input.nextInt();
        
        if (angkapertama == angkakedua){
            System.out.println("Kedua angka sama");
        }else if (angkapertama != angkakedua){
            System.out.println("kedua angka tidak sama");
        }
    }
    
}
    

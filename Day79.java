import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
         System.out.print("Silahkan Buat username: ");
        String username = in.nextLine();
        System.out.print("Buatlah password yang kuat : ");
        String password = in.nextLine();

        System.out.println("\n=== Login ke Akun ===");

        String userInput = "";
        String passInput = "";
        
                while (true) {
            System.out.print("Masukkan username: ");
            userInput = in.nextLine();

            System.out.print("Masukkan password: ");
            passInput = in.nextLine();

           
            if (userInput.equals(username) && passInput.equals(password)) {
                break; 
            }
            System.out.println("Username atau password salah, coba lagi!\n");
        }
        System.out.println("\nLogin berhasil! Selamat datang, " + username + "!");
    }
}

package day11.java;
import java.util.Scanner;
public class Day11Java {
   public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
       String nama;
       System.out.print("masukkan nama : ");
       nama = input.nextLine ();
       
       int umur;
       System.out.print("umur saya sekarang : ");
       umur = input.nextInt();
       
       char angka;
       System.out.print("angka favorit saya : ");
       angka = input.next().charAt(0);
       
       System.out.println("Nama saya " + nama+ "\numur saya sekarang " +umur+ "\nangka favoritku " +angka);
            }
    
}

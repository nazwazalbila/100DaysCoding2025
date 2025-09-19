package day12.javaaa;
import java.util.Scanner;
public class DAy12Javaaa {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String nama;
        System.out.print("Masukkan nama :");
        nama = input.nextLine();
        
        String agama;
        System.out.print("Masukkan agama :");
        agama = input.next();
        
        String alamat;
        System.out.print("Masukkan alamat :");
        alamat = input.next();
        
        int umur;
        System.out.print("Masukkan umur :");
        umur = input.nextInt();
        
        double bb;
        System.out.print("Masukkan bb :");
        bb = input.nextDouble();
        
        double tb;
        System.out.print("Masukkan tb :");
        tb =  input.nextDouble();
        
        char golongandarah;
        System.out.print("Masukkan golongan darah :");
        golongandarah = input.next().charAt(0);
        
        System.out.println("Nama saya : " +nama);
        System.out.println("Agama saya : " +agama);
        System.out.println("Alamat saya : " +alamat);
        System.out.println("Umur saya : " +umur);
        System.out.println("Bb saya : " +bb);
        System.out.println("Tb saya : " +tb);
        System.out.println("Golongan darah saya : " +golongandarah);
    }
    
}

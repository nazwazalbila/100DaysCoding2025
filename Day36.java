package day36.java;

import java.util.Scanner;

public class Day36Java {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.print("Masukkan nilai kamu :");
        int nilai = input.nextInt();
        
        if(nilai >=85){
         if (nilai >=95){
             System.out.println("Predikat A");
         }else{
             System.out.println("Predikat B");
         }
        }else if (nilai >=75){
            System.out.println("Predikat C");
        }else{
            System.out.println("Predikat D");
        }
        }
    
}

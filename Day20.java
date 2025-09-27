package day20.java;
public class Day20Java {
    
    public static void main(String[] args) {
        
        // menggunakan string.valueOf
        int jumlah = 120;
        String angkajumlah = String.valueOf(jumlah);
        System.out.println("Nilai jumlah dalam bentuk string : " +angkajumlah);
        
        //menggunakan +"" (contact string)
        int harga = 50;
        String hargabarang= harga + "";
        System.out.println("Nilai harga dalam bentuk string : " +hargabarang);
        
        // menggunakan Integer.toString() (atau Double.toString(), dll)
        double berat = 35;
        String beratbenda = Double.toString(berat);
        System.out.println("Nilai berat dalam bentuk string : " +beratbenda);
            }
    
}

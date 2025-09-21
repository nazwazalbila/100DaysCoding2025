package Day14;
public class java {
public static void main(String[] args) {
  
    /*mengubah tipe data string menjadi primitif dengan fungsi bawaan java misalnya
    parseint, parsedouble, parseboolean. asalkan isi String sesuai tipe datanya, jika tidak sesuai
    dengan tipe datanya maka akan error*/
    
    String umur = "18";
    String populasi = "765746467000";
    String jumlahbarang = "215";
    String hargabarang = "600";
    String berat = "54.5";
    String tinggi = "165.55";
    String angkafavorit = "5";
    String fakta = "true";
    
    byte umursaya = Byte.parseByte(umur);
    long populasipenduduk = Long.parseLong(populasi);
    short jumlahbarangsaya = Short.parseShort(jumlahbarang);
    int hargabarangygdibeli = Integer.parseInt(hargabarang);
    float beratbadan = Float.parseFloat(berat);
    double tinggibadan = Double.parseDouble(tinggi);
    char angkafavoritku = angkafavorit.charAt(0);
    boolean faktanya = Boolean.parseBoolean(fakta);
    
    System.out.println("Umur saya : " + umursaya);
    System.out.println("Populasi Penduduk : " + populasipenduduk);
    System.out.println("Jumlah barang saya : " + jumlahbarangsaya);
    System.out.println("Harga barang yg dibeli : " + hargabarangygdibeli);
    System.out.println("Berat badan : " + beratbadan);
    System.out.println("Tinggi badan : " + tinggibadan);
    System.out.println("Angka favoritku : " + angkafavoritku);
    System.out.println("saya suka menulis cerita : " + faktanya);
    
    
    
    
    
    }
    
}

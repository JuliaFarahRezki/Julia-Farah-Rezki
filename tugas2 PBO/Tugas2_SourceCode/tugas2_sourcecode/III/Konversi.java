/** NIM         :13020200262
 *  Nama        :Julia Farah Rezki
 *  Hari,Tanggal:Sabtu, 19 03 2022
 *  Waktu       :21.14
 */
import java.util.Scanner;
public class Konversi {
    public static void main(String[] args){
        Scanner masukan = new Scanner(System.in);
        
        int jam, menit, detik, konversi;
        
        System.out.print("Masukkan detik yang ingin dikonversi : ");
        konversi = masukan.nextInt();
        
        jam = konversi/3600;
        menit = (konversi%3600)/60;
        detik = (konversi%3600)%60;
        
        System.out.println("konversi dari : "+ konversi + "detik, adalah :");
        System.out.println(jam+" jam : "+menit+"menit : "+detik+"detik");
    }
}

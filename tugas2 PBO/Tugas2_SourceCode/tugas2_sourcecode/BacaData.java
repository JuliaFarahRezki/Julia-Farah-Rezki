/** NIM         :13020200262
 *  Nama        :Julia Farah Rezki
 *  Hari,Tanggal:Senin, 14 03 2022
 *  Waktu       :16:04
 */
import java.util.Scanner;

public class BacaData {
    public static void main(String[] args) {
    // TODO Auto-generated method stub
    /* Kamus */
        int a;
        Scanner masukan;
        /* Program */
        System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
        masukan = new Scanner(System.in);
        a = masukan.nextInt(); /* coba ketik : masukan.nextInt(); ;
        Apa akibatnya ?*/
        System.out.print ("Nilai yang dibaca : "+ a);
        }
}

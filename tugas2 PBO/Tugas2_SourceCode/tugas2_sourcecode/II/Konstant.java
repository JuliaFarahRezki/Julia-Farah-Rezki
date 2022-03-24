/** NIM         :13020200262
 *  Nama        :Julia Farah Rezki
 *  Hari,Tanggal:Rabu, 16 03 2022
 *  Waktu       :21.40
 */
import java.util.Scanner;

public class Konstant {
    public static void main(String[] args) {
    // TODO Auto-generated method stub
    /* Kamus */
    final float PHI = 3.1415f;
    float r;
    Scanner masukan=new Scanner(System.in);
    /* program */ /* baca data */
    System.out.print ("Jari-jari lingkaran =");
    r = masukan.nextFloat();
    /* Hitung dan tulis hasil */
    System.out.print ("Luas lingkaran = "+ (PHI * r * r)+"\n");
    System.out.print ("Akhir program \n");
    }

}

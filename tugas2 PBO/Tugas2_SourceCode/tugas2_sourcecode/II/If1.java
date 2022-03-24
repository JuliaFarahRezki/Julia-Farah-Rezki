/** NIM         :13020200262
 *  Nama        :Julia Farah Rezki
 *  Hari,Tanggal:Rabu, 16 03 2022
 *  Waktu       :21.14
 */
import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
    // TODO Auto-generated method stub
    /* Kamus */
    Scanner masukan=new Scanner(System.in);
    int a;
    /* Program */
    System.out.print ("Contoh IF satu kasus \n");
    System.out.print ("Ketikkan suatu nilai integer : ");
    a = masukan.nextInt();
    if (a >= 0)
    System.out.print ("\nNilai a positif "+ a);
    }
}

/** NIM         :13020200262
 *  Nama        :Julia Farah Rezki
 *  Hari,Tanggal:Rabu, 16 03 2022
 *  Waktu       :22.22
 */
import java.util.Scanner;
public class PrintWhile {
    public static void main(String[] args) {
    // TODO Auto-generated method stub
    /* Kamus : */
    int N;
    int i;
    Scanner masukan=new Scanner(System.in);
    /* Program */
    System.out.print ("Nilai N >0 = "); /* Inisialisasi */
    N = masukan.nextInt();
    i = 1; /* First Elmt */
    System.out.print ("Print i dengan WHILE: \n");
    while (i <= N) /* Kondisi pengulangan */
    { System.out.println (i); /* Proses */
    i++; /* Next Elmt */
    }; /* (i > N) */
    }
}

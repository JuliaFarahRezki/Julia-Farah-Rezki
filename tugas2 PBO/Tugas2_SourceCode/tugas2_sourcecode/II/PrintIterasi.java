/** NIM         :13020200262
 *  Nama        :Julia Farah Rezki
 *  Hari,Tanggal:Rabu, 16 03 2022
 *  Waktu       :22.05
 */
import java.util.Scanner;
public class PrintIterasi {
    public static void main(String[] args) {
    // TODO Auto-generated method stub
    /* Kamus : */
    int N;
    int i;
    Scanner masukan=new Scanner(System.in);
    /* Program */
    System.out.print ("Nilai N >0 = "); /* Inisialisasi*/
    N = masukan.nextInt();
    i = 1; /* First Elmt */
    System.out.print ("Print i dengan ITERATE : \n");
    for (;;){
    System.out.println(i); /* Proses */
    if (i == N)
    /* Kondisi Berhenti */ break;
    else {
    i++; /* Next Elmt */
    }
    } /* (i == N) */
}
}

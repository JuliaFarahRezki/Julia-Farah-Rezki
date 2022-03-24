/** NIM         :13020200262
 *  Nama        :Julia Farah Rezki
 *  Hari,Tanggal:Rabu, 16 03 2022
 *  Waktu       :22.42
 */
import java.util.Scanner;
public class PrintXiterasi {
    public static void main(String[] args) {
    int Sum=0;
    int x;
    Scanner masukan=new Scanner(System.in);
    /* Program */
    System.out.print ("Masukkan nilai x (int), akhiri dg 999: ");
    x = masukan.nextInt(); /* First Elmt */
    if (x == 999){
    System.out.print ("Kasus kosong \n");
    }else{ /* MInimal ada satu data yang dijumlahkan*/
    Sum = x; /* Inisialisasi; invariant !! */
    for (;;){
    System.out.print ("Masukkan nilai x (int),akhiri dg 999 : ");
    x = masukan.nextInt(); /* Next Elmt */
    if(x==999)
    break;
    else{
    Sum = Sum + x; /* Proses */
    }
    }
    }
    System.out.println("Hasil penjumlahan = "+ Sum);
    /* Terminasi */
    }

}

/** NIM         :13020200262
 *  Nama        :Julia Farah Rezki
 *  Hari,Tanggal:Senin, 14 03 2022
 *  Waktu       :17:20
 */
public class Oper2 {
public static void main(String[] args) {
    char i, j;
    /* ALGORITMA */
    i = 3; /* 00000011 dalam biner */
    j = 4; /* 00000100 dalam biner */

    System.out.println("i = "+ (int) i);
    System.out.println("j = "+ j);
    System.out.println("i & j = "+ (i & j)); /* 0: 00000000 dalam biner */
    System.out.println("i | j = "+ (i | j)); /* 7: 00000111 biner */
    System.out.println("i ^ j = "+ (i ^ j)); /* 7: 00000111 biner Ingat!!! operator "^" pada bahasa java bukan sebagai pangkat*/
    System.out.println(Math.pow(i, j)); /* Class Math memiliki method pow(a,b) untuk pemangkatan*/
    System.out.println(" ~i = "+ ~i); /* -4: 11111100 biner */
    }

}

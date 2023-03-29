/*Habiba Basri
* 13020210264
*/
package hitung0264;
import java.util.Scanner;
  
public class Hitung0264 {
	public static void main(String [] args){
		Scanner masukan = new Scanner(System.in);
		
		int jarak, konversi;

		System.out.print("Masukkan Jarak yang ingin Dikonversi : ");
		konversi = masukan.nextInt();

		jarak = konversi*1609;

		System.out.println("konversi dari : "+ konversi + "mil, adalah : ");
		System.out.println(jarak+" meter : ");	
	}
}
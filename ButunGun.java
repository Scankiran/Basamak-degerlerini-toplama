/**
 * @author Yusuf
 * @since 26.10.2019
 */

import java.util.Scanner;

public class ButunGun {

	public static void main(String[] args) {
  Scanner tara = new Scanner(System.in);
 System.out.println("Bir say� giriniz");
  int alinansayi = Math.abs(tara.nextInt());

  for(int i = 1,b,toplam = 0; i<alinansayi;i++) {
  b = i;
  while(b>=10) {
	  toplam = toplam + (b%10);
	  b = b/10;
  }
  toplam = toplam + b ;
  System.out.println("say�n�z  : " + i + " basamaklar� toplam� : " + toplam );
  toplam = 0;
  }

	
	
	
	}
}

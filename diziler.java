package onalt�03;

import java.util.Random;
import java.util.Scanner;

public class diziler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// kullan�c�n�n girdigi say� kadar random say� �retecek bunlar� diziye ata
		// yazd�r
		// en b�y�k say� ka�

		Scanner klavyedenAl = new Scanner(System.in);
		System.out.println("dizi ka� elemanl� olacak giriniz.");
		int randomSayisi = klavyedenAl.nextInt();
		int[] dizi = new int[randomSayisi];
		// random sayi �retip diziye tan�mlad�k
		for (int i = 0; i < randomSayisi; i++) {
			Random random = new Random();
			int sayi = random.nextInt(100);
			dizi[i] = sayi;

		}
//		diziyi bast�r
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}

	}
}

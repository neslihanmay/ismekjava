package DONGULER;

import java.util.Scanner;

public class örnek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		System.out.println("sayi gir");
		Scanner klavyedenAl = new Scanner(System.in);
		int bulunacakSayi = klavyedenAl.nextInt();
		for (i = 2; i <= bulunacakSayi; i++) {
			if (bulunacakSayi % i == 0) {
				bulunacakSayi = bulunacakSayi / i;
				System.out.println(i);
				i--;

			}
		}
	}
}

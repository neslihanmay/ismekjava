package DONGULER;

import java.util.Scanner;

public class örnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("sayi giriniz");
		Scanner klavyedenAl = new Scanner(System.in);
		int bulunacakSayi = klavyedenAl.nextInt();
		for (int i = 2; i <= bulunacakSayi; i++) {
			if (bulunacakSayi % i == 0) {
				System.out.println("sayi" + i + "bölünür");
			}
		}

	}

}

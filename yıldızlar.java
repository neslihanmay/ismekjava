package DONGULER;

import java.util.Scanner;

public class yýldýzlar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sayiAl = new Scanner(System.in);

		System.out.println("sayi gir");
		int kacaKadar = sayiAl.nextInt();

		for (int i = 1; i <= kacaKadar; i++) {
			for (int j = 1; j <= 10; j++) {
				int sonuc=i*j;
				System.out.println( i + "*" + j+ "=" + sonuc);

			}
			System.out.println("****************");
		}
	}
}

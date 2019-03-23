package org.ismek.sinif;

import java.util.Scanner;

public class method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// soru:kilo/boy*boy kütle

		Scanner scanner = new Scanner(System.in);
		System.out.println("kilo gir");
		float kilo = scanner.nextFloat();
		System.out.println("boy giriniz m cinsinden");
		float boy = scanner.nextFloat();
		float sonuc = hesapla(kilo, boy);
		System.out.println("vucut kitle indeksiniz" + sonuc);

	}

	static float hesapla(float s1, float s2) {
		float hesaplananDeger = s1 / (s2 * s2);
		return hesaplananDeger;
	}
}

package ödevzor;

import java.util.Random;
import java.util.Scanner;

public class harf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner klavyedenAl = new Scanner(System.in);

		System.out.println("kaç harfli olacak");
		int harfSayisi = klavyedenAl.nextInt();
		System.out.println("kaç kelime türetilsin");
		int kelimeSayisi = klavyedenAl.nextInt();
		char[] dizi = new char[26];
		int i = 0;
		for (char j = 65; j <= 90; j++) {
			dizi[i] = j;
			i++;
		}
		for (int m = 0; m < kelimeSayisi; m++) {
			for (int k = 0; k < harfSayisi; k++) {
				Random random = new Random();
				int randomdanCikanSayi = random.nextInt(26);
				char harfler = dizi[randomdanCikanSayi];
				System.out.print(harfler);
			}
			System.out.println();
		}
	}
}
package onalt�03;

import java.util.Scanner;

public class �dev222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sayiAl = new Scanner(System.in);
		System.out.println("hangi ��renciyi istiyosunuz");
	
		int istenen = sayiAl.nextInt();

		int i;
		String list[] = new String[4];
		String adlar[] = { "nesli  ", "furkan  ", "�afak  ", "cansu  " };
		String soyadlar[] = { "may  ", "ko�  ", "ta�k�n  ", "kahveci  " };
		String kilolar[] = { "55  ", "70  ", "53  ", "50  " };
		String ogrenciMi[] = { "evet  ", "evet  ", "hay�r  ", "evet  " };
		for (i = 0; i <= 3; i++) {

			list[i] = adlar[i] + soyadlar[i] + kilolar[i] + ogrenciMi[i];
		}

		if (istenen == 1)
			System.out.println(list[0]);
		else if (istenen == 2)
			System.out.println(list[1]);
		else if (istenen == 3)
			System.out.println(list[2]);
		else
			System.out.println(list[3]);
	}

}

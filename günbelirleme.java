package g�n;

import java.util.Scanner;

public class g�nbelirleme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("G�n giriniz");
		Scanner scanner = new Scanner(System.in);
		
		String haftaninGunu = scanner.next();

		switch (haftaninGunu) {
		case "PTS":
		case "SL":
		case "CRS":
		case "PRS":
		case "CM":
			System.out.println("hafta icidir");
			break;
		case "CMT":
		case "PZ":
			System.out.println(" hafta sonudur");
			break;
		default:
			System.out.println("gun bulunamad�");
		}

	}
}

package oyun;

import java.util.Random;
import java.util.Scanner;

public class oyunn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi;
		Random rnd=new Random();
		int tutulanSayi =rnd.nextInt(10);
		System.out.println("sayiyi tahmin et");
		
		 do
		 {	Scanner scanner=new Scanner(System.in);
			 sayi =scanner.nextInt();
			if(sayi==tutulanSayi)
			{ System.out.println("dogru bildiniz");
			}
		 else
		 {
		  System.out.println("tekrar dene");
		 }
	}
		 while( sayi!= tutulanSayi);
	}}

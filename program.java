package org.ismek.sinif;


import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class program 

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("birinci sayiyi girin");
		int sayi1=scanner.nextInt();

		System.out.println("ikinci sayiyi girin");
		int sayi2=scanner.nextInt();
		
		Matematikislemleri islemler= new Matematikislemleri();
	int toplamSonuc=islemler.topla(sayi1, sayi2);
	int c�kartmaSonuc=islemler.c�karma(sayi1, sayi2);
	int carpmaSonuc=islemler.carpim(sayi1, sayi2);
	float bolmeSonuc=islemler.bolme(sayi1, sayi2);
	int sayacsonuc=islemler.sayac;
		System.out.println("�arpma sonucu" +carpmaSonuc);
		System.out.println("b�lme sonucu" +bolmeSonuc);
		System.out.println("toplam sonucu" +toplamSonuc);
		System.out.println("��kartma sonucu" +c�kartmaSonuc);
		
		System.out.println(sayacsonuc+ "kere i�lem yap�ld�");
	}

}

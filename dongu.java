package DONGULER;

import java.util.Scanner;

public class dongu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner klavyedenOku=new Scanner(System.in);
		System.out.println("faktoriyel al�nacak say� nedir");
		int faktoriyelAlinacakSayi=klavyedenOku.nextInt();
		int sonuc=1;
		for(int i=1; i<=faktoriyelAlinacakSayi;i++) {
			System.out.println(sonuc + "*" + i  + "=" + sonuc * i );
			sonuc=sonuc*i;
			
		}
		System.out.println("cevap="+sonuc );
		
		
		
		
		
		
		
		
	}

}
 
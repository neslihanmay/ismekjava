package org.ismek.sinif;

import java.util.Scanner;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dogum y�l�� gir ya� ver
		

	Scanner scanner =new Scanner(System.in);
	System.out.println("y�l girin");
	int dogumYili= scanner.nextInt();
	int yas= yasHesapla(dogumYili);
	System.out.println(yas);
	}
			
			static int yasHesapla (int x )
			{
				return 2019- x;
				
				
			}
		
		
	}


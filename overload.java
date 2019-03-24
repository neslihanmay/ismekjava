package yirmidort;

public class overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sayi1 = 3;
		int sayi2 = 5;
		int sayi3 = 9;
		String sayi4 = "4";
		String sayi5 = "6";

		int sonuc1 = topla(sayi1, sayi2);
		System.out.println(sonuc1);
		int sonuc2 = topla(sayi1, sayi2, sayi3);
		System.out.println(sonuc2);

		int sonuc3 = topla(sayi4, sayi5);
		System.out.println(sonuc3);

	}

	static int topla(int s1, int s2) {
		int sonuc = s1 + s2;
		return sonuc;
	}

	static int topla(int s1, int s2, int s3) {

		int sonuc = s1 + s2 + s3;
		return sonuc;

	}

	static int topla(String s1, String s2)

	{
		int sayi1 = Integer.valueOf(s1);
		int sayi2 = Integer.valueOf(s2);
		int sonuc = sayi1 + sayi2;
		return sonuc;

	}
}

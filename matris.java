package onaltý03;

public class matris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] satir = { "1", "2", "3" };
		String[] sutun = { "A", "B", "C", "D" };
		String[][] matris = new String[3][4];
		for (int i = 0; i < satir.length; i++) {
			for (int j = 0; j < sutun.length; j++) {
				matris[i][j] = satir[i] + sutun[j];

				System.out.print(matris[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
  
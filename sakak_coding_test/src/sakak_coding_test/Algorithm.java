package sakak_coding_test;

import java.util.Scanner;

public class Algorithm {

	public static Scanner scan = new Scanner(System.in);

	private static int n;
	// 시작 Ln
	private static String Ln = "";
	// 최종 Ln
	private static String result = "1";
	// 가운데 두자리 수
	private static String m = "";

	public static void checkResultAndM() {
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			Ln = result;
			result = "";

			for (int j = 0; j < Ln.length(); j++) {
				String pick = Character.toString(Ln.charAt(j));
				count++;
				if ((j == Ln.length() - 1) || Ln.charAt(j) != Ln.charAt(j + 1)) {
					result += count + pick;
					count = 0;
				}
			}
		}

		// 가운데 두 자리 수
		int resultLength = (result.length() / 2) - 1;
		m = result.substring(resultLength, resultLength + 2);
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public String getResult() {
		return result;
	}

	public String getM() {
		return m;
	}

	// Main
	public static void main(String[] args) {

		System.out.print("n :  ");
		n = scan.nextInt();
		checkResultAndM();

		System.out.println("m : " + m);
	}
}

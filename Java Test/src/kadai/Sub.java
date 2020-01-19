package kadai;

import java.util.Scanner;

public class Sub {

	private  int nenrei;
	private  int year;
	private  int umare;
	Scanner str = new Scanner(System.in);

	public void calcage() {

	System.out.println("調べたい年を西暦で入力してください。");

	year = str.nextInt();

	nenrei = year - getUmare();

	System.out.println("西暦" + year + "年のとき、あなたは" + nenrei + "歳です。");

	str.close();

}

	public void calcyear() {

		System.out.println("調べたい年齢を入力してください。");

		nenrei = str.nextInt();

		year = nenrei + getUmare();

		System.out.println("あなたが" + nenrei + "歳のとき、西暦" + year + "年です。");

		str.close();

	}

	/**
	 * @return umare
	 */
	public int getUmare() {
		return umare;
	}

	/**
	 * @param umare セットする umare
	 */
	public void setUmare(int umare) {
		this.umare = umare;
	}


}

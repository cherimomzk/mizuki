package kadai;

import java.util.Scanner;

public class Sub {

	private  int nenrei;
	private  int year;
	private  int umare;
	Scanner str = new Scanner(System.in);

	public void calcage() {

	System.out.println("���ׂ����N�𐼗�œ��͂��Ă��������B");

	year = str.nextInt();

	nenrei = year - getUmare();

	System.out.println("����" + year + "�N�̂Ƃ��A���Ȃ���" + nenrei + "�΂ł��B");

	str.close();

}

	public void calcyear() {

		System.out.println("���ׂ����N�����͂��Ă��������B");

		nenrei = str.nextInt();

		year = nenrei + getUmare();

		System.out.println("���Ȃ���" + nenrei + "�΂̂Ƃ��A����" + year + "�N�ł��B");

		str.close();

	}

	/**
	 * @return umare
	 */
	public int getUmare() {
		return umare;
	}

	/**
	 * @param umare �Z�b�g���� umare
	 */
	public void setUmare(int umare) {
		this.umare = umare;
	}


}

package jp.co.aforce;

public class PracticeTest6 {
	public static void main(String[]args) {
		//問1
		int fortune = new java.util.Random().nextInt(4);
		System.out.println(fortune);

		switch (fortune) {
		case 1:
			System.out.println("吉です");
			break;
		case 2:
			System.out.println("中吉です");
			break;
		case 3:
			System.out.println("大吉です");
			break;
		default :
			System.out.println("凶です");
		}
		//問2
		System.out.println("================");

		int total = 0;
		for (int i = 1; i <=100; i++) {
			if (i % 7 == 0) {
				System.out.println(i + " ");
				total = total + i;
			}
			System.out.println();
			System.out.println("7の倍数の総合計は" + total);

			System.out.println("================");

			//問3
			for (int y = 1; y < 10; y++) {
				for(int x = 1; x < 10; x++) {
					System.out.printf("%2d", x * y);
				}
				System.out.println();
			}
		}
	}

}

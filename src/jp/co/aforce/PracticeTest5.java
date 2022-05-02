package jp.co.aforce;

import java.util.ArrayList;

public class PracticeTest5 {
	public static void main(String[]args) {

		ArrayList<String> lists = new ArrayList<>();
		//リストを追加
		lists.add("犬");
		lists.add("猫");
		lists.add("うさぎ");
		lists.add("へび");
		System.out.println(lists.get(0));

		String animal = "犬";

//		int i = 0;
//
//		if(animal == lists.get(i)){
//			System.out.println("「{ " + animal + "はリストに含まれています」");
//		}else if (i < 3){
//			i++;
//		}else {
//
//		System.out.println("「{ " + animal + "はリストに含まれていません」");
//		}

		for (int i = 0; i <= 3; i++) {
			if(animal == lists.get(i)) {
				System.out.println("「{ " + animal + "はリストに含まれています」");
				break;
			}
			System.out.println("「{ " + animal + "はリストに含まれていません」");
		}

		int myBirthMonth = 5;

		switch(myBirthMonth) {
		case 1:
			System.out.println("元日、成人の日");
			break;

		case 2:
				System.out.println("建国記念日の日、天皇誕生日");
				break;

		case 3:
			System.out.println("春分の日");
			break;

		case 4:
			System.out.println("昭和の日");
			break;

		case 5:
			System.out.println("憲法記念日、みどりの日、こどもの日");
			break;

		case 6:
			System.out.println("なし");
			break;

		case 7:
			System.out.println("海の日、スポーツの日");
			break;

		case 8:
			System.out.println("山の日");
			break;

		case 9:
			System.out.println("敬老の日、秋分の日");
			break;

		case 10:
			System.out.println("なし");
			break;

		case 11:
			System.out.println("文化の日、勤労感謝の日");
			break;

		case 12:
			System.out.println("なし");
			break;

			default:
				System.out.println("月が正しくありません");
				break;

		}
	}
}

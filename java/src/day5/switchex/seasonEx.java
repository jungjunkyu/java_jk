package day5.switchex;

import java.util.Scanner;

public class seasonEx {

	public static void main(String[] args) {
		/*345 봄
		 *678여름
		 *9 10 11 가을
		 *12 1 2  겨울
		 *그 외 잘못된 월
		*/

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("input number : ");
		num = sc.nextInt();
		switch(num) {
		//1의 실행문이 업고, break문도 없음
		//2의 실행문이 없고, break문도 없음
		case 1: case 2: case 12://case 1, 2, 12: -- JDK 7 버전 이후로 가능
			System.out.println("winter!");
			break;
		case 3: case 4: case 5:
			System.out.println("spring!");
			break;
		case 6: case 7: case 8:
			System.out.println("summer!");
			break;
		case 9 : case 10: case 11:
			System.out.println("fall!");
			break;
		
			}
		
		
		
		
		sc.close();
	}

}

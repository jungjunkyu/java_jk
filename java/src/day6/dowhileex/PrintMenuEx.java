package day6.dowhileex;

import java.util.Scanner;

public class PrintMenuEx {

	public static void main(String[] args) {
		//다음과 같은 메뉴를 출력하고 프로그램 종료를 선택하기 전까지 반복적으로 실행되는 코드를 작성
		
		int menu;
		Scanner sc = new Scanner(System.in);
		//입력받은 menu가 3이 아니면 반복
		do {
			//메뉴 출력 및 메뉴 입력
			System.out.println("menu");
			System.out.println("start");
			System.out.println("save");
			System.out.println("exit");
			System.out.println("select menu : ");
			menu = sc.nextInt();
			//선택한 메뉴에 따른 출력문 실행
			switch(menu) {
			case 1:
				System.out.println("Start");
				break;
			case 2:
				System.out.println("save");
				break;
			case 3:
				System.out.println("exit");
				break;
				
			}
		}while(menu !=3);

	}

}

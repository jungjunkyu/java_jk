package day6.practice;

import java.util.Scanner;

public class UpDownEx {

	public static void main(String[] args) {
		//updown게임을 하는 코드를 작성
		//한판이 끝나면 더 할것인지 물어서 n을 입력하면 종료, y를 입력하면 이어서 게임진행
		
		
			
		int min = 1, max = 100;
		char menu=0;
		int num;//1~100이 아닌 정수로 초기화 하면 됨. 최소값 -1을 해서 랜덤으로 나올 수 없는 수
		int random;
		Scanner sc = new Scanner(System.in);
		//외부 반복문 : 게임을 더 진행할건지 결정하는 반복문
		//반복횟수 : 입력받은 문자가 n이 아니면 반복
		//규칙성 : 업다운 게임 한판 진행
		do {
			random = (int)(Math.random()*(max - min + 1) + min);
		//내부 반복문 : 업다운 게임 진행하는 반복문
		//반복횟수 : 입력받은 숫자가 랜덤한 숫자와 일치하지 않으면 반복
		//규칙성 : 입력받은 숫자가 정답보다 크면 다운, 작으면 업, 맞으면 굳 출력
			System.out.println("continue?(y/n) : ");
			menu = sc.next().charAt(0);
			do {
				System.out.println("input : ");
				num = sc.nextInt();
				
			
				while(random != num);
		//메뉴를 선택(더 할건지 말건지)
		}while(menu != 'n');
		//랜덤한 수를 생성 (및 출력)
		System.out.println(random);

		//반복문 : 맞출때까지 => 입력한 정수가 정답이 아니면 반복
		while(random != num) {
			//정수를 입력
			System.out.println("input(1~100) : ");
			num = sc.nextInt();

			//정수와 정답을 비교하여 판별
			//num가 random보다 크면 Down!,아니고 num가 random보다 작으면 Up!, 아니면 Good!
			if(num > random) {
				System.out.println("Down!");
			}else if(num < random) {
				System.out.println("Up!");
			}else {
				System.out.println("Good!");
			}
			}
		
		sc.close();

		
	}
}

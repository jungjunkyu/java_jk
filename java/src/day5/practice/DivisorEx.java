package day5.practice;

import java.util.Scanner;

public class DivisorEx {

	public static void main(String[] args) {
		//정수 num를 입력 받아 num의약수를 출력하는 코드를 작성
		//약수 : A를 B로 나누었을 때 나머지가 0 이면 B는 A의 약수이다.
		//12의 약수 : 1, 2, 3, 4, 6, 12
		
		//반복횟수 : i는 1부터 num까지 1씩 증가
		//i가 num의 약수이면 i를 출력
		
		int num, i;
		Scanner sc = new Scanner(System.in);
			System.out.println("input pos number : ");
			num = sc.nextInt();
			
		i = 0;
		while(i<= num) {
			System.out.println(i);
			if(num % i == 0) {
				System.out.println(i);
			}
			++i;
			
		
		}
		
		
		
		
		sc.close();

	}

}

package day6.practice;

import java.util.Scanner;

public class AverageEx {

	public static void main(String[] args) {
		// 국어 영어 수학 성적을 입력받아 평균을 구하는 코드를 작성하시오.
		/* 반복문 : menu가 n이 아니면 반복(y,n이 아닌 다른 문자를 입력하면 반복)
		 * menu가 y이면 반복(y,n이 아닌 다른문자를 입력하면 반복)
		 * 
		 * 국어 영어 수학 점수를 입력
		 * 평균을 계산
		 * 평균을 출력
		 * 더 할건지 물어본 후, 입력 
		 *
		 *EXIT!를 출력
		 */
		
		int kor, eng, math;
		char menu = 'y';
		double avg;
		Scanner sc = new Scanner(System.in);
		
		while(menu !='n') {
			System.out.println("input score (kor, eng, math, ex : 100 90 80) : ");
			kor = sc.nextInt();
			eng = sc.nextInt();
			math = sc.nextInt();
			
			avg = (kor + eng + math) / 3.0;//(double)3; 도 가능
			System.out.println("avg : " + avg);
			
			System.out.println("continue?(y/n) : ");
			menu = sc.next().charAt(0);
			
		}
		
		System.out.println("EXIT!");
		sc.close();
						
		
	}
}

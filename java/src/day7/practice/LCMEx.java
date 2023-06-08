package day7.practice;

import java.util.Scanner;

public class LCMEx {

	public static void main(String[] args) {
		// 두 정수를 입력받아 두 정수의 최소공배수를 구하는 코드를 작성하세요.
		
		//두 정수를 입력
		/*
		 * <방법 1>
		 * 반복횟수 : i는 1부터 (num1*num2까지) 1씩 증가
		 * 규칙성 : i가 num1의 배수이고 i가 num2의 배수이면 i를 출력 후 반복문 종료
		 * 			=> i를 num1로 나누었을 때 나머지가 0과 같고
		 * 				i를 num2로 나누었을 때 나머지가 0과 같다면
		 * 				i를 출려 후 반복문 종료
		 * 
		 * 반복문 종료 후 : 없음
		 * 
		 *
		 * <방법 2>
		 * 반복횟수 : i는 1부터 (num1*num2까지) num1씩 증가
		 * 규칙성 : i가 num2의 배수이면 i를 출력 후 반복문 종료
		 * 			=> 	i를 num2로 나누었을 때 나머지가 0과 같다면
		 * 				i를 출력 후 반복문 종료
		 * 
		 * 반복문 종료 후 : 없음
		 */
		
		int num1, num2, i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" input 2 number : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		for(i=1;;++i) {
			if(i%num1==0 && i%num2==0) {
				System.out.println(i);
				break;
			}
		}
		
		
		for(i=num1;;i+=num1) {
			if(i%num2==0);
			System.out.println(i);
			break;
		}
		
		
		
		sc.close();

	}

}

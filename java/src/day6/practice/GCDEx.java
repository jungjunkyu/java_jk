package day6.practice;

import java.util.Scanner;

public class GCDEx {

	public static void main(String[] args) {
		//두 정수 num1과 num2를 입력받아 두 정수의 최대 공약수를 구하는 코드를 작성하시오.
		/* 약수 : 나누어 떨어지는 수
		 * 공약수 : 공통으로 있는 약수
		 * 최대 공약수 : 공약수 중 가장 큰 수
		 * 
		 * 
		 * 반복회수 : i는 1부터 num1까지 1씩 증가
		 * 규칙성 : i가 num1의 약수이고 i가 num2의 약수이면 i를 gcd에 저장
		 * 			num1을 i로 나누었을 때 나머지가 0과 같고
		 * 			num2를 i로 나누었을 때 나머지가 0과 같아면
		 * 			i를 gcd에 저장
		 * 반복문 종료 후 : gcd를 출력
		 * 
		 */
		
		//두 정수를 입력
		//반복문(최대공약수를 구하기 위한 반복문) : i가 num1까지
		//num1을 i로 나누었을 때 나머지가 0과 같고 num2를 i로 나누었을 때 나머지가 0과 같다면 i를 gcd에 저장
		
		int num1, num2, i = 1, gcd = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" 두 정수를 입력하시오 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		while(i<=num1) {
			if(num1%i==0 && num2%i==0) {
				gcd = 1;
			}
			++i;
		}
			System.out.println(num1 + "and" + num2 + "gdc" + gcd);
		
		}
				
		

	}



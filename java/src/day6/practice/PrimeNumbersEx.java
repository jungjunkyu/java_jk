package day6.practice;

import java.util.Scanner;

public class PrimeNumbersEx {

	public static void main(String[] args) {
		//2와 100사이의 소수를 출력하는 코드를 작성하시오
		int i =2 , j, count = 0;
		/*
		 * 반복횟수 : i는 2부터 100까지 1씩 증가
		 * 규칙성 : i가 소수이면 i를 출력
		 */
		while(i<=100) {
			
		
		
		 /* 		내부 반복문
		 * 		반복횟수 : j는 1부터 i까지 1씩 증가
		 * 		반복문 종료 : 약수의 개수가 2개이면 i를 출력
		 * 
		 */
		
		
		//i가 소수이면 i를 출력하는 코드
			j =1;
			count=0;
			while(j<= i) {
				
				if(i % j ==0) {
					count++;
				}
				j++;
			}
			
			if(count ==2) {
				System.out.println(i);
			}	
			i++;
				
		}
	}

}

package day8.practice;

import java.util.Scanner;

public class MethodLCMEx {

	public static void main(String[] args) {
		//정수 num1과 num2를 입력받아 두 정수의 최소 공배수를 구하는 코드를 작성하시요.
		/*
		 * A : ga, B : gb
		 * g : 최대공약수
		 * ㅣ : A*B/g
		 * A*B/g == (ga*gb)/g ==gab
		 */

		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("input 2 number : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		
		
		sc.close();

	}
		public static int lcm1(int num1, int num2) {
			for(int i = num1;i<=num1*num2;i=+num1) {
				if(isMultiple(i,num2)) {
					return i;
				}
			}
			return num1*num2;
		}
		public static int lcm2(int num1, int num2) {
			return num1*num2
		}
	

	public static boolean isMultiple(int num1, int num2) {
		return num1%num2==0;
	}
}

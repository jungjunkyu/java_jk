package day3.practice;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
	
		//정수num을받아 0인지 음수인지 양수인지 판별하는 코드를 작성하시오
		
		Scanner sc = new Scanner(System.in);
		System.out.println("in put number : ");
		int num = sc.nextInt();
				if(num == 0) {
					System.out.println(0);
				}
				//음수 0보다 작다
				if(num <0) {
					System.out.println("negative number ");
				}
				//양수 0보다 크다
				if(num >0) {
					System.out.println("positive number ");
				}

					
	}
}


package day5.practice;

import java.util.Scanner;

public class primeNumberEx {

	public static void main(String[] args) {
		// 정수 num를 입력받아 num가 소수인지 아니지를 판별하는 코드를 작성
		/*소수 : 약수가 1과 자기 자신밖에 없는 수/ 약수의 개수가 2개
		 *소수 : 2,3,5,7,11,13 등..
		 *반복횟수 : i는 1부터 num까지 1씩 증가
		 *규칙성 : i가 num의 약수이면 약수의 개수 count를 1증가
		 *		=>num를 i로 나누었을 때 나머지가 0과 같다면 약수의 개수 count를 1증가
		 *반복문 종료 후 : count가 2이면 소수라고 출력, 아니면 소수가 아니라고 출력
		 */

		//정수 입력을 받다
		
		//반복문 i는 1부터 num까지 1씩 증가
			
			//i가 num의 약수이면 약수의 개수 count를 1 증가
		
		//count가 2이면 소수라고 출력, 아니면 소수가 아니라고 출력
		
		int num, i, count = 0;
		Scanner sc = new Scanner(System.in);
			System.out.println("input number : ");
		num = sc.nextInt();
		
		i =1;
		while(i<= num) {
			
			if(num % i ==0) {
				count++;
			}
			i++;
		}
		
		if(count ==2) {
			System.out.println(num + "is a prime number");
		}else {
			System.out.println(num + "is not a prime number");
		}
				
		sc.close();
	}

}

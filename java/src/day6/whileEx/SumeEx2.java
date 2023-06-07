package day6.whileEx;

import java.util.Scanner;

public class SumeEx2 {

	public static void main(String[] args) {
		// n을 입력받아 1부터 n까지 짝수의 합을 구하는 코드를 작성하시오.
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("input number : ");
		num = sc.nextInt();
		
		int n = num, sum = 0;
		int i = 1;
		while(i<=n) {
			if(1%2==0) {
			sum += i;
			}
			++i;
		}
			System.out.println("1 ~ " + num + " sum : " + sum);
		
		
			/*int n, i = 1, sum = 0;
			 * Scaaner sc = new Scanner(System.in);
			 * 
			 */
			
		
		
		
		sc.close();

	}

}

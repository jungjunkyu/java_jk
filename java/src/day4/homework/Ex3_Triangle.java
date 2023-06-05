package day4.homework;

import java.util.Scanner;

public class Ex3_Triangle {

	public static void main(String[] args) {
		//세변의 길이를 정수로 입력받아 세변으로 삼각형을 만들 수 있는지 확인하는 코드를 작성.
		//세변 중 작은 두 변이 길이의 합이 큰 변보다 커야 삼각형을 만들 수 있다.
		
		int a, b, c;
		int max;//세변 a b c 중 가장 큰 변의 길이
		Scanner sc = new Scanner(System.in);
		//세 변의길이를 입력
		System.out.println("input 3 integer number : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		//삼각형 가능 여부 확인 및 출력
		//세 변중 가장 큰 변의 길이를 계산
		
		//a가 b보다 크면
		if(a > b) {
			if(a > c) {
				max = a;
			}
			//a가 c보다 크면 a를 max저장 
			else {
				max = c;
			}
		}
			//아니면 c를 max에 저장
		
		//b가 c보다 크면 max에 b를 저장
		else if(b > c) {
			max = b;
		}
		//아니면 max에 c를 저장
		else {
			max = c;
		}
		System.out.println(max);
		
		//max = a > b ? (a > c ? a : c) : (b > c ? b : c)
		//작은 두변의 합 > max
		//세변의 합 - max == 작은 두변의 합
		//세변의 합에서 max를 뺀 값이 max보다 크면 삼각형이라고 출력
		if (a + b + c - max > max) {
			System.out.println("Able to creat triangle.");
		}
			else {
				System.out.println("Unable to creat tringle.");
			}
	sc.close();	
	}
		
}



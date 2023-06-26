package day19.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticEx {

	public static void main(String[] args) {
		//두 정수와 산술연산자를 입력했을 때 연산 결과를 출력하는 코드를 작성하세요. 예외처리 추가
		
		//두 정수와 산술연산자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("input(ex:1+2) : ");
		
		try {
		int num1 = sc.nextInt();
		char op = sc.next().charAt(0);
		int num2 = sc.nextInt();
				
		//연산자에 따를 결과를 출력
		switch(op) {
		case '+':
			System.out.println(""+ num1 + op + num2 + "=" + (num1+num2));
			break;
		case '-':
			System.out.println(""+ num1 + op + num2 + "=" + (num1-num2));
			break;
		case '*':
			System.out.println(""+ num1 + op + num2 + "=" + (num1*num2));
			break;
		case '/':
			System.out.println(""+ num1 + op + num2 + "=" + ((double)num1/num2));
			break;
		case '%':
			System.out.println(""+ num1 + op + num2 + "=" + (num1%num2));
			break;
		default:
			System.out.println("not operator!");
		}
		}catch(InputMismatchException e) {
			System.out.println("wrong input");
		}catch(ArithmeticException e) {
			System.out.println("not operation");
	}catch(Exception e) {
		System.out.println("Exception");	
		}
		System.out.println("Exit");
		test1();
		test2();
	sc.close();
	}
	public static void test1() {
		try {
			System.out.println(1/0);
		}catch(Exception e) {
			System.out.println("Exceptoin!!");
			return;
		}finally {
			System.out.println("Method Exit1@@");
		}
	}
	public static void test2() {
		try {
			System.out.println(1/0);
		}catch(Exception e) {
			System.out.println("Exceptoin!!");
			return;
		}
		System.out.println("Method Exit2!!");
	}
}

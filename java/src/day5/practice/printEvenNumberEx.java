package day5.practice;

public class printEvenNumberEx {

	public static void main(String[] args) {
		//10이하의 짝수를 출력하는 코드를 작성하시오
		
		/* 방법 1
		 * i는 1부터 5까지 1씩 증가
		 * 2*i를 출력
		 * 
		 * 방법 2
		 * i는 2부터 10까지 2씩 증가
		 * i를 출력
		 * 
		 * 방법 3
		 * i는 1부터 10까지 1씩 증가
		 * i가 짝수이면 i를 출력
		 */
		
		int i = 1;
		while(i <=5) {
			System.out.println(2*i);
			++i;
			}
		System.out.println("======================");
		
		i = 2;
		while(i<=10) {
			System.out.println(i);
			i=i+2;//i+=2;
		}
		System.out.println("=====================");
		
		i = 1;
		while(i<=10) {
			if(i%2==0) {
				System.out.println(i);
				}
			++i;
		}
	}

}

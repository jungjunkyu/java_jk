package day7.practice;

public class StarEx3 {

	public static void main(String[] args) {
		/*
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 */

		//공백을 출력
		/*
		 * 내부반복문
		 * 반복횟수 j는 ?부터 ?까지 ?씩 증가
		 * 규칙성 : ' '를 출력
		 */
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(' ');
				}
			for(int j=1;j<=i;j++) {
				System.out.print('*');
				}
				
		}
			System.out.println();
	}
		
		
		
	
}

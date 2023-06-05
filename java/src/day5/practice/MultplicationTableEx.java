package day5.practice;

public class MultplicationTableEx {

	public static void main(String[] args) {
		//구구단 2단을 출력하는 코드를 작성
		/* 반복횟수 : i는 1부터 9까지
		 * 규칙성 : 2 X 1= 2*1 를 출력
		 */

		int i = 1;
		while(i<10) {
			System.out.println( 2 + "X" + i + " = " + (i*2));
			++i;
		}
	
	
	}
	

}

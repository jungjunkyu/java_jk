package day7.practice;

public class starEx2 {

	public static void main(String[] args) {
		/*
		 *  *		i=1 *=1
		 *  **		i=2	*=2
		 *  ***		i=3	*=3
		 *  ****	i=4	*=4
		 *  *****	i=5	*=5
		 *  
		 *  외부반복문
		 *  반복횟수 : i는 1부터 5까지 1씩 증가
		 *  실행문 : *5개를 출력 후 엔터
		 *  
		 *  
		 *  
		 *  *5개를 출력
		 *  내부반복문
		 *  반복횟수 : j는 1부터 5까지 1씩 증가
		 *  규칙성 *을 출력
		 *  
		 *  //엔터
		 *  
		 */
		
		
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
	}

}

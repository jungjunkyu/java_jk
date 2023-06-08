package day7.practice;

public class printAlphabet2Ex {

	public static void main(String[] args) {
		//
		/*
		 * 외부반복문
		 * 반복횟수 end 는 'a'부터 시작해서 'z'까지 1씩 증가
		 * 규칙성 : 'a'부터 end까지  출력
		 * 
		 * 
		 * 내부 반복문
		 * 반복횟수 : ch는 'a' 부터 시작해서 end까지 1씩 증가
		 * 규칙성 : ch를 출력
		 * 
		 */
		
	
		char ch = 'a', end;
		
		for(end='a';end<='z';++end) {
			for(ch='a';ch<=end;++ch) {
				System.out.print(ch);
				
			}
			System.out.println();
		}

	}

}

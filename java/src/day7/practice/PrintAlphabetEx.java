package day7.practice;

public class PrintAlphabetEx {

	public static void main(String[] args) {
		// a부터z까지 출력하는 코드 작성.
		
		/*
		 * <방법1>
		 * a + 정수 => int
		 * a 에 0을 더하면 a
		 * a 에 1을 더하면 b
		 * a 에 2를 더하면 c
		 * a 에 3을 더하면 d
		 * ...
		 * a 에 25를 더하면 z
		 * 
		 * 반복횟수 : i는 0부터 26보다 작을 때 까지 1씩 증가
		 * 규칙성 : 'a'에 i를 더한 값을 문자형으로 자료형변환해서 출력
		 * 반복문 종료 후 : 없음
		 * 
		 * 
		 * 
		 * <방법2>
		 * 문자형 변수 ch++을 하면 char
		 * 반복횟수 : ch는 'a' 부터 시작해서 'z'까지 1씩 증가
		 * 규칙성 : ch를 출력
		 * 본복문 종료 후 : 없음
		 * 
		 */
		int i;
		char ch ='a';
		for(i=0;i<26;++i) {
			System.out.print((char)(ch+i));
			
			
			
		
		System.out.println();
		
		
				
			}
			
	}

}

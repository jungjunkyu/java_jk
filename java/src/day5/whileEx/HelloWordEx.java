package day5.whileEx;

public class HelloWordEx {

	public static void main(String[] args) {
		//Hello World를 10번 출력하는 코드 작성
		/*반복 횟수 : 10번, 1번부터 10번까지 1씩 증가
		 * ->변수의 초기값 : 1
		 * ->조건식 : 10까지 -> 10보다 작거나 같을때까지
		 * ->증가하는 식 : 1씩 증가
		 * 규칙성 : Hello World를 출력
		 */
		int max =3;
		int i = 1;//변수 초기값 : 1
		//i가 10보다 작거나 같을 때 까지
		while(i <=max) {
			System.out.println("Hello Whrld");
			i++;//i++, i = 1+1, i+1 = 1
		}
		System.out.println("==============================");
		/*반복횟구 : i는 10 부터 1까지 1씩 감소
		 */
		i = max;
		while(i-- >= 1) {
			System.out.println("Hello World");
						
		}
	}

}

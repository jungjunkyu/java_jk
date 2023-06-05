package day5.practice;

public class RandomEx {

	public static void main(String[] args) {
		//min부터 max 사이의 랜덤한 정수를 만드는 코드를 작성하시오.
		//math.random() : 0이상 1미만의 실수를 랜덤으로 생성
		/*
		 * 
		 */
		//0 * (max-min+1) <= r * (max-min+1) < 1* (max-min+1)
		
		
		//랜덤한 정수를 만드는 코드 두줄 공식
		int min = 1, max = 10;
		int random = (int)(Math.random() * (max - min + 1) + min);
		System.out.println(Math.random());
		

	}

}

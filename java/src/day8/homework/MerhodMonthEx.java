package day8.homework;

public class MerhodMonthEx {

	public static void main(String[] args) {
		//월을 입력받아 월에 맞는 영어를  출력하세요.
		//메서드 이용
		/*
		 * 예 :
		 * input month :
		 * 3
		 * March
		 */
		
		printMonth(1);
		System.out.println(getMonth(1));

	}

	/**월이 주어지면 주어진 월의 영문을 알려주는 메서드
	 * 매개변수 : 월 => int month
	 * 리턴타입 : 없음 => void
	 * 메서드명 : printMonth
	 */
	public static void printMonth(int month) {
		switch(month) {
		case 1 : System.out.println("jan");			break;
		case 2 : System.out.println("feb");			break;
		case 3 : System.out.println("mar");			break;
		case 4 : System.out.println("apr");			break;
		case 5 : System.out.println("may");			break;
		case 6 : System.out.println("june");		break;	
		case 7 : System.out.println("july");		break;
		case 8 : System.out.println("aug");			break;
		case 9 : System.out.println("sep");			break;
		case 10 : System.out.println("oct");		break;
		case 11 : System.out.println("nov");		break;
		case 12 : System.out.println("dec");		break;
		case 13 : System.out.println("wrong month");
		
		}
	}
	
	/**월이 주어지면 주어진 월의 영문을 알려주는 메서드
	 * 매개변수 : 월 => int month
	 * 리턴타입 : 월의 영문 => String
	 * 메서드명 : getMonth
	 */
	public static String getMonth(int month) {
		switch(month) {
		case 1 :return "jan";			
		case 2 : return"feb";			
		case 3 : return"mar";			
		case 4 : return"apr";			
		case 5 : return"may";			
		case 6 : return"june";		
		case 7 : return"july";		
		case 8 : return"aug";			
		case 9 : return"sep";			
		case 10 : return"oct";		
		case 11 : return"nov";		
		case 12 : return"dec";		
		default : return"wrong month";
	}
	}
	
	
	
}

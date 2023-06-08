package day7.breakEx;

public class HelloWorldEx {

	public static void main(String[] args) {
		//Hello World를 5번 찍는 
		
		
		int i=1;
		while(true) {
			System.out.println("Hello World!");
			if(i==5) {
				break;
			}
			++i;
		}

	}

}

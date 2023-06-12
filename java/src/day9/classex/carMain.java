package day9.classex;

public class carMain {

	public static void main(String[] args) {
		/* 현대 뉴 아반떼 2023년식 자동차 객체를 생성하는 코드를 작성하세요.
		 */
		car myCar = new car("New AVANTE","Hyundai",2023);
		//현재 내차정보
		myCar.turn();
		myCar.setGear('D');
		myCar.printInfo();
		myCar.speedChange(false);
		myCar.speedChange(false);
		myCar.speedChange(false);
		myCar.printInfo();
		myCar.speedChange(true);
		myCar.speedChange(true);
		myCar.speedChange(true);
		myCar.printInfo();
		myCar.speedChange(false);
		myCar.printInfo();
	}

}

/*
 * Car					자동차
 * String name;			차명
 * String company;		제조사
 * int year;			연식
 * int speed;			속력
 * char gear;			P:주차, R:후진, D:주행, N:중립
 * boolean power		전원
 */


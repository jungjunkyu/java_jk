package day22.practice.phone.run;

import day22.practice.phone.vo.PhoneBook;

public class PhoneListEx {

	public static void main(String[] args) {
		PhoneBook pb = new PhoneBook();
		System.out.println(pb.insertPhone("Hong", "010-1234-5678"));
		System.out.println(pb.insertPhone("Bong", "010-234-5678"));
		pb.print(p->true);
		
	}

}

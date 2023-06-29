package day22.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;

public class StreamEx2 {

	public static void main(String[] args) {
		List<Student>list = Arrays.asList(
			new Student(1,1,1,"Hong",100,90,80),
			new Student(1,1,1,"Tong",10,20,30),
			new Student(1,1,1,"Kong",60,50,20),
			new Student(1,1,1,"Yong",100,80,100),
			new Student(1,1,1,"Gong",50,80,70));
		//국어성적이 60점 이상인 학생들의 이름을 출력
		Stream<Student>stream = list.stream();
		stream
			.filter(s->s.getKor() >=60)
			.map(s->s.getName())
			.forEach(name ->System.out.println(name));
		
		stream = list.stream();
		stream
			.filter(s->s.getKor() >=60)
			.forEach(std ->System.out.println(std.getName()));
		//국어성적의 총합
		stream = list.stream();
		int sum = stream.mapToInt(std->std.getKor()).sum();
		System.out.println(sum);
		//국어성적의 평균
		stream = list.stream();
		double avg = stream
				.mapToInt(std->std.getKor())
				.average()
				.getAsDouble();
		System.out.println(avg);
		//국어 성적의 총합
		stream = list.stream();
		sum = stream.map(std->std.getKor()).reduce(0, (a,b)->a+b);
		System.out.println(sum);
	}

}
@Data
@AllArgsConstructor
class Student{
	int grade,classNum,num;
	String name;
	int kor,math,eng;
}
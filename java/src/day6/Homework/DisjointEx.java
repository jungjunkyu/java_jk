package day6.Homework;

import java.util.Scanner;

public class DisjointEx {

	public static void main(String[] args) {
		//두 정수를 입력받아 두 정수가 서로소 관계인지 판별하느 코드를 작성하세요.
        //서로소 : 최대공약수가 1인 두 수의 관계
        /* input 2 number : 3 4 
         * disjoint!(서로소)
         * 
         * input 2 number : 8 4
         * not disjoint!(서로소 아님)
         * 
         * 
         * 반복회수 : i는 1부터 num1까지 1씩 증가
		 * 규칙성 : i가 num1의 약수이고 i가 num2의 약수이면 i를 gcd에 저장
		 * 			num1을 i로 나누었을 때 나머지가 0과 같고
		 * 			num2를 i로 나누었을 때 나머지가 0과 같아면
		 * 			i를 gcd에 저장
		 * 반복문 종료 후 : gcd가 1이면 Disjoint를 출력하고, 아니면 Not disjoint
		 * 
         */
     
     //두 정수를 입력받는다
		int num1, num2, i = 1, gcd = 1;
				
				Scanner sc = new Scanner(System.in);
				System.out.println(" input 2 number : ");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				
				//for(i=1,gcd=1;i<=num1;++i){ 가능
				while(i<=num1) {
					if(num1%i==0 && num2%i==0) {
						gcd = 1;
					}
					++i;
				}
				if(gcd==1) {
					System.out.println("disjoint!");
					
				}else {
					
					System.out.println("not disjoint");
		
	}

				
				
		//for(i=1,gcd=1;i<=num1;++i){
				
}
}

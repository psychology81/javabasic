/*
 * 관계연산자 
 *  76쪽 
 * T 혹은 F 로 나타냄 > < >= <= 로 나타냈을 때 ...
 * 
 */

package chapter3;

import java.util.Scanner;

public class A02_realationalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(10 > 5);  // 값은 true 로 나옴
		System.out.println(10 < 5); // 값 f
 		
/*
 * 생년을 입력받아 성년 여부(19세 이상)를 판단하라. 
 * 1)필요한 변수 선언  
 * 2)관계연산 boolean type
 * 3)생년 입력 요구 메시지 출력
 * 4)생년 입력
 * 5)나이 계산 및 성인 여부 판단 		
 */

		//1. 필요 변수 선언
		Scanner sc = new Scanner(System.in);
		double born, age;
		boolean adultage;
		
		//2. 생년 입력
		
		System.out.println(" 생년을 입력하세요." );
		born = sc.nextDouble();
		
		//3. 계산 (처리)
		age = 2019 - born;
		adultage = age >= 19;
		
		
		//4. 출력
		System.out.println("성인인가요?" + adultage );
		

	}

}

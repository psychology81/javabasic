/*
 * A07_ConditionalOperator
 * 조건연산자
 * 조건식?결과1:결과2;  조건식이 참이면 결과1 조건식이 거짓이면 결과2가 선택됨. 
 */


package chapter3;

import java.util.Scanner;

public class A05_Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// if 문을 사용해서 조건식을 더 간단하게 표현할 수 있어
		
		int result;
		result = (10>5)? 100 : 999 ;  // 그니까 리절트값은 결과 1이거나 2임
		System.out.println(result);
		
		
		int result2;
		result2 = (10<5)? 100 : 999 ;  // 그니까 리절트값은 결과 1이거나 2임
		System.out.println(result2);
		
		
		
		// 더 나이 많은 고양이 출력하기 ㅎ
		
		Scanner sc = new Scanner(System.in);
		
		//입력
		int age1, age2;
		String catname1, catname2;
		
		//처리
		System.out.println("고양이1 의 이름 : ");
		catname1 = sc.next();
		
		System.out.println(catname1 + "의 나이");
		age1 = sc.nextInt();

		System.out.println("고양이2 의 이름 : ");
		catname2 = sc.next();
		
		System.out.println(catname2 + "의 나이");
		age2 = sc.nextInt();
		
		String age; // 난 아까 int 로 헀는데 오류났었음
					// 사실 age는 사실 내가 직접 입력한 값이니까(고양이 나이를 입력했음) String 으로 해야함
		age = (age1>age2)? catname1 : catname2;
		System.out.println(age + "의 나이가 더 많네요.");
		
		
	// 
		
		Scanner kbd = new Scanner(System.in);
		int kongAge, penryAge;
		String elder;
		
		kongAge = kbd.nextInt();
		penryAge = kbd.nextInt();
		
		elder = (kongAge > penryAge? "콩이" : "펜리 ");
		System.out.println(elder + "가 더 나이가 많네요.");
		
	}

}

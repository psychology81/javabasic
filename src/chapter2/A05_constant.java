/* 
 * 상수 : 프로그램에서 변하지 않는 숫자. 항상 변하지 않는 값. 항상 일정한 값. 
 * 자바에서는 final 이라는 키워드를 사용해서 선언한다
 * 리터럴 : 프로그램에서 사용하는 모든 숫자, 문자, 논리값을 일컫는 말
 * 보통은 대입 연산자의 오른쪽에 쓰여자는 값을 이야기한다 
 * 'A', 10, 3.14595 이런식으로 .... . . . . .
 * 
 */

package chapter2;

import java.util.Scanner;

public class A05_constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int max_num = 1000;
		final double PI = 3.141592;
//		System.out.println(max_num);
//		System.out.println(pi);
//		System.out.println(1+max_num);
		
		
		// 키보드로부터 자료를 입력받으려면 ? 스캐너라는 클래스를 사용해야함
	Scanner sc = new Scanner(System.in);
		/*System.out.println("반지름을 입력해주세요 : ");
		double r = sc.nextDouble();
		double circleArea = r * r * PI ;
		System.out.println(circleArea);
	// 방금 PI가 FINAL DOUBLE 에선 대문자 밑에 DOUBLE CIRCLEAREA에서는 소문자였는데
		//여기선ㄷ ㅐ문자 소문자 다 구분해야해서 오류떴음 ㅠ //
		//만약에 소숫점 다 떨어져나가게 정수형으로 출력하려고 하면(명시적 형변환
		//  System.out.println((int)circleArea); sysout ((int) 써클..)ㅊ 처럼
		// int 로 지정해주면 됨 */

		
		
		
		/* 1. 연습문제
		사람 이름을 표현할 ㄸㅐ (char는 문자 하나만 반환해 이름에 적절하지않음)
		문자열을 취급하기 위해 string 을 사용
		*/
		
		String name = "kimsatan";
		System.out.println(name);
		System.out.println("이름을 입력해주세요 : ");
		name = sc.next();
		System.out.println(name);
		
		
		
		//2. 사각형의 넓이 구하기. 가로와 세로의 길이를 입력받아 사각형의 넓이를 구하자. 
		
		
		
		
		
	}

}

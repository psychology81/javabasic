/*
 * A08_BitOperator
 * 비트 논리 연산자 : &, |, ^, ~
 * 비트 이동 연산자(시프트연산자) : <<, >>, >>>  
 */


package chapter3;

public class A06_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 int number = 5 ; // 정수형 숫자 5 10진수
		 System.out.println(number);
		 
		 int number2 = 0b101; // 2진수 숫자 5
		 System.out.println(number2);

		 int number3 = 012; // 8진수  숫자 10
		 System.out.println(number3);
		 
		 int number4 = 0xa; // 16진수  숫자 10
		 System.out.println(number4);
		
		 //  print f 구문을 이용해 서식지정해 "%x" 로 지정해 출력함. (%는 16진수)
		 int number5 = 10;
		 System.out.printf("%x", number5); // 16 진수 형태로 출력을 해주는 것
		  // 여기서 출력된 x 는 숫자임. 근데 여기에 %x로 소문자 쓰면 a가 나오고 대문자 쓰면 대문자가 나온다
		 
		 
		 /* %랑 쓰일 ㅅ ㅜ 있는거
		  * % 랑 옆에 쓰이는거 - 0 m .n 적을 수도 있고 안적을 수도 있는 것. 
		  * - : 왼쪽 정렬 하면서 빈칸은 공백으로 처리하라
		  * 0 : 오른족 정렬, 앞에 빈칸은 0으로 채워라 
		  * m : 실수형 숫자 처리시 전체 자리수에 맞춰서 출력
		  * .n : 소숫점 이하 자리수를 의미한다
		  * 아래는 꼭 적어야하는 것 
		  * %- 십진 
		  * b boolean 
		  * x 16진수 
		  * e 지수형
		  * c 문자
		  * s 문자열
		  * f 실수형 
		  *
		  */
		  
		
		double number = 10.123;
		  System.out.printf("%010.2f", number); // 16진수?
		  
		  
	}

}

/*데이터타입
1)	기본자료형 : 기본 라이브러리에서 제공되는ㄷ ㅔ이터타입
정수형, : byte(=1byte), short(=2b), int(=4b), long(=8b)
문자형, : char(=1b)
실수형 : float(=4b), double(=4b)
논리형 : boolean(t/f) / //컨트롤+쉬프트+/ 같이 누르면 한 번에 주석처리가능
// 컨트롤 + / 하면 그 행이 주석처리됨 (다시 누르면 행주석처리 사라짐) 
*/

// 변수명 : 영, 숫자 혼합 가능! 대신 문자가 맨 앞에 와야함 숫자 맨앞에 못씀
 // 특수문자는 _ $ 로 가능


package chapter2;

public class A02_character {

	public static void main(String[] args) {
		byte b_num1 = 127; //byte 타입 : -2^15~2^15-1 즉 -128~127 까지의 범위만 표현가능 
		System.out.println(b_num1);
		
		short s_num = 32767;
		// short 의 유효숫자범위는 -2^31 ~ 2^31-1 까지 가능 
		// -2147483648 ~ 2147483647 까지
		System.out.println(s_num); // 컨트롤 + 스페이스 누르면 sysout만 쳐도 완성
		
		// long 의 유효숫자 범위 -2^63 ~ 2^63-1
		
		int i_num3 = -2147483648;
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		short sval = 1; 
		int ival = 1;
		double dval = 1.0;
		float fval = 1.0f;
		System.out.println(ival + fval);
		// 정수형보다는 실수형의 범위가 더넓다 정수형+실수형 혼합연산시 실수형으로 계산된다//
		
		System.out.println("short형과 int형의 혼합연산"+sval + ival);
		// ---> 문자열을 집어넣으면 계산하는 연산자가 아니라 그냥 뒤따라나오는..
		// 결과값 : short형과 int형의 혼합연산11
		System.out.println("short형과 int형의 혼합연산"+(sval + ival));
		// 결과값 : short형과 int형의 혼합연산2
		// 서로 다른 타입의  데이터를 계산할 때 , 어떤식으로 처리될것인가 . . . . 
        // 연산 결과는 범위가 큰 쪽으로 변환되어 처리된다 .  eg. 정+실 = 실 (자동으로 형태가 변환=묵시적형변환)
		
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		int ch2 = 66;
		System.out.println(ch2);
		System.out.println((char)ch2);
		/* 정수형 변수 ch2 를 66로 지정하였다. 출력을하였더니 66이 나왔다
		 * 똑같은 ch2 를 출력할 때 char 로 형태를(캐릭터타입으로 출력) 지정해주었더 b 가 나오ㅓㅆ다
		 * 
		 * 글구 -66은 안됨
		 * 
		 * */

		
		int ch3 = '가';
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		char ch4 = '나';
		System.out.println(ch4);
		System.out.println((int)ch4);

	
		char ch5 = '\u1100';
		System.out.println(ch5);
		System.out.println((int)ch5);	
		
 	}

}

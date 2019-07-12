/*
 *  - 증감연산자
 *  1) 증가 연산자
 *  	
 *  2) 감소 연산자
 *  
 *  주의점 : a라는 변수에 10 대입.. a=10, b=a++
 * 
 */



package chapter3;

public class A01_incrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = a++;
		System.out.println("b = " + b); // b=10
		System.out.println("a = " + a); // a=11
	
		int c = 10;
		int d = ++c;
		System.out.println("c = " + c); // c=11
		System.out.println("d = " + d); // d=11
	}

}

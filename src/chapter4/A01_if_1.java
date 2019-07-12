/*
 * A01_IfStatement.java
 * if() 제어문 : 조건식이 맞으면 실행문장1을 실행 후 실행문장2를 실행한다.
 *                   아니면 바로 실행문장2를 실행한다.
 * if(조건식) {
 *   실행문장 1;
 * } else {
 *    조건 거짓일때 싱행 }
 * 조건 노상관 실행문장 2;
 */

package chapter4;

public class A01_if_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if : 한 개만 썻을 때: 순차적으로처리된다.
		if (10 > 5) {
			System.out.println("조건이 맞으면 실행되는 문장");
		}
		System.out.println("조건과 관계없이 순차적으로 실행되는 문장");
		//
		System.out.println("---------");
		//
		if (10 > 5) {
			System.out.println("조건이 맞으면 실행되는 문장");
		} else {
			System.out.println("조건이 거짓일때 실행할 문장");
		}
		System.out.println("조건과 관계없이 순차적으로 실행되는 문장");
		
		
		
		
		
	}

}

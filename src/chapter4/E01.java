package chapter4;

import java.util.Scanner;

public class E01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 연령에 따라서 입장료를 달리받는다
		  //  0~10살 이하 = 1000원
		  //  11~20살 이해 = 2천원
		  //  21세 이상 = 3천원
		
		/*
		
	 int age = 10;
	 int money;
	 if(age <= 10) {
		 money = 1000;
	 } else if(age <= 20)  {
	     money = 2000; 
	 } else {
		 money = 3000; 
	 }
		 System.out.println("입장료는" + money + "원입니다.");
		 }
	}
	
*/
		
		// 키보드로부터 숫자를 입력받아 홀 / 짝 판단 하세요
		
		// 1. 변수선언
		Scanner sc = new Scanner(System.in);
		int num;
		
		// 2. 숫자입력할 수 있게 
		System.out.println(" 숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		// 3. 조건 
		// 3-1) 나누기 헀을 때 1이 남으면 홀수
		if((num % 2)==1) {
			System.out.println("홀수");
			
			// 3-2) 나누기 했을 때 안 남으면 짝수
		}else {
			System.out.println("짝수");
	
		}
		
		}
		}
			
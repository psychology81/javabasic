package chapter2;

import java.util.Scanner;

public class EX01_Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		String name = "이름과 나이";  // name 이라는 변수 선언 
		System.out.println(name); 
		System.out.println("이름을 입력해주세요 : ");
		name = sc.next();
		System.out.println("생년을 입력해주세요");
		int age = sc.nextInt();
		age = 2019 - age;
		System.out.println(name + "의 나이는" + age + "살입니다");
	

	}

}

package chapter2;

import java.util.Scanner;

public class EX02_RecArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

Scanner sc = new Scanner(System.in);
String name = "사각형의 넓이";
System.out.println(name); 
 	// 여기까지는 첫 줄 사각형의 넓이 라고 뜸

System.out.println("가로를 입력해주세요 : ");
double width = sc.nextDouble();
	// 가로길이 입력


System.out.println("세로를 입력해주세요 : ");
double length = sc.nextDouble();
	// 세로길이 입력
	
double rectangleArea = width * length ;
	// 처리방법 가로*세로
System.out.println("사각형의 넓이는" + rectangleArea + "입니다.");
	// 자동으로 출력해 rextangleArea를 미리 계산해 문장으로 결과를 나타내줌
		
		
//교수님이 한 거 
/* 필요한 변수 선언
Scanner sc = new Scanner(System.in);
double width, height;
double recArea;

// 입력을 요구하는 메시지 출력
System.out.println("가로의 길이를 입력하세요");
width = sc.nextDouble();
System.out.println("세로의 길이를 입력하세요");
height = sc.nextDouble();

// 입력받은 가로, 세로길이를 이용하여 면적 계산
recArea = width * height;

// 계산된 결과를 출력
System.out.println("4각형의 면적 : " + recArea);
*/
		
	}

}

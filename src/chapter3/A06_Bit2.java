package chapter3;

public class A06_Bit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 byte num1 = 0b00001101;
		 byte num2 = 0b00001010;
		
		 byte result = (byte)(num1 ^ num2);
	//	 int result = num1 ^ num2;
		 System.out.println(result);
		 
		 // byte result = (byte)(num1 & num2); 로 해도 됨 
		 
		 
		 
	}

}

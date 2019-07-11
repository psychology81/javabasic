/*실수형 데이터타입
 * 
 * float(4b) : 부호비트1 지수부8 가수부23 
 * double(8b) : 부호비트1, 지수부11, 가수부52
*/
package chapter2;

public class A03_Double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dnum = 3.14;
		float fnum = 3.14f; //값 뒤에 f 를 붙여줘야함//
		/* java에서 실수형은 기본적으로 double 으로 지정. 
		 * float은 지정값 뒤에 f 를 붙여줘야지 float 타입으로 인식함 */
		System.out.println(dnum);
		System.out.println(fnum);
		
		
		// 실수를 부동소수점으로 표현하면 생기는 문제
		double dval = 1;
		
		for(int i = 0; i <10000; i++) {
			dval = dval + 0.1;
		}
		System.out.println(dval );
		
		/*위의 게 반복구조인데
		 * 0부터 시작해서 1만보다 작은, 즉 9999까지(만 번)을 돌아간다.
		 * 0.1을 1만번동안 돌리면 1000 이 됨. 
		 * 근데 값이 1001.000000000159 이 나옴ㅋ
		 * 왜? 수학적인 문제라는데 난 알고싶지 않다 ㅋ
		 * 지수형 방식으로 숫자표현하는데 정확한 0의 표현이 안 되어있기 때문에 그렇다네요 . 
		 */
		
		
	}

}

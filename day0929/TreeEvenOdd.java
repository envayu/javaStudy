//사용자한테 임의의 수 N을 입력받아 짝수인지 홀수인지 판별하는 프로그램을
//삼항연산자를 이용해 작성

import java.util.Scanner;
class TreeEvenOdd{
      public static void main(String []args){
      Scanner sc = new Scanner(System.in);

	  int n;

	  System.out.print("임의의 수를 알려주세요");
      n = sc.nextInt();

	  //System.out.print(n + "은(는)" + ((n%2==0)?"짝수":"홀수") + "입니다.");//=아니고 ==해야함
	  String result = (n%2==0)?"짝수":"홀수";
	  System.out.print(result + "입니다");//이것도 가능
	  



	}
}

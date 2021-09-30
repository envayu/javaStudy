//비트연산자 중에 비트곱(&)과 비트합( | )은 논리연산자로도 사용할 수 있습니다.
//연습) 두사람의 나이를 입력받아 두 사람모두 20살 이상인지 판별하여 적합한
//메세지를 출력하는 프로그램을 비트연산자를 논리연산자를 이용해 작성 해 봅니다

import java.util.Scanner;
class BitLogical02
{
      public static void main(String []args)
	{
      Scanner sc = new Scanner(System.in);
 
      int age1, age2;
	  
	  System.out.println("첫번째 사람의 나이를 알려주세요");
      age1 = sc.nextInt();
	  System.out.println("두번째 사람의 나이를 알려주세요");
      age2 = sc.nextInt();

	  if (age1 >= 20 & age2 >= 20)
		  System.out.println("두 사람 모두 20살 이상입니다");
	  else
		  System.out.println("두 사람 모두 20살 이상은 아닙니다");


	}
}

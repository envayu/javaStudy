//연습)두사람의 나이를 입력받아 서로 같은지 판별하여
//적합한 메세지를 출력하는 프로그램을 작성해봅니다.
//클래스, 변수, 출력 메세지등은 자유롭게

import java.util.Scanner;
class SameAge{
      public static void main(String []args){
      Scanner sc = new Scanner(System.in);

	  int a,b;

	  System.out.println("첫번째 사람의 나이를 알려주세요");
      a = sc.nextInt();
	  System.out.println("두번째 사람의 나이를 알려주세요");
      b = sc.nextInt();
	 
	  if (a == b) 
		System.out.println("동갑입니다");
		if ( a > b )
		System.out.println("첫번째 사람이 나이가 더 많습니다");
		if ( a < b)
		System.out.println("두번째 사람이 나이가 더 많습니다");
	}
}

//연습) 다음과 같이 동작하는 프로그램을 작성해봅니다
//실행예> 1부터 어떤 수 까지 더할까요? 7 
//1부터 7까지의 합은 ~~ 입니다.

import java.util.Scanner;
class CompoundOperatorTest03
{
      public static void main(String []args){
      Scanner sc = new Scanner(System.in);

	  int n;

	  System.out.println("1부터 어떤 수까지 더할까요?");
      n = sc.nextInt();
	  int i = 1;
	  int sum = 0;
	  
	  for( i=1 ; i <= n ; i++){
			sum += i;
			}
		System.out.println("1부터 "+n+"까지의 합은"+sum+"입니다.");
	  }
}

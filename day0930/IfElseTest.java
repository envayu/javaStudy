//연습)사용자한테 임의의 수N을 입력받아 N이 양수이면 그 수에 100을 더한값을 출력한 뒤 "작업종료"를 출력
//음수이면 그 수의 제곱을 출력한다음 "작업종료"를 출력

import java.util.Scanner;
class  IfElseTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System. in);
		int n;
		System.out.print("n을 입력해주세요");
		n = sc.nextInt();

		if ( n >= 0)
		System.out.print(n+100);
		 else
		  System.out.print(n*n);
        
		System.out.print("작업종료");
	}	
}

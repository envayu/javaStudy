//연습) 사용자한테 임의의 수 N을 입력받아 그 수가 6의 배수인지 판별하여 논리값을 출력하는 프로그램을 작성

import java.util.Scanner;
class  Test002
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N;
		
		System.out.print("임의의 수를 입력하시오===>");
		N = sc.nextInt();

		boolean result;
		result = N % 6 == 0;
		System.out.print(result);

	}
}

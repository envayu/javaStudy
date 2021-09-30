//10000보다 작은 정수를 입력받아 이것을 천, 백, 십,일의 자리로 분리해 배출하는 프로그램을 작성
//사용자가 5623을 입력하면 5,6,2,3을 차례로 출력하면됨
//나눗셈과 나머지 연산을 사용

import java.util.Scanner;
class  Test003
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N;
		int 천, 백, 십, 일;
		
		System.out.print("임의의 네자리 수를 입력하세요===>");
		N = sc.nextInt();

		천 = N / 1000;
		백 = (N % 1000) / 100;
		십 = ((N % 1000) % 100) /10;
		일 = ((N % 1000) % 100) % 10;

		System.out.println("천의자리"+ 천);
		System.out.println("백의자리"+ 백);
		System.out.println("십의자리"+ 십);
		System.out.println("일의자리"+ 일);
	}
}

//연습)사용자 한테 두개의 정수를 입력받아 그 중에 작은 수를 찾아서 출력하는 프로그램을 작성해보기

import java.util.Scanner; // ;붙임
class MinTest // ;안붙임
{
	public static void main(String[] args) // ;안붙임
	{
		Scanner sc = new Scanner(System. in); //스캐너객체생성
		int a, b, min; //변수선언
		System.out.println("첫번째 수를 입력하세요===>");  
		a = sc.nextInt(); // a를 저장
		System.out.println("두번째 수를 입력하세요===>");
		b = sc.nextInt(); //b를 저장
		if (a < b) // ;안붙임, <의 결과는 boolean 이 된다
			min = a; // b가 a보다 작을 때 a는 min이라고 한다
		else // ;안붙임
			min = b; // b가 a보다 작을 때 b는 min이라고 한다
		System.out.println("작은수는 " + min + "입니다.");
	}
}
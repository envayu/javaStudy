//1파운드는 454그램이다. 몸무게를 파운드로 받아서 그램으로 환산하여 출력하는 프로그램을 작성

import java.util.Scanner;
class Pound 
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double p;

	System.out.print("무게를 파운드로 입력하세요:");
	p = sc.nextDouble();

	System.out.print("무게는" + p*454 + "입니다");
		
	}
}
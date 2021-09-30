// 0~9사이의 난수가 발생하도록 프로그램을 수정해 봅니다.

import java.util.Random;
class RandomNumber 
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int n = rand.nextInt();
		System.out.println(n);

		n = n >>> 1; //무조건 양수를 만드는 표현
		n = n % 10; //n을 10으로 나눈 나머지를 n으로, 지정 16나누기10의 나머지는 6
		System.out.println(n);
	}
}

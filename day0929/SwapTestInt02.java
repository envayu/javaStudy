//정수는 비트차를 이용해 내용을 바꿔칠 수 있음

class SwapTestInt02
{
	public static void main(String[] args) 
	{
		int a = 3;
		int b = 4;
		System.out.println("a="+a);
		System.out.println("b="+b);

		a = a^b;
		b = b^a;
		a = a^b;


		System.out.println("a와 b의 값을 서로 바꾸었습니다");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}

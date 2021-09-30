class DecimalOctalHexaBinary 
{
	public static void main(String[] args) 
	{
		int a = 12; //아무표시없으면 10진수
		int b = 014; //0을 붙이면 8진수로 인식
		int c = 0xC; //0x를 붙이면 16진수로 인식
		int d = 0b1100; //ob를 붙이면 2진수로 인식

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);


	}
}



/*
10진수  8진수   16진수    2진수
0		0		0		0
1		1		1		1
2		2		2		10
3		3		3		11
4		4		4		100
5		5		5		101
6		6		6		110
7		7		7		111
8		10		8		1000
9		11		9		1001
10		12		A		1010
11		13		B		1011
12		14		C		1100
13		15		D		
14		16		E		
15		17		F		
16		20		10
17		21		11
*/
class DecimalOctalHexaBinary 
{
	public static void main(String[] args) 
	{
		int a = 12; //�ƹ�ǥ�þ����� 10����
		int b = 014; //0�� ���̸� 8������ �ν�
		int c = 0xC; //0x�� ���̸� 16������ �ν�
		int d = 0b1100; //ob�� ���̸� 2������ �ν�

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);


	}
}



/*
10����  8����   16����    2����
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
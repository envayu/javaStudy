class  IncrementDeCrement
{
	public static void main(String[] args) 
	{
		int i = 5;
		int j = 5;
		i++;
		++j;
		System.out.println(i);
		System.out.println(j);

		System.out.println("--------------------------------------------");
		// a++�� a+1���ٸ��� a+1 �ڽ��� ������ ���� a++�� �ڽ��� ����
		int a = 10;
		int b = 10;
		System.out.println(a+1); //11
		System.out.println(b++); //10
		System.out.println("--------------------------------------------");
		System.out.println(a); //10
		System.out.println(b); //11
		System.out.println("--------------------------------------------");
		
		// --���� ������ ���
		int n = 5;
		int m = 5;
		n--;
		--m;
		System.out.println(n);
		System.out.println(m);

		System.out.println("--------------------------------------------");
		i = 5;
		j = 5;
		a = ++i; //������ �׳� ++i �̷��Ը� ���� ���⼭�� ���Կ����ڶ� ���̻�� �ΰ��� ��ɾ ���ĵа�,i=i+1�ϰ� a�� �� ���� �����϶�� ��
		b = j++; //b�� j�� ���� �׵ڿ� j�� ���� ���ذ� �׷��Ƿ� b = 5
		System.out.println("i:"+ i); //6
		System.out.println("j:"+ j); //6
		System.out.println("a:"+ a); //6
		System.out.println("b:"+ b); //5

/*
i = 5;
j = 5;
a = ++i; --> i=i+1�ϰ� a�� �� ���� �����϶�� �� i�� 6�̵� �Ŀ� a�� ���������� a, i�Ѵ� 6
b = j++; --> j�� ���� b�������� �ڿ� j�� ���� �׷��Ƿ� b�� j�� �����Ǳ����� ���������� 5 j�� 6

*/

		System.out.println("--------------------------------------------");

		i = 5;
		j = 5;
		int k = 5;
		System.out.println(++i); //6 �����ϰ� i
		System.out.println(j++); //5 j�ϰ� ����
		System.out.println(k+1); //6 k�� ���ϱ� 1
		System.out.println(i); //6 ���� ���������ϱ� 6
		System.out.println(j); //6 ���� ���������ϱ�
		System.out.println(k); //5 �׳� ���ڿ� 1 ���ѰŴ� 5


	}
}



class IntAndDoubleTest
{
	public static void main(String[] args) 
	{
		//������ ������ �����ϸ� ����� ������ ����
		//���� ������ ������ �����Ͽ� �Ǽ����� ���⸦ ���Ѵٸ�
		//������ �ϳ��� �Ǽ��� ����ȯ�Ͽ� �����ؾ� ��

		//int a = 5; // �ʱⰪ�� ���´ٰ� ����
		int a;
		int b;
		a = 5;
		b = 2;

		double result ;
		//result = a/b;  ->2.5�� ���..�׷��� ����� 2.0���� ����
		result = a/(double)b; //2.5�� ����
		System.out.println("������ ���:" + result );


	}
}

//������ ��Ʈ���� �̿��� ������ �ٲ�ĥ �� ����

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


		System.out.println("a�� b�� ���� ���� �ٲپ����ϴ�");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}

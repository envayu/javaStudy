class SwapTestInt 
{
	public static void main(String[] args) 
	{
		int a = 3;
		int b = 4;
		System.out.println("a="+a);
		System.out.println("b="+b);

		int temp; //�ӽú����� ������ int�� int, String�̸� String �ڷ����� �������־����
		temp = a;
		a  = b;
		b = temp;


		System.out.println("a�� b�� ���� ���� �ٲپ����ϴ�");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
class SwapTest 
{
	public static void main(String[] args) 
	{
		String cup1 = "Ŀ��";
		String cup2 = "��ġ";

		System.out.println("��1:" + cup1);
		System.out.println("��2:" + cup2);
		//���� ���� ��1���� Ŀ�ǿ� ��2���� ������ ������ִ�. �ٵ� ����
		//��2�� Ŀ�Ǹ� ����Ͱ� ��1�� ������ ����ʹ�!(�¹ٲٰ��ʹ�!)
		//�׷��ٸ� ������ �ϳ��� �����Ѵ�! ������ �ϳ� �� �����!
		//���� temp��� �ӽú����� �����
		//Ŀ�Ǹ� ������ �ű��, ������ ��1�� �ű�� �������ִ� Ŀ�Ǹ� ��2�οű��

		String temp;
		temp = cup1;
		cup1 = cup2;
		cup2 = temp;

		System.out.println("���� ���빰�� �ٲپ����ϴ�");
		System.out.println("��1:"+ cup1);
		System.out.println("��2:"+ cup2);


	}
}
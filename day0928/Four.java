//����) ��������� ���ڿ��� �Է¹޾� ���ڿ��� ���̱� 4���� �̻����� true,false�� ����ϱ�

import java.util.Scanner;
class  Four
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String data;
		System.out.println("���ڿ��� �Է��ϼ���===>");
		data = sc.next();
		
		boolean result;
		result = data.length() >= 4; //����κ�

		System.out.println(result);//����κ�

	}
}
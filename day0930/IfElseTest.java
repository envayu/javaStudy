//����)��������� ������ ��N�� �Է¹޾� N�� ����̸� �� ���� 100�� ���Ѱ��� ����� �� "�۾�����"�� ���
//�����̸� �� ���� ������ ����Ѵ��� "�۾�����"�� ���

import java.util.Scanner;
class  IfElseTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System. in);
		int n;
		System.out.print("n�� �Է����ּ���");
		n = sc.nextInt();

		if ( n >= 0)
		System.out.print(n+100);
		 else
		  System.out.print(n*n);
        
		System.out.print("�۾�����");
	}	
}

//10000���� ���� ������ �Է¹޾� �̰��� õ, ��, ��,���� �ڸ��� �и��� �����ϴ� ���α׷��� �ۼ�
//����ڰ� 5623�� �Է��ϸ� 5,6,2,3�� ���ʷ� ����ϸ��
//�������� ������ ������ ���

import java.util.Scanner;
class  Test003
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N;
		int õ, ��, ��, ��;
		
		System.out.print("������ ���ڸ� ���� �Է��ϼ���===>");
		N = sc.nextInt();

		õ = N / 1000;
		�� = (N % 1000) / 100;
		�� = ((N % 1000) % 100) /10;
		�� = ((N % 1000) % 100) % 10;

		System.out.println("õ���ڸ�"+ õ);
		System.out.println("�����ڸ�"+ ��);
		System.out.println("�����ڸ�"+ ��);
		System.out.println("�����ڸ�"+ ��);
	}
}
//����) ��������� ������ �� N�� �Է¹޾� �� ���� 6�� ������� �Ǻ��Ͽ� ������ ����ϴ� ���α׷��� �ۼ�

import java.util.Scanner;
class  Test002
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N;
		
		System.out.print("������ ���� �Է��Ͻÿ�===>");
		N = sc.nextInt();

		boolean result;
		result = N % 6 == 0;
		System.out.print(result);

	}
}

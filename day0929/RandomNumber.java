// 0~9������ ������ �߻��ϵ��� ���α׷��� ������ ���ϴ�.

import java.util.Random;
class RandomNumber 
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int n = rand.nextInt();
		System.out.println(n);

		n = n >>> 1; //������ ����� ����� ǥ��
		n = n % 10; //n�� 10���� ���� �������� n����, ���� 16������10�� �������� 6
		System.out.println(n);
	}
}

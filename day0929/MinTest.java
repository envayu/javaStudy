//����)����� ���� �ΰ��� ������ �Է¹޾� �� �߿� ���� ���� ã�Ƽ� ����ϴ� ���α׷��� �ۼ��غ���

import java.util.Scanner; // ;����
class MinTest // ;�Ⱥ���
{
	public static void main(String[] args) // ;�Ⱥ���
	{
		Scanner sc = new Scanner(System. in); //��ĳ�ʰ�ü����
		int a, b, min; //��������
		System.out.println("ù��° ���� �Է��ϼ���===>");  
		a = sc.nextInt(); // a�� ����
		System.out.println("�ι�° ���� �Է��ϼ���===>");
		b = sc.nextInt(); //b�� ����
		if (a < b) // ;�Ⱥ���, <�� ����� boolean �� �ȴ�
			min = a; // b�� a���� ���� �� a�� min�̶�� �Ѵ�
		else // ;�Ⱥ���
			min = b; // b�� a���� ���� �� b�� min�̶�� �Ѵ�
		System.out.println("�������� " + min + "�Դϴ�.");
	}
}
//��Ʈ������ �߿� ��Ʈ��(&)�� ��Ʈ��( | )�� �������ڷε� ����� �� �ֽ��ϴ�.
//����) �λ���� ���̸� �Է¹޾� �� ������ 20�� �̻����� �Ǻ��Ͽ� ������
//�޼����� ����ϴ� ���α׷��� ��Ʈ�����ڸ� �������ڸ� �̿��� �ۼ� �� ���ϴ�

import java.util.Scanner;
class BitLogical02
{
      public static void main(String []args)
	{
      Scanner sc = new Scanner(System.in);
 
      int age1, age2;
	  
	  System.out.println("ù��° ����� ���̸� �˷��ּ���");
      age1 = sc.nextInt();
	  System.out.println("�ι�° ����� ���̸� �˷��ּ���");
      age2 = sc.nextInt();

	  if (age1 >= 20 & age2 >= 20)
		  System.out.println("�� ��� ��� 20�� �̻��Դϴ�");
	  else
		  System.out.println("�� ��� ��� 20�� �̻��� �ƴմϴ�");


	}
}

//��Ʈ������ �߿� ��Ʈ��(&)�� ��Ʈ��( | )�� ���������ڷε� ����� �� �ֽ��ϴ�.

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

	  if (++age1 >= 20 & ++age2 >= 20) //�̽��� ���� �����̿��� ������
	  //if (++age1 >= 20 && ++age2 >= 20) �̽��� ���� �����̸� �ڰ� �����������
		  System.out.println("�� ����� ���̸� 1�� �����ϸ� �λ�� ��� ������ �̻��Դϴ�");
	  else
		  System.out.println("�� ����� ���̸� 1�� �����ϸ� �λ�� ��� �������̻��� �ƴմϴ�");

	  System.out.println("age1:"+age1);
	  System.out.println("age2:"+age2);


	}
}
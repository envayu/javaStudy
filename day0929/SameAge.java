//����)�λ���� ���̸� �Է¹޾� ���� ������ �Ǻ��Ͽ�
//������ �޼����� ����ϴ� ���α׷��� �ۼ��غ��ϴ�.
//Ŭ����, ����, ��� �޼������� �����Ӱ�

import java.util.Scanner;
class SameAge{
      public static void main(String []args){
      Scanner sc = new Scanner(System.in);

	  int a,b;

	  System.out.println("ù��° ����� ���̸� �˷��ּ���");
      a = sc.nextInt();
	  System.out.println("�ι�° ����� ���̸� �˷��ּ���");
      b = sc.nextInt();
	 
	  if (a == b) 
		System.out.println("�����Դϴ�");
		if ( a > b )
		System.out.println("ù��° ����� ���̰� �� �����ϴ�");
		if ( a < b)
		System.out.println("�ι�° ����� ���̰� �� �����ϴ�");
	}
}
//��������� �ΰ��� ������ �Է¹޾� �� �߿� �������� ã�� ����ϴ� ���α׷���
//���׿����ڸ� �̿��� �ۼ�


import java.util.Scanner;
class TreeMinTest{
      public static void main(String []args){
      Scanner sc = new Scanner(System.in);

	  int a,b;

	  System.out.print("ù��° ���� �˷��ּ���");
      a = sc.nextInt();
	  System.out.print("�ι�° ���� �˷��ּ���");
      b = sc.nextInt();

      System.out.print((a<b)?a:b); //a��b���� ��������? ������a,a�� ũ��b 

	  
	}
}

/*
int�� a,b,min; �� ����ߴٸ�
min = (a<b)?a:b; ���ֱ�

*/
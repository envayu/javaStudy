//��������� ������ �� N�� �Է¹޾� ¦������ Ȧ������ �Ǻ��ϴ� ���α׷���
//���׿����ڸ� �̿��� �ۼ�

import java.util.Scanner;
class TreeEvenOdd{
      public static void main(String []args){
      Scanner sc = new Scanner(System.in);

	  int n;

	  System.out.print("������ ���� �˷��ּ���");
      n = sc.nextInt();

	  //System.out.print(n + "��(��)" + ((n%2==0)?"¦��":"Ȧ��") + "�Դϴ�.");//=�ƴϰ� ==�ؾ���
	  String result = (n%2==0)?"¦��":"Ȧ��";
	  System.out.print(result + "�Դϴ�");//�̰͵� ����
	  



	}
}

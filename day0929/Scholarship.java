//����)�л��� �̸�, ����, ����, ������ �Է¹޾� ���������� 90���̻��̰�
//��������� 90���̻��̸� ���б��� �����Ϸ��� �մϴ�
//���б� ���޿��θ� �Ǻ��ϴ� ���α׷��� �ۼ�

import java.util.Scanner;
class Scholarship{
      public static void main(String []args){
      Scanner sc = new Scanner(System.in);

      String name;
      int kor,eng,math,tot;
	  double avg;

      System.out.println("�л� �̸��� �����ΰ���?");
      name = sc.next();
      System.out.println("���� ������ �����ΰ���?");
      kor = sc.nextInt();
      System.out.println("���� ������ �����ΰ���?");
      eng = sc.nextInt();
      System.out.println("���� ������ �����ΰ���?");
      math = sc.nextInt();

      tot = kor + eng + math;
      avg = (double)tot / 3 ;

	  System.out.println("���:"+avg);

	  if (kor >= 90 && avg >= 90) 
		System.out.println("���б����޴�����Դϴ�");
		else 
		System.out.println("���бݴ���ڰ��ƴմϴ�");
		
   }
}
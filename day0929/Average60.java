//����)�л��� �̸�, ����, ����, ���� ������ �Է¹޾� ������ ����� ���ϰ� ����� 60�� �̻��̸�
//"�հ�" �ƴϸ� "���հ�"�� ����ϴ� ���α׷��� �ۼ�(��, ����� �Ǽ������� ó���մϴ�)

import java.util.Scanner;
class Average60{
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
      avg = tot / 3.0; // ����� ������ �ƴѽǼ��� �����߱� ������ (double)tot �ϴ��� 3���� 3.0���� �����ִ°� ����

	  System.out.println("��� :" +avg);
	  if (avg >= 60) 
		System.out.println(name+"�� �հ� �Դϴ�.");
		else 
		System.out.println(name+"�� ���հ� �Դϴ�.");
		
   }
}
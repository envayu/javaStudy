//����)ȫ�뿡 �ִ� �ֿ�Ŭ�������� �������� ���Ͽ� �̸�, ����, Ű�� �Է¹޾� ���������� �ϰ��ִ�
//���̰� 20�� �̻��̰� Ű�� 160�����̸� "���尡��" �׷��� ������ "����Ұ���"�� 
//����ϴ� ���α׷��� �ۼ�, ����, ������, ����

import java.util.Scanner;
class Club{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      String name;
      int age, height;
      System.out.println("�̸��� �����ΰ���?");
      name = sc.next();
      System.out.println("�� �� �ΰ���?");
      age = sc.nextInt();
      System.out.println("Ű�� �� �ΰ���?");
      height = sc.nextInt();
     if( age >= 20 && height <= 160 )
        System.out.println(name+"���� ���尡��");
      else
        System.out.println(name+"���� ����Ұ���");

   }
}
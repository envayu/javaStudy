//���ο����� �ݳ����� 40���̻��� ����鿡�� ����ϰ����� �ǽ��ϰ��ֽ��ϴ�.\
//�̸��� ��������� �Է¹޾� �ϰ��� ����ڸ� �Ǻ��Ͻÿ�
//<ó������> �ϰ��� ����ڴ� 40���̻�, ���ذ� ¦�������̸� ¦�������� �¾���
//���ذ� Ȧ�������̸� Ȧ�������� �¾���


import java.util.Scanner;
import java.util.Date;
class CancerTest04{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      Date today = new Date();
      String name;
      int userYear;
      int thisYear = today.getYear() + 1900;
      System.out.println("�̸��� �Է��Ͻÿ�===>");
      name = sc.next();
      System.out.println("��������� �Է��Ͻÿ�===>");
      userYear = sc.nextInt();
      int age = thisYear -userYear;
      if( age >= 40 &&  thisYear % 2 == userYear % 2)
        System.out.println(name+"����" +thisYear+"�⵵�� ������� ����Դϴ�.");
      else
       System.out.println(name+"����" +thisYear+"�⵵�� ������� ����� �ƴմϴ�.");
   }
}
//�̸��� ��������� �Է¹޾� ���̸� ����ϰ� ���̰� 40���̻����� �Ǻ��Ͽ�
//����ϰ��� ��������� ����� ����ϵ��� ���α׷��� �����غ���
//���ش� 2021��


import java.util.Scanner;
import java.util.Date;
class CancerTest03{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      Date today = new Date();
      String name;
      int year, age;
      int thisYear;
      thisYear = today.getYear()+1900;
      System.out.println("�̸��� �Է��Ͻÿ�===>");
      name = sc.next();
      System.out.println("��������� �Է��Ͻÿ�===>");
      year = sc.nextInt();

      age = thisYear - year;
      System.out.println("���ش� " + thisYear + "�⵵�Դϴ�.");

      if( age >= 40 )
        System.out.println(name+"���� ���� " + age + "�� �Դϴ�. ������� ����Դϴ�.");
      else
        System.out.println(name+"���� ���� " + age + "�� �Դϴ�. ������� ����� �ƴմϴ�.");

   }
}
//�̸��� ��������� �Է¹޾� ���̸� ����ϰ� ���̰� 40���̻����� �Ǻ��Ͽ�
//����ϰ��� ��������� ����� ����ϵ��� ���α׷��� �����غ���
//���ش� 2021��


import java.util.Scanner;
class CancerTest{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      String name;
      int year, age;
      int thisYear;
      thisYear = 2021;
      System.out.println("�̸��� �Է��Ͻÿ�===>");
      name = sc.next();
      System.out.println("��������� �Է��Ͻÿ�===>");
      year = sc.nextInt();

      age = thisYear - year;

      if( age >= 40 )
        System.out.println(name+"���� ���� " + age + "�� �Դϴ�. ������� ����Դϴ�.");
      else
        System.out.println(name+"���� ���� " + age + "�� �Դϴ�. ������� ����� �ƴմϴ�.");

   }
}
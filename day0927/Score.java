//��������� �ΰ��� ������ �Է¹޾� ���ϱ�, ����, ���ϱ�, ������ �� ����� ����ϴ� ���α׷��� �ۼ��ϰ�, �����ϰ�, ������, ���� �� ���ϴ�.

import java.util.Scanner;
class Score{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int number1,number2,���ϱ�,����,���ϱ�,������;
      System.out.println("ù ��° ������ �Է��ϼ���");
      number1 = sc.nextInt();
      System.out.println("�� ��° ������ �Է��ϼ���");
      number2 = sc.nextInt();
      ���ϱ� = number1 + number2;
      ���� = number1 - number2;
      ���ϱ� = number1 * number2;
      ������ = number1 / number2;
      System.out.println(" ** ��� ��� **");
      System.out.println("���ϱ�:" + ���ϱ�);
      System.out.println("����:" + ����);
      System.out.println("���ϱ�:" + ���ϱ�);
      System.out.println("������:" + ������);
   }
}
//� �л��� �̹� �б⿡ ��ǻ�� ����, C��� ���α׷���,����, �Ϲ� ������ ���� ��û�Ͽ��ٰ� ����. 
//�� ������ ������ �Է��ϸ� �� �л��� �̹� �б� ��� ������ ����ϴ� ���α׷��� �ۼ��϶�


import java.util.Scanner;
class Average{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int com,pro,math,eng,tot,avg;
      System.out.println("��ǻ�Ͱ��� ������ �����ΰ���?");
      com = sc.nextInt();
      System.out.println("C������α׷��� ������ �����ΰ���?");
      pro = sc.nextInt();
      System.out.println("���� ������ �����ΰ���?");
      eng = sc.nextInt();
      System.out.println("���� ������ �����ΰ���?");
      math = sc.nextInt();
      tot = com + pro+ eng + math;
      avg = tot / 4;
      System.out.println("  ��� ===> ");
      System.out.println("���:" + avg);
   }
}
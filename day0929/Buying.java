//����) ���ż����� 10���̻��̰ų� ���űݾ��� 20000���̻��̸� ���űݾ��� 10%�� �����Ϸ��� �մϴ�.
//��ǰ��, �ܰ�, ���ż����� �Է¹޾� ���űݾ��� ����ϰ� ������ �����ؾ��ϴ� �ݾ��� ���

import java.util.Scanner;
class Buying{
      public static void main(String []args){
      Scanner sc = new Scanner(System.in);

      String product;
      int price, amount,tot;
	  
	  System.out.println("����ǰ���� �˷��ּ���");
      product = sc.next();
	  System.out.println("�ܰ��� �˷��ּ���");
      price = sc.nextInt();
	  System.out.println("���ż����� �˷��ּ���");
      amount = sc.nextInt();
	  tot = price * amount;

	  if (amount >= 10 || tot >= 20000)
		  System.out.println("�ݾ���"+tot*0.9+"�� �Դϴ�." );
	  else
		  System.out.println("�ݾ���"+tot+"�� �Դϴ�." );


	  }
}
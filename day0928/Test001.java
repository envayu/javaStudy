//����)��������� �ΰ��� ������ �Է¹޾� ��Ģ������ ������ ����� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
// ù��° ���� �Է��Ͻÿ� ==> 
// �ι�° ''
//5+2 5-2 ...

import java.util.Scanner;
class  Test001
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, add, sub, multi, div, mode;
		System.out.print("ù��° ���� �Է��Ͻÿ�===>");
		a = sc.nextInt();
		System.out.print("�ι�° ���� �Է��Ͻÿ�===>");
		b = sc.nextInt();

		add = a + b;
		sub = a - b;
		multi = a * b;
		div = a / b;
		mode = a % b;

		System.out.println("**��Ģ������**");
		System.out.println(a+"+"+b+"="+add);
		System.out.println(a+"-"+b+"="+sub);
		System.out.println(a+"*"+b+"="+multi);
		System.out.println(a+"/"+b+"="+div);
		System.out.println(a+"%"+b+"="+mode);
	}
}

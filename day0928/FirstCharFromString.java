import java.util.Scanner;
class  FirstCharFromString
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String data;
		System.out.println("���ڿ��� �Է��ϼ���==>");
		data = sc.next();
		//char first = data.charAt(0);
		char first;
		first = data.charAt(0);
		System.out.println("ù��° ���ڴ� " + first + "�Դϴ�.");
		//System.out.println("ù��° ���ڴ� " + data.charAt(0) + "�Դϴ�.");
	
	}
}


/* ����, string���� �����ϰ� �;��

String first = data.charAt(0)+"";
System.out.println("ù��° ���ڴ� " + first + "�Դϴ�.");

---> String���� ����� ���ؼ� + ""

String first = data.substring(0.1);
System.out.println("ù��° ���ڴ� " + first + "�Դϴ�.");

---> 0~1 ���� ��������

*/
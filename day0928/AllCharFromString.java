//01 ���ʴ�� ���ڸ� �����������ʹ�, �ݺ����� ���
//02 ���ϴ� ������ ������ �����

class AllCharFromString 
{
	public static void main(String[] args) 
	{
		String data;
		data = "java";
		//���� ���� ���ٷ� ���� string data = "hello";

		char ch;
		int cnt = 0;


		//�ݺ������� ����
		for(int i=0 ; i < data.length() ; i=i+1){
			ch = data.charAt(i);
			//System.out.println(ch);
			if (ch == 'a');//ch�� a�� ��������?
				cnt = cnt + 1;//�׷��ٸ� cnt�� 1 ���ϼ���
		}
		System.out.println("�ҹ��� a�� ������" + cnt + "�� �Դϴ�");

		/* ���ʴ�� ���ڸ� �ϳ��ϳ� �������� ���
		ch = data.charAt(0);
		System.out.println(ch);
		ch = data.charAt(1);
		System.out.println(ch);
		ch = data.charAt(2);
		System.out.println(ch);
		ch = data.charAt(3);
		System.out.println(ch);
		ch = data.charAt(4);
		System.out.println(ch);*/



	}
}
class CharAndStringTest 
{
	public static void main(String[] args) 
	{
		//�ڹٿ����� ���Ϲ����� ó���� ���ڿ��� ó���� �ٸ�
		//�ϳ��� ���ڸ� ǥ���ϱ� ���ؼ��� ��������ǥ�� ������ϰ�
		//���ڿ��� ó���ϱ� ���ؼ��� ū����ǥ�� ����� ��
		//���� �ϳ��� ���������� ū����ǥ�� �����ٸ�, char�� ����x
		//String���� �����ؾ���

		char firstName;
		firstName = '��' ;
		System.out.println(firstName);

		String name;
		name = "�谡��";
		System.out.println(name);

		//char lastName;
		//lastName = "��"; -> ū����ǥ ���������� String lastName; �����ϸ� ����
		char lastName;
		lastName = '��';
		System.out.println(lastName);

/* #����
C:\javaStudy\day0928>javac CharAndStringTest.java
CharAndStringTest.java:20: error: incompatible types: String cannot be converted to char
                lastName = "��";
                           ^
1 error

*/

		String data;
		data = "hello"; //������ ���ڸ� ����ϰ��; charAt���,, ��ġ�� ����� 0���� ����
		char last = data.charAt(4); //ĳ���� �̸� = ��Ʈ������.���(�ε���)
		System.out.println("�Ǹ������� �ִ� ���ڴ� " +last+"�Դϴ�.");



	}
}
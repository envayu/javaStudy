class DataTypeTest
{
	public static void main(String[] args) 
	{
		//byte age;
		//short age;
		int age;
		//long age;
		age = 27;
		System.out.println("�������� ����:" + age + "�� �Դϴ�.");


		//double height;
		float height;
		//height = 167.8f;
		height = (float)167.8;
		System.out.println("�������� Ű:" +height+"�Դϴ�.");
/* #����
C:\javaStudy\day0928>javac DataTypeTest.java
DataTypeTest.java:15: error: incompatible types: possible lossy conversion from double to float
                height = 167.8;
                         ^
						 >�����Ͱ� �սǵ� �� ���� ���� ��ȣ�� �� �� ����
						 >167.8�� ������ �� ũ�ϱ� �ű⿡ �־� ���� �÷Կ� ���������� Ű �ڿ� f�� �ٿ�!
						 >�Ǵ� �տ� (float)�ٿ��� ����Ʈ ũ�⸦ �ٿ�->�ڷ�����ȯ�� �Ϸ� �����ϴ°�
1 error
*/

		char gender;
		gender = 'F'; // �� ���ڴ� ���� ����ǥ
		//gender = "F"; �� ����ǥ�� ������ ���ڿ��� ����ϱ� ������ char�� ���� �Ұ���
		System.out.println("�������� ������:"+gender);
/* #����
C:\javaStudy\day0928>javac DataTypeTest.java
DataTypeTest.java:23: error: incompatible types: String cannot be converted to char
                gender = "F";
                         ^
1 error
*/
        
		boolean isVaccine;
		isVaccine = true;
		System.out.println("�������� 1����� ��������:" + isVaccine);
	}
}

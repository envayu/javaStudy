class RangeByte 
{
	public static void main(String[] args) 
	{
		//1byte�� 8bit�� ������
		//1bit�� ǥ���� �� �ִ� ���� ������ 0,1 �ΰ���
		//2bit�� �ִٸ� 00 / 01 / 10 / 11 �� 4����
		//1byte(8���� bit)�߿� �� ���ʿ� �ִ� bit�� �������� ������� �Ǻ��ϴ� ��ȣ ��Ʈ�� ���
		//������ 7���� ��Ʈ�� ���ڷ� ǥ��, ���� ǥ���� �� �ִ� ������ ������ ����
		//���� 2�� 7���� ���� ��� 2�� 7����-1���� ǥ������
		//-128 ~ 127 ���� ó������

		byte data; //�����̸��� data
		data = -128;
		System.out.println(data);
		data = (byte)(data - 1);				
		System.out.println(data);

	}
}


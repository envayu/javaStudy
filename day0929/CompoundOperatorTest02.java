//CompoundOperatorTest �ڵ��ݺ�������غ���

class CompoundOperatorTest02 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int sum = 0;

		for( i=1 ; i <= 3 ; i++ /*������ i=i+1*/){
			sum += i;
		}

		System.out.println("i:" + i); //i++�ϰ� ���Ա� ������ ���ڵ��� �ٸ��� 4������
		System.out.println("sum:" + sum);
	}
}
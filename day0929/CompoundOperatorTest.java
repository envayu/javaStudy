class CompoundOperatorTest 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int sum = 0;

		sum += i; //i=1 sum=1
		
		i++; //i=2 -> 1+1 =2
		sum += i; //i=2 sum=3 ->(1+2)

		i++; //i=3 -> 2+1
		sum += i; // i=3 sum=6 -> 3+(2+1)


		System.out.println("i:" + i);
		System.out.println("sum:" + sum);
	}
}

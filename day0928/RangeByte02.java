class RangeByte 
{
	public static void main(String[] args) 
	{
		//1byte은 8bit로 구성됨
		//1bit로 표현할 수 있는 수의 범위는 0,1 두가지
		//2bit가 있다면 00 / 01 / 10 / 11 총 4가지
		//1byte(8개의 bit)중에 맨 왼쪽에 있는 bit는 음수인지 양수인지 판별하는 부호 비트로 사용
		//나머지 7개의 비트로 숫자로 표현, 따라서 표현할 수 있는 범위가 다음과 같다
		//음수 2의 7제곱 부터 양수 2의 7제곱-1까지 표현가능
		//-128 ~ 127 까지 처리가능

		byte data; //변수이름이 data
		data = -128;
		System.out.println(data);
		data = (byte)(data - 1);				
		System.out.println(data);

	}
}


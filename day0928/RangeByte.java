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
		data = 127; //변수 data에 127이라는 숫자를 주입
		System.out.println(data); //127을 넣은 data를 출력
		data = (byte)(data + 1); //시동은 되지만 128이 나오지는 않음 -128이 나옴 밑에 주석을 보기
		System.out.println(data);

	}
}

/*
C:\javaStudy\day0928>java RangeByte
127
-128
바이트가 표현할 수 있는 숫자는 뫼비우스의 띠처럼 연결되어있음
125 126 127 -128 -127 -126 ... 이렇게 되는거
이런현상을 "OverFlow"가 발생했다고 함

반대의 경우 더 적은 -128보다 작은 경우는 "Under Flow"가 발생했다고함
*/
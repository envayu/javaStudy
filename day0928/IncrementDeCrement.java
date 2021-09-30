class  IncrementDeCrement
{
	public static void main(String[] args) 
	{
		int i = 5;
		int j = 5;
		i++;
		++j;
		System.out.println(i);
		System.out.println(j);

		System.out.println("--------------------------------------------");
		// a++와 a+1은다르다 a+1 자신이 변하지 않음 a++은 자신이 변함
		int a = 10;
		int b = 10;
		System.out.println(a+1); //11
		System.out.println(b++); //10
		System.out.println("--------------------------------------------");
		System.out.println(a); //10
		System.out.println(b); //11
		System.out.println("--------------------------------------------");
		
		// --감소 연산자 사용
		int n = 5;
		int m = 5;
		n--;
		--m;
		System.out.println(n);
		System.out.println(m);

		System.out.println("--------------------------------------------");
		i = 5;
		j = 5;
		a = ++i; //위에는 그냥 ++i 이렇게만 했음 여기서는 대입연산자랑 같이사용 두개의 명령어를 합쳐둔것,i=i+1하고 a에 그 값을 저장하라는 말
		b = j++; //b랑 j가 같다 그뒤에 j에 증감 해준것 그러므로 b = 5
		System.out.println("i:"+ i); //6
		System.out.println("j:"+ j); //6
		System.out.println("a:"+ a); //6
		System.out.println("b:"+ b); //5

/*
i = 5;
j = 5;
a = ++i; --> i=i+1하고 a에 그 값을 저장하라는 말 i는 6이된 후에 a에 저장했으니 a, i둘다 6
b = j++; --> j를 먼저 b에저장한 뒤에 j를 증감 그러므로 b는 j가 증가되기전에 대입했으니 5 j는 6

*/

		System.out.println("--------------------------------------------");

		i = 5;
		j = 5;
		int k = 5;
		System.out.println(++i); //6 증가하고 i
		System.out.println(j++); //5 j하고 증가
		System.out.println(k+1); //6 k에 더하기 1
		System.out.println(i); //6 위에 증가했으니까 6
		System.out.println(j); //6 위에 증가했으니까
		System.out.println(k); //5 그냥 숫자에 1 더한거니 5


	}
}



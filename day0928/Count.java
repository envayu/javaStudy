//연습)사용자한테 문자열을 입력받아 입력한 문자열에 소문자 'o'의 수를 파악하요 출력하는 프로그램을 작성해보기

import java.util.Scanner;
class Count  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String data;
		System.out.println("문자열을 입력하세요===>");
		data = sc.next();

		int cnt = 0;
		char ch;

		for(int i=0 ; i < data.length() ; i=i+1){
			ch = data.charAt(i);
			if (ch == 'o')
				cnt = cnt + 1;
		}
		System.out.println("소문자 o의 개수는" + cnt + "개 입니다");
	}
}

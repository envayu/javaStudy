//사용자한테 두개의 정수를 입력받아 그 중에 작은수를 찾아 출력하는 프로그램을
//삼항연산자를 이용해 작성


import java.util.Scanner;
class TreeMinTest{
      public static void main(String []args){
      Scanner sc = new Scanner(System.in);

	  int a,b;

	  System.out.print("첫번째 수를 알려주세요");
      a = sc.nextInt();
	  System.out.print("두번째 수를 알려주세요");
      b = sc.nextInt();

      System.out.print((a<b)?a:b); //a가b보다 작은가요? 작으면a,a가 크면b 

	  
	}
}

/*
int에 a,b,min; 을 사용했다면
min = (a<b)?a:b; 해주기

*/
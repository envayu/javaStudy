//사용자한테 두개의 정수를 입력받아 그 중에 큰수를 찾아 출력하는 프로그램작성

import java.util.Scanner;
class MaxTest{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int a, b, max;
      System.out.println("첫번째 수를 입력하시오===>");
      a = sc.nextInt();
      System.out.println("두번째 수를 입력하시오===>");
      b = sc.nextInt();
      if( a >= b )
         max = a;
      else
         max = b;
      System.out.println("큰수는 " + max + "입니다.");

   }
}
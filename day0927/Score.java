//사용자한테 두개의 정수를 입력받아 더하기, 빼기, 곱하기, 나누기 한 결과를 출력하는 프로그램을 작성하고, 저장하고, 컴파일, 실행 해 봅니다.

import java.util.Scanner;
class Score{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int number1,number2,더하기,빼기,곱하기,나누기;
      System.out.println("첫 번째 정수를 입력하세요");
      number1 = sc.nextInt();
      System.out.println("두 번째 정수를 입력하세요");
      number2 = sc.nextInt();
      더하기 = number1 + number2;
      빼기 = number1 - number2;
      곱하기 = number1 * number2;
      나누기 = number1 / number2;
      System.out.println(" ** 결과 출력 **");
      System.out.println("더하기:" + 더하기);
      System.out.println("빼기:" + 빼기);
      System.out.println("곱하기:" + 곱하기);
      System.out.println("나누기:" + 나누기);
   }
}
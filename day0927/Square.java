//사용자한테 가로길이와 세로길이를 입력받아 사각형의 면적을 계산하여 출력하는 프로그램을 작성, 저장, 컴파일, 실행
// 가로 세로 면적은 정수로 처리

import java.util.Scanner;
class Square{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      String name;
      int 가로길이, 세로길이, 면적;
      System.out.println("가로길이를 입력하세요");
      가로길이 = sc.nextInt();
      System.out.println("세로길이를 입력하세요");
      세로길이 = sc.nextInt();
      면적 = 가로길이 * 세로길이;
      System.out.println(" ** 결과 출력 **");
      System.out.println("면적:" + 면적);

   }
}
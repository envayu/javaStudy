//연습)정부에서는 매년 40세이상인 사람들에게 무료 암검진을 실시하고 있습니다
//이름과 나이를 입력받아 무료 암 검진 대상자 여부를 판별하여
//결과를 출력하는 프로그램을 작성,저장, 컴파일, 실행



import java.util.Scanner;
class FreeCheck{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      String name;
      int age;
      System.out.println("이름을 입력하시오===>");
      name = sc.next();
      System.out.println("나이를 입력하시오===>");
      age = sc.nextInt();
      if( age >= 40 )
        System.out.println(name+"님은 무료검진 대상입니다.");
      else
        System.out.println(name+"님은 무료검진 대상이 아닙니다.");

   }
}
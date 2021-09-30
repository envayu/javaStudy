//이름과 출생연도를 입력받아 나이를 계산하고 나이가 40살이상인지 판별하여
//무료암검진 대상자인지 결과를 출력하도록 프로그램을 수정해보기
//올해는 2021년


import java.util.Scanner;
import java.util.Date;
class CancerTest03{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      Date today = new Date();
      String name;
      int year, age;
      int thisYear;
      thisYear = today.getYear()+1900;
      System.out.println("이름을 입력하시오===>");
      name = sc.next();
      System.out.println("출생연도를 입력하시오===>");
      year = sc.nextInt();

      age = thisYear - year;
      System.out.println("올해는 " + thisYear + "년도입니다.");

      if( age >= 40 )
        System.out.println(name+"님은 올해 " + age + "세 입니다. 무료검진 대상입니다.");
      else
        System.out.println(name+"님은 올해 " + age + "세 입니다. 무료검진 대상이 아닙니다.");

   }
}
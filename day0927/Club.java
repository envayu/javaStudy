//연습)홍대에 있는 쌍용클럽에서는 물관리를 위하여 이름, 나이, 키를 입력받아 입장제한을 하고있다
//나이가 20세 이상이고 키는 160이하이면 "입장가능" 그렇지 않으면 "입장불가능"을 
//출력하는 프로그램을 작성, 저장, 컴파일, 실행

import java.util.Scanner;
class Club{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      String name;
      int age, height;
      System.out.println("이름은 무엇인가요?");
      name = sc.next();
      System.out.println("몇 살 인가요?");
      age = sc.nextInt();
      System.out.println("키가 얼마 인가요?");
      height = sc.nextInt();
     if( age >= 20 && height <= 160 )
        System.out.println(name+"님은 입장가능");
      else
        System.out.println(name+"님은 입장불가능");

   }
}
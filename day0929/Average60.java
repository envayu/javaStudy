//연습)학생의 이름, 국어, 영어, 수학 성적을 입력받아 총점과 평균을 구하고 평균이 60점 이상이면
//"합격" 아니면 "불합격"을 출력하는 프로그램을 작성(단, 평균은 실수값으로 처리합니다)

import java.util.Scanner;
class Average60{
      public static void main(String []args){
      Scanner sc = new Scanner(System.in);

      String name;
      int kor,eng,math,tot;
      double avg;

      System.out.println("학생 이름은 무엇인가요?");
      name = sc.next();
      System.out.println("국어 점수는 몇점인가요?");
      kor = sc.nextInt();
      System.out.println("영어 점수는 몇점인가요?");
      eng = sc.nextInt();
      System.out.println("수학 점수는 몇점인가요?");
      math = sc.nextInt();

      tot = kor + eng + math;
      avg = tot / 3.0; // 평균을 정수가 아닌실수로 지정했기 때문에 (double)tot 하던가 3말고 3.0으로 나눠주는게 좋다

	  System.out.println("평균 :" +avg);
	  if (avg >= 60) 
		System.out.println(name+"은 합격 입니다.");
		else 
		System.out.println(name+"은 불합격 입니다.");
		
   }
}
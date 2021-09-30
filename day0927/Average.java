//어떤 학생이 이번 학기에 컴퓨터 개론, C언어 프로그래밍,영어, 일반 수학을 수강 신청하였다고 하자. 
//각 과목의 점수를 입력하면 그 학생의 이번 학기 평균 점수를 계산하는 프로그램을 작성하라


import java.util.Scanner;
class Average{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int com,pro,math,eng,tot,avg;
      System.out.println("컴퓨터개론 점수는 몇점인가요?");
      com = sc.nextInt();
      System.out.println("C언어프로그래밍 점수는 몇점인가요?");
      pro = sc.nextInt();
      System.out.println("영어 점수는 몇점인가요?");
      eng = sc.nextInt();
      System.out.println("수학 점수는 몇점인가요?");
      math = sc.nextInt();
      tot = com + pro+ eng + math;
      avg = tot / 4;
      System.out.println("  결과 ===> ");
      System.out.println("평균:" + avg);
   }
}
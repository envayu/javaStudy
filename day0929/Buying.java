//연습) 구매수량이 10개이상이거나 구매금액이 20000원이상이면 구매금액의 10%를 할인하려고 합니다.
//상품명, 단가, 구매수량을 입력받아 구매금액을 계산하고 고객이 지급해야하는 금액을 출력

import java.util.Scanner;
class Buying{
      public static void main(String []args){
      Scanner sc = new Scanner(System.in);

      String product;
      int price, amount,tot;
	  
	  System.out.println("구매품목을 알려주세요");
      product = sc.next();
	  System.out.println("단가를 알려주세요");
      price = sc.nextInt();
	  System.out.println("구매수량을 알려주세요");
      amount = sc.nextInt();
	  tot = price * amount;

	  if (amount >= 10 || tot >= 20000)
		  System.out.println("금액은"+tot*0.9+"원 입니다." );
	  else
		  System.out.println("금액은"+tot+"원 입니다." );


	  }
}

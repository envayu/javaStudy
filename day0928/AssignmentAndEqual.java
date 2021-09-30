//자바프로그램에서는 대입(assign)연산자와 같은지 비교(Equal)의 연산자는 다릅니다.
// = 은 대입을 위한 연산자 == 은 같은지 비교하는 연산자입니다.

class  AssignmentAndEqual
{
	public static void main(String[] args) 
	{
		int age;
		boolean flag;
		//age에 20이라는 값을 대입하고싶을때 age = 20이렇게
		age = 20;
		//age의 값이 20과 같은지 비교하여 논리값을 flag에 대입
		flag = age == 20;
		
		System.out.println(age);
		System.out.println(flag);
	}
}

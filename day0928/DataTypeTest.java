class DataTypeTest
{
	public static void main(String[] args) 
	{
		//byte age;
		//short age;
		int age;
		//long age;
		age = 27;
		System.out.println("가나다의 나이:" + age + "살 입니다.");


		//double height;
		float height;
		//height = 167.8f;
		height = (float)167.8;
		System.out.println("가나다의 키:" +height+"입니다.");
/* #오류
C:\javaStudy\day0928>javac DataTypeTest.java
DataTypeTest.java:15: error: incompatible types: possible lossy conversion from double to float
                height = 167.8;
                         ^
						 >데이터가 손실될 것 같다 내가 보호해 줄 수 없어
						 >167.8은 더블이 더 크니까 거기에 넣어 굳이 플롯에 쓰고싶으면 키 뒤에 f를 붙여!
						 >또는 앞에 (float)붙여서 바이트 크기를 줄여->자료형변환을 하려 저장하는것
1 error
*/

		char gender;
		gender = 'F'; // 한 글자는 작은 따옴표
		//gender = "F"; 쌍 따옴표로 묶으면 문자열로 취급하기 때문에 char에 저장 불가능
		System.out.println("가나다의 성별은:"+gender);
/* #오류
C:\javaStudy\day0928>javac DataTypeTest.java
DataTypeTest.java:23: error: incompatible types: String cannot be converted to char
                gender = "F";
                         ^
1 error
*/
        
		boolean isVaccine;
		isVaccine = true;
		System.out.println("가나다의 1차백신 접종여부:" + isVaccine);
	}
}


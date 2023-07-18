package class_;

public class Variable {
	
	static short a= 78; // static이 붙었으므로 클래스에서 가져다 쓸 수 있다
	int b; //필드, 선언 즉시 초기화됨 
	static double c ;
	
	public static void main(String[] args) {
		// local var 
		short a = 65; // 0100 0001 (8bit짜리 숫자)
			// short는 16bit (2 byte)
		int b = 65;
			// int는 32bit (4 byte)
		
		System.out.println("static a = "+Variable.a);
		System.out.println("지역변수 a = "+a);
		System.out.println("지역변수 b = "+b);
	//	System.out.println(Variable.b);
		System.out.println(c);
		
		Variable v = new Variable(); // 클래스 객체를 생성했다.
		System.out.println("객체 v = "+v); 
		// 주소값이 출력된다. 
		
	}
}

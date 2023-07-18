package class_;

public class Method01 {

	public static void disp() {
		System.out.println("바 보 . ㅋ ㅋ ");
		
	}
	
	public void output() {
		
		System.out.println("멍 청 이 . ㅋ ㅋ ");
	}
	public static void main(String[] args) {
		
		disp();
		System.out.println();
		Method01.disp(); // disp();와 똑같이 수행된다. 
		//static이라면 ... 그냥 함수명만 써 주는 게 좋을지도?
		
		//static 남발은 메모리를 많이 먹기 때문에 지양해야 함
		
		/*
		output(); // static이 아니기 때문에 호출되지 않는다.
		Method01.output(); // 얘도 안 된다. static이 아니기 때문이다.
		
		*/
		
		Method01 met = new Method01();
		met.output();
		
		System.out.println();
		
		new Method01().output(); // 이게 된다고? 암튼 일회용이다. 
		met.output(); // 또 쓸 수 있다.
	}
	
}

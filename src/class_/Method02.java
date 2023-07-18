package class_;

public class Method02 {
	
	public void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	public void mul(int a, int b) {
		System.out.println(b*a);
	}
	
	public void div(int a, int b) {
		float a2 = (float) a;
		float b2 = (float) b;
		System.out.println(String.format("%.3f", a2/b2));
		// or
		// System.out.println(String.format("%.2f", (double)a/b));
		// 강제 형변환 (Cast 연산)
	}
	public void div(int a, int b, short c) {
		float a2 = (float) a;
		float b2 = (float) b;
		System.out.println(String.format("%.3f", a2/b2));
		// or
		// System.out.println(String.format("%.2f", (double)a/b));
		// 강제 형변환 (Cast 연산)
	}
	
	public void sub(int a, int b) {
		System.out.println(a-b);
	}
	/*
	public int sum(int a, int b, short c) {
		
		short bit = c;
		int result;
		
		if (c==1) {
			
			result = a+b;
		}
		else {
			result = 0;
			
		}
		
		return result;
	}
	*/
		
	public static void main(String[] args) {
		
		Method02 m = new Method02();
		System.out.println();
	//	System.out.println(m.sum(25, 36, (short) 1));
		m.sum(25, 36);
		m.div(25, 36);
		m.mul(25, 36);
		m.sub(25, 36);
	}	

}

package class_;

import java.util.Scanner;
import java.util.StringTokenizer;

class Person {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setData(int age, String name) {
		
		this.age = age;
		this.name = name;
		
	} // setter를 한번에 합친 형태.
	
	public String getData() {
		
		return name+" "+age;
	}
	
	public void distinc(String name, int age) {
		
		String dist;
		if(age<20)
			dist = "미성년자";
	
		else
			dist = "성인";
		System.out.println(name+"은 "+dist);
	}
	/*
	public void distinc(int age, String name, short go) {
		
		String dist;
		if(age<20)
			dist = "미성년자";
	
		else
			dist = "성인";
		System.out.println(name+"은 "+dist);
	}
	*/
}

public class PersonMain {
	
	public static void main(String[] args) {
		/*
		Person aa = new Person();
		aa.setAge(25);
		aa.setName("홍길동");
		
		System.out.println("객체 aa =>> "+aa);
		System.out.println(aa.getName()+"\t"+aa.getAge());
		
		Person bb;
		bb = new Person();
		
		bb.setAge(18);
		bb.setName("김가영");
		bb.distinc(bb.getName(),bb.getAge());
		*/
		
		/*
		Scanner s = new Scanner(System.in);
		Person dd = new Person();
		System.out.print("이름: ");
		dd.setName(s.nextLine());
		System.out.print("나이: ");
		dd.setAge(s.nextInt());
		dd.distinc(dd.getName(), dd.getAge());
		
		System.out.println("===============");
		
		Scanner e = new Scanner(System.in);
		Person ee = new Person();
		System.out.print("이름: ");
		String name = e.nextLine();
		System.out.print("나이: ");
		int age = e.nextInt();
		ee.setData(age, name);
		ee.distinc(ee.getName(), ee.getAge());
		
		// Scanner를 다시 쓸 수는 없을까?
		*/
		System.out.println("===============");
		int age;
		String name; 
		
		Scanner q = new Scanner(System.in);
		Person ff = new Person();
		System.out.print("이름: ");
		name = q.nextLine();
		System.out.print("나이: ");
		age = q.nextInt();
		ff.setData(age, name);
		String result = ff.getData();
		StringTokenizer cut = new StringTokenizer(result, " ");
		
		System.out.println("===============");
	//	System.out.println(cut.nextToken());
	//	System.out.println(cut.nextToken());
		ff.distinc(cut.nextToken(), Integer.parseInt(cut.nextToken()));
		
	} // 버그수집가 오늘도 버그 수집했다 .... 
	
}


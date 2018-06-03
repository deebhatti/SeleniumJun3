package demo;

public class D {
	
	
	public static void main(String[] args) {
		
		String name = "    Deepinder   ";
		String day = "Monday";
		A a = new A();
		B b = new B();
		C c = new C();
		
		a.day1();
		//b.day2();
		c.day3();
		System.out.println(name.trim()+day);
	}

}

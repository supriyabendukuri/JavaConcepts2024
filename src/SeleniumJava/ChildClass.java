package SeleniumJava;

public class ChildClass extends ParentClass{

	
	public void m1() {
		
	}

	@Override
	public void m1(String a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {

		
		ParentClass pc= new ParentClass();
		pc.m1(10);
		pc.m1("suppu");
		pc.m2();
		
	}

}

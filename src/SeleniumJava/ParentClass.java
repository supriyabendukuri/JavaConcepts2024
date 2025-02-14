package SeleniumJava;

public class ParentClass {
	
	public void m1(int i) {
		System.out.println(i);
	}

	public void m1(String a) {
		System.out.println(a);
	}
	
	public void m2() {
		System.out.println("m2");

	}
	
	public static void main(String[] args) {
   
		ParentClass pc= new ParentClass();
		pc.m1(11);
		pc.m1("supriya");
		
		
	}

}

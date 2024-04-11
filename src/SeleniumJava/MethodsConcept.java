package SeleniumJava;

public class MethodsConcept {
	
	public  void  m1() {
		String s= "Bendukuri";
 
		System.out.println(s);
	}
	
	public  void m2() {
		int a=10;
		int b= 20;
		int c =a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		MethodsConcept object =new MethodsConcept();
		object.m1();
		object.m2();
	}

}

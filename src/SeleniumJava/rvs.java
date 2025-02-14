package SeleniumJava;

public class rvs {

	public static void main(String[] args) {

//		String s1= "suppu";
//		String s2= "";
//		char ch;
//		
//		for(int i=0; i<s1.length(); i++) {
//			ch=s1.charAt(i);
//			s2=ch+s2;
//		}
//		
//		System.out.println(s2);
		
		String name = "supriya";
		String reverseName = "";
		
		
		for (int i=-1; i>=name.length()-1; i--) {
			reverseName += name.charAt(i);
			 
		}
		System.out.println(reverseName);
	}

}

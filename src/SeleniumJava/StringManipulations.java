package SeleniumJava;

public class StringManipulations {
	
	public static void main(String[] args) {
	  
		String str= "Bendukuri Supriya";
		
	
		//System.out.println(str.length());
		int len=	str.length();
		System.out.println(len);
		
		
		char word =str.charAt(10);
		System.out.println(word);
		
		int ind =str.indexOf("i");
		System.out.println(ind);
		
		
		System.out.println(str.trim());
		
		
		System.out.println(str.replace("B", "M"));
		
		
		System.out.println(str.toLowerCase());
		
	}
}

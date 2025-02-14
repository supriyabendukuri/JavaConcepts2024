package SeleniumJava;


public class ReverseString {

	public static void main(String[] args) {

		 String s1 = "Bendukuri Supriya";
		 String s2= "";
		 char ch;
		 
		 for(int i=0; i < s1.length(); i++) {
			 
			 ch=s1.charAt(i);
			 s2=ch+s2;

	}

		 System.out.println("General string" + " "+ s1);
		 System.out.println("Reverse string" + " "+ s2);

}
}
package SeleniumJava;

public class CrossbrowserLogic {
	
	public static void main(String[] args) {
		
		String browserName = "fireFox";
		
		if (browserName.trim().equalsIgnoreCase("Chrome")) {
			System.out.println("Launch chrome browser");
			
		}
		else {
			if (browserName.trim().equalsIgnoreCase("firefox")) {
				System.out.println("Launch firefox browser");
				
		}
			
			else {
				if (browserName.trim().equalsIgnoreCase("edge")) {
					System.out.println("Launch edge browser");
					
			}
				else {
					System.out.println("invalid browser name");
				}
		
	}
		}
}
}

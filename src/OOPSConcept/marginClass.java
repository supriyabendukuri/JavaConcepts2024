package OOPSConcept;

public abstract class marginClass implements Car {
	
	
	@Override
	public void engine() {
		System.out.println("MaruthiSuzuki engine");
	}

	@Override
	public void stearing() {
		System.out.println("MaruthiSuzuki stearing");		
	}

	@Override
	public abstract void door();

	@Override
	public abstract void seat();
	
}

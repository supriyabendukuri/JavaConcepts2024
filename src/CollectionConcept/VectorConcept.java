package CollectionConcept;

import java.util.Vector;

public class VectorConcept {

	public static void main(String[] args) {
		
			Vector<String> v1 = new Vector<>();
			v1.add("Supriya");
			v1.add("bendukuri");
			v1.add("Supriya");
			v1.add("bendukuri");
			v1.add("Supriya");
			v1.add("bendukuri");
			v1.add("Supriya");
			v1.add("bendukuri");
			v1.add("Supriya");
			v1.add("bendukuri");
			v1.add("Supriya");
			v1.add("bendukuri");
			v1.add("Supriya");
			v1.add("bendukuri");
			
			System.out.println(v1);
			System.out.println(v1.capacity());
			System.err.println(v1.size());
			
			Vector<String> v2= new Vector<>();
			v2.add("h1");
			v2.add("h2");
			v2.add("h1");
		
			
			v1.set(5, "Ram");
			System.out.println(v1);
			
			v1.remove(6);
			System.out.println(v1);
			//creation of list
			//add
			//update
			//get
			//remove
			//verify
			
			System.out.println(v1.get(10));
			
			v1.addAll(v2);
			System.out.println(v1);
			System.out.println(v1.containsAll(v2));
			System.out.println(v1.contains("Ram"));


	}

}

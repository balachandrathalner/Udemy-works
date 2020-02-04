package Collection;

import java.util.ArrayList;

public class ArrayListSolve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a=new ArrayList<String>();
		
		a.add("balu");
		a.add("ramanna");
		a.add("huchhappa");
		
		System.out.println(a);
		a.add(0,"uuu");
		
		System.out.println(a);
System.out.println(a.get(3));

		System.out.println(a.contains("balu"));
		
		System.out.println(a.indexOf("baluj"));

		a.remove("balu");
		System.out.println(a);
		
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		a.add("ramanna");
		System.out.println(a);
	}

}

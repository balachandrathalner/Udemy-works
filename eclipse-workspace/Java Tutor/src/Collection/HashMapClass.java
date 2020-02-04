package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {


		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		
		hm.put(0, "jhdgj");
		hm.put(1,"fkdj");
		hm.put(2, "kdf");
		
		System.out.println(hm);
		
		//hm.remove(1);
		//System.out.println(hm);
			
		
		Set s=hm.entrySet();
		
		Iterator it=s.iterator();
		
		while(it.hasNext()) {
			
			Map.Entry e=(Map.Entry)it.next();
			
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			
		
		
	}

}

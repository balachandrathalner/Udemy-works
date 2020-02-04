package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetclass {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();

		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");

		System.out.println(hs);
		hs.add("INDIA");
		hs.add("He");
		hs.add("SHE");

		System.out.println(hs);

		// hs.remove("UK");

		// System.out.println(hs);

		System.out.println(hs.isEmpty());
		System.out.println(hs.size());

		Iterator<String> it = hs.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

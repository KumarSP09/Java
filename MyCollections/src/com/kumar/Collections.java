package com.kumar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> ls = new ArrayList<String>();
		
		ls.add("Kumar");
		ls.add("Poojary");
		ls.add("505");
		
		Iterator It = ls.iterator();
		
		while (It.hasNext())
		{
			System.out.println(It.next());
		}
		
		for (String i:ls) {
			System.out.println(i);
		}
		
		Set hs = new HashSet();
		
		hs.add("Kumar");
		hs.add("Kumar");
		hs.add("Poojary");
		hs.add("505");
		
		Iterator ihs = hs.iterator();
		while(ihs.hasNext()) {
			System.out.println(ihs.next());
		}
		
		Map hm = new HashMap();
		hm.put(1, "Kumar");
		hm.put(2, "Kumar");
		hm.put(3, "Poojary");
		hm.put(4, "505");
		
		Iterator ihm = hm.keySet().iterator();
		
		while (ihm.hasNext()) {
			System.out.println(hm.get(ihm.next()) );
		}
	}

}

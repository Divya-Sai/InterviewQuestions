package interviewquesstions;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetAndHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//HashSet, LinkedHashSet,TreeSet- Duplicates are not allowed and
		//Insertion order is not preserved
		Set<Object> S = new HashSet<>();
		S.add("DIvya");
		S.add("Software");
		S.add("Software");
		S.add("Collect");
		S.add("Apple");
		S.add(0);
		
		System.out.println("Set using HashSet :"+S);
		
		HashSet<Object> w = new LinkedHashSet<>();
		w.add("a");
		w.add("m");
		w.add("m");
		w.add("i");
		w.add("o");
		w.add("u");
		
		System.out.println("LinkedHashSet using Hashset :"+w);
		
		SortedSet<Object> ss = new TreeSet<>();
		NavigableSet<Object> ns = new TreeSet<>();
		
		ss.add("Lyreco");
		ss.add("Friday");
		ss.add("NoData");
		ss.add("Lyreco");
		ss.add("Friday");
		ss.add("NoData");
		
		System.out.println("TreeSet class with SortedSet :"+ss);
		
		System.out.println("================");
		
		ns.add("Shift");
		ns.add("Enter");
		ns.add("space");
		ns.add("Tab");
		ns.add("Del");
		ns.add("Del");
		
		System.out.println("TreeSet class with NavigableSet :"+ns);

			
	}

}

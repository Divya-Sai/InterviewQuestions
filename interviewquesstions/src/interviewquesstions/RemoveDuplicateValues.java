package interviewquesstions;

import java.util.ArrayList;
import java.util.LinkedHashSet;


public class RemoveDuplicateValues {

	//Java Program: To find duplicates between two lists.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> AL = new ArrayList<>();
		AL.add("Mon");
		AL.add("Tues");
		AL.add("Mon");
		AL.add("Wednes");
		
		System.out.println("List with duplicate values :"+ AL);
		
		LinkedHashSet<Object> lhs = new LinkedHashSet<>(AL);
		System.out.println("List without duplicate values :"+ lhs);
		
		
	}

}

package interviewquesstions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ArrayandArrayList {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//array
		int arr[] = new int[3];
		arr[0]= 1;
		arr[1]=2;
		arr[2]=5;
		//arr[4]=9;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

		//ArrayList
		//List<Object> l =new ArrayList<>();
		List<Object> l1 = new LinkedList<>();
		List<Object> l2 = new Stack<>();
		List<Object> L3 = new Vector<>();
		
		//ArrayList - Duplicates are allowed 
		//Insertion order is preserved
		ArrayList<Object> a = new ArrayList<>();
		System.out.println("Intial Size of a ArrayList :");
		a.add("Divya");
		a.add("Sai");
		a.add("Roshita");
		a.add("Divya");

		System.out.println(a);
		
		a.add(2, "Srinivasa");
		System.out.println(a);
		a.remove("Srinivasa");
		System.out.println(a);
		a.retainAll(a);
		System.out.println(a);
		
		
		
		//LinkedList - Duplicates are allowed 
		//Insertion order is preserved
		System.out.println("=======LinkedList=========");
		System.out.println("Intial Size of a LinkedList :"+l1.size());
		l1.add(0, "Bugatha");
		l1.add(1, "Divya");
		l1.add(2, "Divya");
		
		
		System.out.println(l1);
		
		//Stack -- Duplicates are allowed 
		//Insertion order is preserved
		System.out.println("==========Stack=============");
		System.out.println("Intial Size of a Stack :"+l2.size());
		l2.add(1);
		l2.add(1);
		l2.add(15);
		l2.add(19);
		l2.add(10);
		l2.add(146);
		
		System.out.println(l2);
		System.out.println(" Size of a Stack :"+l2.size());
		
		//Vector -- Duplicates are allowed 
		//Insertion order is preserved
		System.out.println("==========Vector=============");
		
		System.out.println("Intial Size of a vector :"+L3.size());
		L3.add(1);
		L3.add(1);
		L3.add(19);
		L3.add(10);
		L3.add(146);
		
		System.out.println(L3);


	}

}

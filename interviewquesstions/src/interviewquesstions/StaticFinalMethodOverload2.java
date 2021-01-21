package interviewquesstions;

public class StaticFinalMethodOverload2 extends StaticFinalMethodOverload1{
	
	public static void m1() {
		System.out.println("m1 in StaticFinalMethodOverload2");
	}
	
	public static void main(String args[]) {
		StaticFinalMethodOverload1 l1 =new StaticFinalMethodOverload1();
		l1.m1();
	}

}

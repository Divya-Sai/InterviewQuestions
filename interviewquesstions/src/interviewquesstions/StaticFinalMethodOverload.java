package interviewquesstions;

public class StaticFinalMethodOverload {
	
	public static void staticmethod() {
		System.out.println("This is static method with no argument");
	}
	public static void staticmethod(int i) {
		System.out.println("This is static method with 1 argument");
	}
	
	public static final void finalmethod() {
		System.out.println("This is final method with no argument");
	}
	public static void finalmethod(int i) {
		System.out.println("This is final method with 1 argument");
	}

	public static void main(String args[]) {
		staticmethod();
		staticmethod(0);
		finalmethod();
		finalmethod(0);
	}
}

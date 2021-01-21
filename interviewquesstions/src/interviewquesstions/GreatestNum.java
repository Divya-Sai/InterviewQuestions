package interviewquesstions;

public class GreatestNum {
	
	
	public GreatestNum() {
		
	}
	public static void greatestNm(int a,int b,int c) {
		
		if (a>=b && a>=c) {
			System.out.println(a + " is the largest number" );
		}
		else if (b>=a && b>=c) {
			System.out.println(b + " is the largest number" );
		}
		else {
			System.out.println(c + " is the largest number");
		}
		
		
	}

	public static void main(String args[]) {
		GreatestNum.greatestNm(10,15,7);
		GreatestNum.greatestNm(1,11,79);
		GreatestNum.greatestNm(100,99,7);
		
		String S = "divyaa is a mummy";
		System.out.println(S.substring(0, 3));
		System.out.println(S.replace(" ", "-"));
		
		
		
		
	
	}
	
	public static void main(int args[]) {
		GreatestNum.greatestNm(10,15,7);
		GreatestNum.greatestNm(1,11,79);
		GreatestNum.greatestNm(100,99,7);
	}
}

package interviewquesstions;

public class BreakAndContinue {
	
	public class Hello{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This is  break statement");
		for(int i=1;i<=5;i++)
		{
			if(i==4) break;
			System.out.println(i);
		
			
		}
		
		System.out.println("This is  continue statement");
		for(int i=1;i<=5;i++)
		{
			if(i==1) continue;
			System.out.println(i);
			
		}

	}

}

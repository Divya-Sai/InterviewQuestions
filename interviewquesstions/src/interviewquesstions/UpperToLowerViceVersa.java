package interviewquesstions;

public class UpperToLowerViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer S = new StringBuffer("Unicorn Compact HighChair");
		System.out.println("Length of a String is :" +S.length());
		 // Conversion using predefined methods 
        for (int i=0; i<S.length(); i++) 
        { 
            Character c = S.charAt(i); 
            if (Character.isLowerCase(c)) 
                S.replace(i, i+1, Character.toUpperCase(c)+""); 
            else
                S.replace(i, i+1, Character.toLowerCase(c)+""); 
             
        }
        System.out.println(S);

	}

}

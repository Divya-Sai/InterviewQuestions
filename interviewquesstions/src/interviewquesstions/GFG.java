package interviewquesstions;

public class GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci(10);



	}

	static void Fibonacci(int i) {
		int a =0;
		int b =1;

		int counter =0;

		while (counter < i) {

			System.out.println(a +" ");//0

			int c =a+b;//1
			a=b;//1
			b=c;
			//counter =counter+1;
			//System.out.println();


		}


	}

}

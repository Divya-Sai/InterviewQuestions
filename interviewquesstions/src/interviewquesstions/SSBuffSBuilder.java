package interviewquesstions;

public class SSBuffSBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1=new String("hello");
		StringBuffer s2=new StringBuffer();
		StringBuffer sb2=new StringBuffer(29);
		StringBuffer sb3=new StringBuffer("Hello");
		StringBuilder s3= new StringBuilder();
		

		System.out.println("StringBuffer intial capacity is "+s2.capacity());
		s2.append("Helo");
		s2.append("ring");
		s2.append("remainder");
		System.out.println(s2);
		System.out.println("StringBuffer  capacity after adding  "+s2.capacity());
		System.out.println(sb2.capacity());
		System.out.println(sb3.capacity());
		System.out.println(sb3.reverse());
		sb3.setLength(10);
		System.out.println(sb3.length());
	}

}

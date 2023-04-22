package Sting;

public class String3 {

	public static void main(String[] args) {

		 String S1=new String("Sinthu");
		 String S2=new String("Sinthu");
		 
	System.out.println(System.identityHashCode(S1));
	System.out.println(System.identityHashCode(S2));
	
	StringBuffer b1=new StringBuffer();
	StringBuffer b2=new StringBuffer();
	
	StringBuffer append=b1.append(b2);
	System.out.println(append ); 
	System.out.println(System.identityHashCode(append));	
		
		
	}
	

}

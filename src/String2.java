
public class String2 {

	public static void main(String[] args) {
    String S1="Sinthu";
    String S2="Sinthu";
    System.out.println(System.identityHashCode(S1));
    System.out.println(System.identityHashCode(S2));
    
    String concat=S1.concat(S2);
    System.out.println(System.identityHashCode(concat));
	}

}

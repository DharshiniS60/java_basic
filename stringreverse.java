package dailypractise;
import java.util.*;

public class stringreverse {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter");
	String input=sc.nextLine();
	
	String reversed="";
	for(int i=input.length()-1;i>=0;i--) {
		reversed+=input.charAt(i);
	}
	System.out.println("revrsed"+reversed);
}
}


 package dailypractise;
import java.util.*;
public class Stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String input=sc.nextLine();
		String original=input;
		String reversed="";
		for(int i=input.length()-1;i>=0;i--) {
			reversed+=input.charAt(i);
		}
		if(reversed.equals(input)) {
		System.out.println("reversed matches "+reversed);

	}
	else {
		System.out.println("reversed didnt "+reversed);

	}
	}
}

	
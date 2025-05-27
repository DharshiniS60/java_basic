package dailypractise;
import java.util.*;
public class factorial {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int input=sc.nextInt();
		int i=1;
		int fact=1;
		while(i<=input) {
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
	}
}

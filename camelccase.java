package dailypractise;
import java.util.*;

public class camelccase {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enetr");
	String input=sc.nextLine().toLowerCase();
	String arr[]=input.split(" ");
	StringBuilder cc=new StringBuilder(arr[0]);
	for(int i=1;i<arr.length;i++)
		cc.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1));
	System.out.println(cc);
}
}
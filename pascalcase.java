package dailypractise;
import java.util.*;
public class pascalcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter");
		String input=sc.nextLine().toLowerCase();
		String arr[]=input.split(" ");
		StringBuilder pc=new StringBuilder();
		for(String word:arr) {
			pc.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));
		}
		System.out.println(pc);
	}

}

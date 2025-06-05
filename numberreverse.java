package dailypractise;
import java.util.*;
public class numberreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int input=sc.nextInt();
		int output=0;
		while(input!=0) {
			int reversed=input%10;
			output=output*10+reversed;
			input/=10;
		}
		System.out.println(output);
	}

}

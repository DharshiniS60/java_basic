package dailypractise;
import java.util.*;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter");
		int input=sc.nextInt();
		boolean isprime=true;
		if(input<=0) {
			isprime=false;
		}
		else {
			for(int i=2;i<Math.sqrt(input);i++) {
				if(input%2==0) {
					isprime=false;
				}
				
		}
		if(isprime==true) {
			System.out.println("yes");
			
		}
		else {
			System.out.println("no");
		}
		}
	}

}

package dailypractise;
import java.util.*;

public class numberpalindrome {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		
	int a=sc.nextInt();
	int ori=a;
	int b=0;
	while(ori!=0) {
		int reversed=ori%10;
		b=b*10+reversed;
		ori/=10;
	}
	if(a==b) {
		System.out.println("yes"+b);
	}
	else {
		System.out.println("no"+b);
	}
		
	}
}

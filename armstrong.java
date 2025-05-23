package dailypractise;
import java.util.*;
public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		int original=number;
		int result = 0;
		int digit;
		while(number!=0) {
			digit=number%10;
			result+=Math.pow(digit, 3);
			number/=10;//153
		}
	    if(original==result) {
	    	System.out.println("the armstrong "+ result);
	    }
	    else {
	    	System.out.println("this is not armstrong "+ result);
	    }

	}

}

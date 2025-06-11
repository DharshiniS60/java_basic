package dailypractise;
import java.util.*;
public class stringrotation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("enter  the string");
		String string=sc.nextLine();
		System.out.println("enter the no. of position to be rotatted");
		int shift=sc.nextInt();
		String left=leftshift(string,shift);
		String right=rightshift(string,shift);
		System.out.println("leftshift  "+ left);
		System.out.println("rightshifft  "+right);
	}
	
	public static String leftshift(String str,int shifting) {
		int len=str.length();
		shifting=shifting%len;
		return(str.substring(shifting)+str.substring(0,shifting));
	}
	public static String rightshift(String str,int shifting) {
		int len=str.length();
		//shifting=shifting%len;
		return(str.substring(len-shifting)+str.substring(0,len-shifting));
	}
}

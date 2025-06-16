package dailypractise;
import java.util.*;
public class sumofdisits {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter");
		int input=sc.nextInt();
		int sum=0;
		while(input!=0) {
			sum+=input%10;
			input/=10;
		}
		System.out.println(sum);
	}
	

}

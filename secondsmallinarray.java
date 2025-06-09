package dailypractise;
import java.util.*;

public class secondsmallinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of element in an array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the elements ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println();
		System.out.println("elements of array");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		int smallest=Integer.MAX_VALUE;
		int secondsmallest=Integer.MAX_VALUE;
		for(int i=0;i<size;i++) {
			if(arr[i]<smallest) {
				secondsmallest=smallest;
				smallest=arr[i];
			}
			if(arr[i]<secondsmallest && arr[i]!=smallest) {
				secondsmallest=arr[i];
			}
			
		}System.out.println();
		System.out.println("secondsmallest");
		System.out.println(secondsmallest);
	}

}

package dailypractise;
import java.util.*;
public class secoondlargestinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of elemnts in the array");
		int size=sc.nextInt();
		System.out.println("enter the elements");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("the array");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]+" ");
		}
		int largest=Integer.MIN_VALUE;  // here largest =0 is Also possible but if negatiive occures then the problem arise
		
		int secondlargest=Integer.MIN_VALUE;
		for(int i=0;i<size;i++) {
			if(arr[i]>largest) {
				secondlargest=largest;
				largest=arr[i];
			}
			if(arr[i]>secondlargest && arr[i]!=largest) {
				secondlargest=arr[i];
			}
		}
		
		if(largest==Integer.MIN_VALUE) {
			System.out.println("unable");
		}
		else {
			System.out.println("largest"+largest);
			System.out.println("secondlargest"+secondlargest);
		}
	}

}

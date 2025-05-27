package dailypractise;
import java.util.*;
public class findaelementinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of character in an array");
		int size=sc.nextInt();
		System.out.println("enter the elements");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			}
		System.out.println("enter the elements to search");
		int search=sc.nextInt();
		System.out.println();
		System.out.println("array");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
			}
		System.out.println();
		boolean found= false;
		for(int i=0;i<size;i++) {
			if(search==arr[i]) {
				found=true;
				System.out.println("the element found "+search+ " is at position " +i);
			}
			
			
		}
		if(!found) {
			System.out.println("not found");
		}
	}

}

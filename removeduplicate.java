package dailypractise;
import java.util.*;
public class removeduplicate {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of elements");
		int size=sc.nextInt();
		System.out.println("enter the elements");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("with duplicates");
		System.out.println();
		for(int i=0;i<size;i++) {
			
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.println("array with duplicates sorted");
		System.out.println();
		for(int i=0;i<size;i++) {
		
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		int uniquearr[]=new int[size];
		int j=0;
		for(int i=0;i<size-1;i++) {
		
			if(arr[i]!=arr[i+1]) {
				uniquearr[j++]=arr[i];
			}
		}
		uniquearr[j++]=arr[size-1];
		System.out.println("without duplicates");
		System.out.println();
		for(int i=0;i<j;i++) {
			
			System.out.println(uniquearr[i]+" ");
			
		}
		System.out.println();
	}
	

}

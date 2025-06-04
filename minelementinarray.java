package dailypractise;
import java.util.*;

public class minelementinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of elemnts");
		int size=sc.nextInt();
		System.out.println("enter the elements");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
			
		}
		
		int max=0;
		for(int i=0;i<size;i++) {
			
			
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println();
		System.out.println(max);
		int min=max;
		for(int i=0;i<size;i++) {
			if(max>=arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(min);

	}

}

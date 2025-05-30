package dailypractise;
import java.util.*;

public class maxelementinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elemnts");
		
		int a=sc.nextInt();
		System.out.println("enter the elments");
		int arr[]=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++) {
			System.out.print(arr[i]+" ");
		}
		int max=0;
		for(int i=0;i<a;i++) {
			if(max<=arr[i]) {
				max=arr[i];
			}
		}
		System.out.println();
		System.out.println(max);
	}

}

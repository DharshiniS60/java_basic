package dailypractise;
import java.util.*;
public class mergetwosortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of elements in 1st array");
		int a=sc.nextInt();
		System.out.println("enter the array 1elements");
		int arr1[]=new int[a];
		for(int i=0;i<a;i++) {
			 arr1[i]=sc.nextInt();
			 
		}
		System.out.println("enete the no. of elements in array 2");
		int b=sc.nextInt();
		System.out.println();
		System.out.println("enter the elements of 2nd array");
		int arr2[]=new int[b];
		for(int i=0;i<b;i++) {
			arr2[i]=sc.nextInt();
		}
		System.out.println();
		System.out.println("1st array");
		for(int i=0;i<a;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("2nd array");
		for(int i=0;i<b;i++) {
			System.out.print(arr2[i]+" ");
		}
		
		System.out.println();
		
		int merge[]=new int[a+b];
		int i=0;int j=0; int k=0;
		while(i<a && j<b) {
			if(arr1[i]<arr2[j]) {
				merge[k++]=arr1[i++];
			}else {
				merge[k++]=arr2[j++];
			}
		}
		while(i<a) {
			merge[k++]=arr1[i++];
		}
		while(j<b) {
			merge[k++]=arr2[j++];
		}
		System.out.println("merged sort");
		for(int i1=0;i1<k;i1++) {
		System.out.print(merge[i1]+" ");
		}
	}

}

package dailypractise;
import java.util.*;
public class mergeofunsortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of elemnts in 1st array");
		int a=sc.nextInt();
		int arr1[]=new int[a];
		System.out.println("enter the elemnts");
		for(int i=0;i<a;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("enterr the no. of elemnts in array2");
		int b=sc.nextInt();
		int arr2[]=new int[b];
		System.out.println("enter the elemnts");
		for(int i=0;i<b;i++) {
			arr2[i]=sc.nextInt();
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println("afterr sort");
		System.out.println("array1 sorted");
		for(int i=0;i<a;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("array2 aorted");
		for(int i=0;i<b;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		int merge[]=new int[a+b];
		int i=0,j=0,k=0;
		while(i<a && j<b) {
			if(arr1[i]<arr2[j]) {
				merge[k++]=arr1[i++];
			}
			else {
				merge[k++]=arr2[j++];
			}
		}
		while(i<a) {
			merge[k++]=arr1[i++];
		}
		while(j<b)
		{
			merge[k++]=arr2[j++];
		}
		System.out.println();
		System.out.println("the soreted array");
		System.out.println();
		for(int x=0;x<merge.length;x++) {
			System.out.print(merge[x]+" ");
		}
		}

}

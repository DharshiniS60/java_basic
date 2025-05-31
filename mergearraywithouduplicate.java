package dailypractise;
import java.util.*;
public class mergearraywithouduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the no. of elemnts in array1");
		int a=sc.nextInt();
		System.out.println("enter the elemnts of 1st array");
		int arr1[]=new int[a];
		for(int i=0;i<a;i++) {
			arr1[i]=sc.nextInt();
			
		}
		System.out.println();
		System.out.println("enter the no. of elemnts in array2");
		int b=sc.nextInt();
		System.out.println("enter the elemnts of 2st array");
		int arr2[]=new int[b];
		for(int i=0;i<b;i++) {
			arr2[i]=sc.nextInt();
			
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println();
		System.out.println("sorted array1");
		for(int i=0;i<a;i++) {
			System.out.print(arr1[i]+" ");
			
		}
		System.out.println();
		System.out.println("sorted array2");
		for(int i=0;i<b;i++) {
			System.out.print(arr2[i]+" ");
			
		}
		int merge[]=new int[a+b];
		int i=0,j=0,k=0;
		while(i<a && j<b)
		{
			if(arr1[i]<arr2[j]) {
				merge[k++]=arr1[i++];
			}
			else {
				merge[k++]=arr2[j++];
			}
		}
		while(i<a)
		{
			merge[k++]=arr1[i++];
		}
		while(j<b) {
			merge[k++]=arr2[j++];
		}
		System.out.println();
		System.out.println("the merged array");
		for(int x=0;x<k;x++) {
			System.out.print(merge[x]+" ");
		}
		int unique[]=new int[k];
		int z=0;
		System.out.println();
		System.out.println("unique");
		for(int y=0;y<k-1;y++) {
			if(merge[y]!=merge[y+1]) {
				unique[z++]=merge[y];
			}
		}
		unique[z++]=merge[k-1];
		//System.out.print(Arrays.toString(unique));
		for(int m=0;m<z;m++) {
			System.out.print(unique[m]+" ");
		}
	}
	

}

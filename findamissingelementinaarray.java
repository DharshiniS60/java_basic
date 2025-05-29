package dailypractise;
import java.util.*;

public class findamissingelementinaarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter no. of elments to be in an array");
		int n=sc.nextInt();
		System.out.println("enter the element of array that should be n-1 in size");
		int arr[]=new int[n-1];
		for(int i=0;i<n-1;i++){
			arr[i]=sc.nextInt();
		}
		int result=missingvalue(arr,n);
		System.out.println("result " +result);

	}
	public static int missingvalue(int array[],int num) {
		int total=num*(num+1)/2;
		int arrsum=0;
		for(int a:array) {
			arrsum+=a;
		}
		return total-arrsum;
	}

}

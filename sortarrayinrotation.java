package dailypractise;
import java.util.*;
public class sortarrayinrotation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of elements in an array");
		int size=sc.nextInt();
		System.out.println("etnete the elements in ana array");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
		}	
		int waveresult[]=waveform(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	//arr[0]>=arr[1]<=arr[2]....	
	public static int[] waveform(int arr[]) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i+=2) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		return arr;
	}
}
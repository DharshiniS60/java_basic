package dailypractise;
import java.util.*;
public class anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string1");
		String input1=sc.nextLine();
		System.out.println("enter the string2");
		String input2=sc.nextLine();
		if (isanagram(input1,input2)) {
			System.out.println("anagram");
			
		}
		else {
			System.out.println("not anagram");
		}
		
	}
	public static boolean isanagram(String str1,String str2) {
		String string1=str1.replaceAll("//s","").toLowerCase();
		String string2=str2.replaceAll("//s","").toLowerCase();
		char arr1[]=string1.toCharArray();
		char arr2[]=string2.toCharArray();
		if(string1.length() != string2.length()) {
			return false;
		}
		else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			Arrays.equals(arr1,arr2);
			System.out.println();
			System.out.println("arr1");
			for(int i=0;i<arr1.length;i++) {
				System.out.print(arr1[i]);
			}
			System.out.println();
			System.out.println("arr2");
			for(int i=0;i<arr2.length;i++) {
				System.out.print(arr2[i]);
				
			}
			System.out.println();
			
			return true;
		}
	}
		
		}




package dailypractise;
import java.util.*;
public class stringrotationcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string1");
		String string1=sc.nextLine();
		System.out.println("enter string2");
		String string2=sc.nextLine();
		if(isrotation(string1,string2)) {
			
			System.out.println("match");
	
	}
		else {
			System.out.println("dont match");
			
		}
	
	}
	public static boolean isrotation(String str1,String str2) {
		if(str1.length() == str2.length() && !str1.isEmpty()) {
			String combine=str1+str1;
			System.out.println("combined  ==  " +combine);
			return combine.contains(str2);
		 
		
		}
		else {
			return false;
		}
	}
}

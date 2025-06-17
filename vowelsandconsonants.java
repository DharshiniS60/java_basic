package dailypractise;
import java.util.*;
public class vowelsandconsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String input=sc.nextLine();
		int vowel=0;
		int constant=0;
		for(char ch:input.toCharArray()) {
			if(ch =='a' || ch =='A' ||ch =='e' ||ch =='E' ||ch =='i' ||ch =='I' ||ch =='O' ||ch =='o' ||ch =='u' || ch=='U') {
				vowel+=1;
			}
			else {
				constant+=1;
			}
		}
		System.out.println(vowel +" are vowles");
		System.out.println(constant+ " are constant");
		
	}

}

package dailypractise;
import java.util.*;
public class balanacedparanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the paranathesis");
		String str=sc.nextLine();
		if(isbalanced(str)) {
			System.out.println("yes balanced " + str);
		}
		else {
			System.out.println(" this is imbalanced");
		}
		
		}
	public static boolean isbalanced(String s) {
		Stack<Character> stack=new Stack<>();
		Map<Character,Character> brackets=new HashMap<>();

		brackets.put(')','(' );
		brackets.put(']','[' );
		brackets.put('}','{' );
		for( char ch:s.toCharArray()) {
			if(ch=='(' || ch=='[' || ch=='{') {
				stack.push(ch);
			}
			else if(brackets.containsKey(ch) ) {
				if(stack.isEmpty() || stack.pop()!=brackets.get(ch)) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
		
	}
	
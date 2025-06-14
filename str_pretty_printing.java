package dailypractise;

public class str_pretty_printing {
	public static void main(String[] args) {
		float a=453.123459f;
		System.out.printf("formatted number is %.2f  ", a );
		System.out.println();
		//%placeholders
		System.out.printf("pie: %3f" ,Math.PI);
		System.out.println();
		System.out.printf("helllo my name is %s and i am %s ", "dhharshini" ,"cool");
		System.out.println();
		/*
		 few place holders are
		%c-character
		%d-decimal number(base 10)
		%f-float pointing-number
		%i-integer(base10)
		%o-octal number(base8)
		%s-string
		%u-unsigned decimal(integer)number
		%x-hexadecimal number(base10)
		%t-date/time
		%n-newline
		 */
		
	}
}

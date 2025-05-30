package dailypractise;
import java.util.*;
public class lcmandgcd {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the 1sst number");
	int num1=sc.nextInt();
	System.out.println("enter the 2nd number");
	int num2=sc.nextInt();
	int gcd=findgcd(num1,num2);
	int lcm=findlcm(num1,num2);
	System.out.println("gcd " + gcd);
	System.out.println("lcm " + lcm);
	}
	public static int findgcd(int a,int b) {
		while (b!=0) {
			int temp=b;         
			b=b%a;
			a=temp;
		}
		return a;
	}
	public static int findlcm(int a,int b) {
		return (a*b)/findgcd(a,b);
	}
		
	}


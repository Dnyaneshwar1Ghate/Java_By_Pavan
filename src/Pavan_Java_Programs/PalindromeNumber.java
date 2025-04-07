package Pavan_Java_Programs;

public class PalindromeNumber {

	public static void main(String[] args) {
	
		int num=12421;
		int rev=0;
		int original=num;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		
		
		if(original==rev)
		{
			System.out.println("this is palindrome");
			
		}else
		{
			System.out.println("this is not palindores");
		}
	}
}

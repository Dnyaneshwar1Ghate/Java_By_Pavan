package Pavan_Java_Programs;

public class PalindromeString {
	
	public static void main(String[] args) {
		String str="MADAM";
		String rev="";
		
		String original=str;
		/*
		 // 1. way
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(rev.equals(original))
		{
			System.out.println("Palindrome");
		}else
		{
			System.out.println("Not Palindrome");
		}
		*/
		
		
		//2 way 
		
		String sb=new StringBuilder(str).reverse().toString();
		System.out.println(sb.equals(original));
		
	}

}

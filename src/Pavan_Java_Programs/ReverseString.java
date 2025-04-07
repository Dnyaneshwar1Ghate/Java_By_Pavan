package Pavan_Java_Programs;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="Automation";
		String rev="";
		int len =str.length();
		/*
	//1.String concat
		
		
		for(int i =len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);
		
	        */
		
		
		/*//2.char array
		
		char[]a=str.toCharArray();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
			
		}
		System.out.println(rev);
		
		*/
		
		//3. stringBuffer class
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
	}
}  

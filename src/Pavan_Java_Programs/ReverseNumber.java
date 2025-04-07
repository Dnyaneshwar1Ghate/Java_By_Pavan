package Pavan_Java_Programs;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num =sc.nextInt();
		/*
//1. way
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;    //0+1234%=4    40+3=43        430+2=432  4320+1=4321
			num=num/10;                  //1234/10=123    123/10=12      12/10=1         1/10=0        
		}
		System.out.println(rev);
		
		*/
		
		/*
//2. way using StringBuffer clas
		StringBuffer rev1=new StringBuffer(String.valueOf(num));
		System.out.println(rev1.reverse());
		*/
		
//3. way using StringBuilder class
		
		StringBuilder sb=new StringBuilder();
		sb.append(num);
		System.out.println(sb.reverse());
		
		
		
		
		
		sc.close();
	}
}

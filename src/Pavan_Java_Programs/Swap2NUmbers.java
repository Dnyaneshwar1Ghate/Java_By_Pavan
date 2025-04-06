package Pavan_Java_Programs;

public class Swap2NUmbers {

	public static void main(String[] args) {
		
		int a=10;int b=20;
		System.out.println("Before Swap"+a+" "+b);
		
  //1. Logic 1 [third veriable]
		/*    	int temp=a;
		a=b;
		b=temp;
		System.out.println("after swaping"+a+" "+b);
	*/	
		
		
//2.Logic 2 ..Without using third veriable
		
	/*	a=a+b;   //10+20=30
		b=a-b;    //30-20=10
		a=a-b;    //30-10=20
		System.out.println("after swaping"+a+" "+b);*/
		
//3.Logic 3 using multiple op
	/*	a=a*b;   //10*20 =200
		b=a/b;  //200/20 =10
		a=a/b;  //200/10 =20
		System.out.println("after swaping"+a+" "+b);*/
//4. bitwise operator
		
		/*a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("after swaping"+a+" "+b);*/
//5.single stat
		b=a+b-(a=b);
		//b=10+20-(20=20)
		//b=10   a=20
		
		System.out.println("after swaping"+a+" "+b);
	}
}

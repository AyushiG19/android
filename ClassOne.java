/**
 * 
 */
package project1;

import java.util.Scanner;


/**
 * @author ayushi
 *
 */
public class ClassOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * // TODO Auto-generated method stub System.out.println("HI"); int a;
		 * 
		 * System.out.println("Enter a"); a=sc.nextInt(); if(a>0)
		 * System.out.println(""); else System.out.println("odd");
		 */
		// prog 1: to swap without using third variable
		/*
		 * System.out.println("Enter the numbers"); int a,b;
		 * 
		 * a=sc.nextInt(); b=sc.nextInt(); a=a+b; b=a-b; a=a-b;
		 * System.out.println("a: "+a); System.out.println("b:" +b);
		 */
		// prog 2: to check wheter a character is vowel or consonant

		/*
		 * System.out.println("Enter the character"); String st=sc.next(); char
		 * ch=st.charAt(0); if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
		 * System.out.println("vowel"); else System.out.println("consonant");
		 */
	

		// prog 3: to make a calculator
		
		/*  System.out.println("Enter the numbers"); int a,b; a=sc.nextInt();
		  b=sc.nextInt(); System.out.println("Enter the operator");
		  
		 char ch=sc.next().charAt(0); 
		  if(ch=='+')
		  System.out.println("sum is: "+(a+b)); 
		  else if(ch=='-')
		  System.out.println("difference is: "+(a-b));
		   else if(ch=='*')
		  System.out.println("multiply is:"+(a*b));
		   else if(ch=='/')
		  System.out.println("division is: "+(a/b)); 
		  else
		  System.out.println("modulus is: "+(a%b));*/
		 
		// prog 4:fizz and buzz
		/*System.out.println("Enter the number");
		int a;
		a=sc.nextInt();
		if(a%3==0&&a%5==0)
			System.out.println("FIZZ BUZZ");
		if(a%3==0)
			System.out.println("FIZZ");
		else if(a%5==0)
			System.out.println("BUZZ");
		else
//			System.out.println("Number: "+a);*/
//		int a,b;
//		System.out.println("Enter the numbers");
//		a=sc.nextInt();
//		b=sc.nextInt();
//		System.out.println(a>b?a:b);
//		System.out.println("Enter the number");
//		int a=sc.nextInt();
//		
//		for(int i=1;i<=10;i++)
//			System.out.println(a+"*"+i+"="+(a*i));
//		
//int a=0,b=1,i=2,fib=0;
//System.out.println(a);
//System.out.println(b);
//while(i<num)
//{
//	fib=a+b;
//	a=b;
//	b=fib;
//	i++;
//	System.out.println(fib);
//}
//	int i=1;
//	while(i<6)
//	{
//		i++;
//		
//		System.out.println(i);
//	}
////			
//	System.out.println("Enter the num");
//	int n=sc.nextInt();
//	System.out.println(prime_num(n));
//	
//	public static String prime_num(int a) 
//	{
//		
//	int flag=1;
//	
//	for(int i=2;i<a;i++)
//		{
//			if(a%i==0)
//		{
//				flag=0;
//				break;
//			}
//		}
//		if(flag==0)
//			return "number is not prime";
//		else
//			return "number is prime";
//	}
//			
//
//		int n=123,num=n,rem;
//		int temp=0;
//		while(n!=0)
//		{
//		rem=n%10;
//		temp=temp*10+rem;
//		n=n/10;
//		}
//		if(num==temp)
//		System.out.println("palindrome");
//		else
//			System.out.println("not palindrome");
		
		
		//programs to check for prime
		//way 1:
//		System.out.println("Enter the number");
//		int num=sc.nextInt();
//		int flag=1;
//		if(num==1)
//			System.out.println("not a prime");
//		for(int i=2;i*i<=num;i++)
//		{
//			if(num%i==0)
//			{
//				flag=0;
//				break;
//			}
//			
////		}			if(flag==0)
//				System.out.println("not a prime");
//			else
//				System.out.println("prime");
		// way 2:
//		System.out.println("enter the number");
//		int num=sc.nextInt();
//		int flag=1;
//		if(num==1)
//			System.out.println("Not a prime");
//		else if((num%2==0)||(num%3==0))
//			System.out.println("Not a prime");
//		for(int i=5;i*i<=num;i=i+2)
//		{
//			if(num%i==0)
//			{
//				flag=0;
//				break;
//			}
//		}
//		if(flag==0)
//			System.out.println("Not a prime");
//		else
//			System.out.println("prime");
////		
	System.out.println("Enter the range");
	int a=sc.nextInt();
		int b=sc.nextInt();
	check_prime(a,b);
		
	}
	public static void check_prime(int a,int b)
	{
		for(int i=a;i<=b;i++)
		{
			boolean bool=isprime(i);
			if(bool==true)
				System.out.println(i);
		}
	}
	public static boolean isprime(int num)
	{
		if(num==1)
			return false;
		for(int i=2;i*i<=num;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}

}

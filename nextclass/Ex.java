package nextclass;

import java.util.Scanner;

public class Ex {
	public static void main(String a[]) throws StudentFailException,NegativeNumberException,PasswordLengthNotMatchException,NotEvenException{
		System.out.println("Enter the Size of array");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Enter elements of the array");
		int[] arr = new int[n];
		int sum=0;
		for(int i =0;i<n;i++) {
			arr[i]=s.nextInt();
			sum+=arr[i];
		}
		
		System.out.println("Average of the array elements "+(double)sum/(double)n);
		
		System.out.println("Enter the Size of array");
		
		int n1 = s.nextInt();
		System.out.println("Enter elements of the array");
		char[] arr1 = new char[n1];
		
		for(int i =0;i<n1;i++) {
			arr1[i]=s.next().charAt(0);
			
			
		}
		for(int i =0;i<n1;i++) {
if(arr1[i]=='a'||arr1[i]=='e'||arr1[i]=='i'||arr1[i]=='o'||arr1[i]=='u') {
	System.out.println(arr1[i]);
				
			}
			
		}
		
	
		
		
		
		System.out.println("Enter the Size of array");
		int n2 = s.nextInt();
		System.out.println("Enter elements of the array");
		char[] arr2 = new char[n2];
		int sum1 = 0;
		
		for(int i =0;i<n2;i++) {
			arr2[i]=s.next().charAt(0);
			if(arr2[i]=='a'||arr2[i]=='e'||arr2[i]=='i'||arr2[i]=='o'||arr2[i]=='u') {
				sum1++;
							
						}
			
			
		}
		System.out.println("The Number of vowels is: "+sum1);
		s.close();
	
		
		
//	Scanner ss = new Scanner(System.in);
//	System.out.println("Enter the Student Marks");
//	int n = ss.nextInt();
//	
//	if(n<=200) {
//		try {
//	
//		throw new StudentFailException("The Student Failed to qualify as marks<=200");
//	}
//		catch(StudentFailException s) {
//			System.out.println(s.getMessage());
//		}
//	}
//	
//	else {
//		System.out.println(((double)n/(double)500)*(double)100);
//	}
//	
//	
//	
//	System.out.println("Enter the Integer");
//	int n1 = ss.nextInt();
//	
//	if(n1<0) {
//		try {
//	
//		throw new NegativeNumberException("The Integer is negative");
//	}
//		catch(NegativeNumberException s) {
//			System.out.println(s.getMessage());
//		}
//	}
//	
//	else {
//		System.out.println(n1);
//	}
//	
//	
//	
//	System.out.println("Enter Password");
//	String st = ss.next();
//	
//	if(st.length()<=10) {
//		try {
//	
//		throw new PasswordLengthNotMatchException("Password length did not match expected value of 10");
//	}
//		catch(PasswordLengthNotMatchException s) {
//			System.out.println(s.getMessage());
//		}
//	}
//	
//	else {
//		System.out.println("Password Saved!!");
//	}
//	
//	
//	System.out.println("Enter the Integer");
//	int n2 = ss.nextInt();
//	
//	if(n2%2!=0) {
//		try {
//	
//		throw new NotEvenException("The Integer is not Even");
//	}
//		catch(NotEvenException s) {
//			System.out.println(s.getMessage());
//		}
//	}
//	
//	else {
//		System.out.println("The integer divided by 2 gives: "+(n2/2));
//	}
//	
//	
//	
//	
//	
//	
	
//	System.out.println("Enter the String");
//	String g = ss.next();
//	if(g.length()>=10) {
//		g=null;
//	}
//	System.out.println("Enter the index");
//	int p = ss.nextInt();
//	try {
//	System.out.println("The Char is "+g.charAt(p));
//	}
//	catch(IndexOutOfBoundsException e) {
//		System.out.println(e.getMessage());
//	}
//	catch(NullPointerException b) {
//		System.out.println(b.getMessage());
//	}
//	
//	System.out.println("Enter the number to be divide 100 by");
//	int n =ss.nextInt();
//	try {
//	System.out.println(100/n);
//	}
//	catch(ArithmeticException e) {
//		System.out.println(e.getMessage());
//	}
//	int[] ar = new int[10];
//	System.out.println("Enter the index");
//	int d = ss.nextInt();
//	try {
//	System.out.println(ar[d]);
//	}
//	catch(ArrayIndexOutOfBoundsException e) {
//		System.out.println(e.getMessage());
//	}
//	
//	
//	
//	try {
//		Null n1 = new Null();
//		if(n1.a.equals("adf")) {
//		System.out.println("Yes");
//		}
//	}
//	catch(NullPointerException e) {
//		System.out.println(e.getMessage());
//	}
	
	
	
	
}
}
class StudentFailException extends Exception{
	public StudentFailException(String mssg) {
		super(mssg);
	}
}
class NegativeNumberException extends Exception{
	public NegativeNumberException(String mssg) {
		super(mssg);
	}
}
class PasswordLengthNotMatchException extends Exception{
	public PasswordLengthNotMatchException(String mssg) {
		super(mssg);
	}
}
class NotEvenException extends Exception{
	public NotEvenException(String mssg) {
		super(mssg);
	}
}

package nextclass;

import java.util.Scanner;

public class NN {
	public static void main(String a[]) {
	Scanner s1=new Scanner(System.in);
	
	System.out.println("Enter the Size of array");
	
	int n3 = s1.nextInt();
	System.out.println("Enter elements of the array");
	int[] arr3 = new int[n3];
	double small=999999d;
	for(int i =0;i<n3;i++) {
		arr3[i]=s1.nextInt();
		 if((double)arr3[i]<small) {
			small=arr3[i];
		}
	}
	
	System.out.println("Smallest element of the array is "+small);
	
	
	
	System.out.println("Enter the Size of array");
	int n4 = s1.nextInt();
	System.out.println("Enter elements of the array");
	int[] arr4 = new int[n4];
	int large=0;
	for(int i =0;i<n4;i++) {
		arr4[i]=s1.nextInt();
		 if(arr4[i]>large) {
			large=arr4[i];
		}
	}
	
	System.out.println("Largest element of the array is "+large);
	s1.close();

}
}

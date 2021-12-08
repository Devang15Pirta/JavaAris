package Class0812;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
	public static void main(String a[]) {
		Scanner s = new Scanner(System.in);
//		ArrayList<Friend> l  =new ArrayList<>();
//		System.out.println("Enter the number of enteries");
//		int n =s.nextInt();
//		for(int i=0;i<n;i++) {
//			System.out.println("Enter the name");
//			String name=s.next();
//			System.out.println("Enter the Friend's name");
//			String fname=s.next();
//			System.out.println("Enter the Pet name");
//			String pet=s.next();
//			System.out.println("Enter Contact number");
//			String contact=s.next();
//			l.add(new Friend(name,fname,pet,contact));
//		}
//		for(Friend item:l) {
//			System.out.println("Name: "+item.getName()+"\nFriend name : "+item.getFname()+"\nPet name: "+item.getPet()+"\nContact Number : "+item.getContact());
//			System.out.println();
//		}
//		
//		4
		
		
		
		ArrayList<LangMarks> st =new ArrayList<>();
		st.add(new LangMarks("Java",59));
		st.add(new LangMarks("Python",79));
		st.add(new LangMarks("Hindi",78));
		st.add(new LangMarks("Js",50));
		
		System.out.println("Enter the number of enteries");
		int n1 =s.nextInt();
		for(int i=0;i<n1;i++) {
			System.out.println("Enter the Language name");
			String name=s.next();
			System.out.println("Enter the Marks");
			int marks=s.nextInt();
			st.add(new LangMarks(name,marks));
		}
		
		char c='n';
		do {
		System.out.println("Select the operation");
		System.out.println("1 Check if list is empty");
		System.out.println("2 print the list");
		System.out.println("3 Add more");
		System.out.println("4 Delete Enteries");
		int p  =s.nextInt();
		if(p==1) {
			System.out.println("Check if list is empty:"+st.isEmpty());
		}
		else if(p==2) {
			for(LangMarks item:st) {
				System.out.println("Language name: "+item.getName()+"\nMarks :"+item.getMarks());
				System.out.println();
			}
		}
		else if(p==3) {
			System.out.println("Enter the number of enteries");
			int n2 =s.nextInt();
			ArrayList<LangMarks> ad = new ArrayList<>();
			for(int i=0;i<n2;i++) {
				System.out.println("Enter the Language name");
				String name=s.next();
				System.out.println("Enter the Marks");
				int marks=s.nextInt();
				st.add(new LangMarks(name,marks));
			}
			st.addAll(ad);
			
		}
		else if(p==4) {
			System.out.println("Enter the name of the language to be deleted");
			String g=s.next();
			int ind=0;
			for(LangMarks item:st) {
				if(item.getName().equals(g)) {
					ind = st.indexOf(item);
					break;
				}
			}
			st.remove(ind);
			System.out.println("The language was deleted");
		}
		System.out.println("Would you like to operate again (y/n)");
		c =s.next().charAt(0);
		
		
		}while(c=='y');

}
}

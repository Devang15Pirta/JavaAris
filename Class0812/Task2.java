package Class0812;

import java.util.*;

public class Task2 {
	public static void main(String a[]) {
		ArrayList<Employee> l  =new ArrayList<>();
		System.out.println("Enter the number of enteries");
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter Employee name");
			String name=s.next();
			System.out.println("Enter Employee id");
			String id=s.next();
			System.out.println("Enter Employee Date of birth");
			String dob=s.next();
			System.out.println("Enter Employee salary");
			int salary=s.nextInt();
			l.add(new Employee(name,id,dob,salary));
		}
		char c='n';
		do {
		System.out.println("Select the operation");
		System.out.println("1 Check if list is empty");
		System.out.println("2 print the list");
		System.out.println("3 Monthly salary");
		System.out.println("4 Add new enteries");
		System.out.println("5 Delete all Enteries");
		int p  =s.nextInt();
		if(p==1) {
			System.out.println("Check if list is empty:"+l.isEmpty());
		}
		else if(p==2) {
			for(Employee item:l) {
				System.out.println("Employee name: "+item.getEname()+"\nEmployee ID :"+item.getEid()+"\nEmployee Date of Birth:"+item.getDob()+"\nEmployee Salary:"+item.getSalary());
				System.out.println();
			}
		}
		else if(p==3){
			for(Employee item:l) {
				System.out.println("Employee name: "+item.getEname()+"\nEmployee ID :"+item.getEid()+"\nEmployee Date of Birth:"+item.getDob()+"\nEmployee Monthly Salary:"+(double)(item.getSalary()/(double)12));
				System.out.println();
			}
			
		}
		else if(p==4) {
			System.out.println("Enter the number of enteries");
			int n1 =s.nextInt();
			ArrayList<Employee> ad = new ArrayList<>();
			for(int i=0;i<n1;i++) {
				System.out.println("Enter Employee name");
				String name=s.next();
				System.out.println("Enter Employee id");
				String id=s.next();
				System.out.println("Enter Employee Date of birth");
				String dob=s.next();
				System.out.println("Enter Employee salary");
				int salary=s.nextInt();
				ad.add(new Employee(name,id,dob,salary));
			}
			l.addAll(ad);
			
		}
		else {
			l.clear();
			System.out.println("All the Enteries have been removed");
			
		}
		System.out.println("Would you like to operate again (y/n)");
		c =s.next().charAt(0);
		
		
		}while(c=='y');
	}

}

package student;
import java.util.*;

public class Student {
	Scanner s= new Scanner(System.in);
//	String name;
//	Student(String name){
//		this.name=name;
//		System.out.println("The name of the Student is "+name);
//	}
//	Student(){
//		System.out.println("The name of the Student is unknown ");
//	}
	int id;
	String name;
	String ph;
	void readDetails(){
		System.out.println("The id of the Student is ");
		id=s.nextInt();
		System.out.println("The name of the Student is ");
		name=s.next();
		System.out.println("The Phone number of the Student is ");
		ph=s.next();
	}
	void displayDetails() {
		System.out.println("Name: "+name+" ; id: "+id+" Phone number: "+ph);
	}
}

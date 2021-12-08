package Class0812;
import java.util.*;
public class MyProg {
	public static void main(String a[]) {
		ArrayList<Integer> a1 =new ArrayList<>();
		a1.add(23);
		a1.add(78);
		a1.add(37);
		for(int item:a1) {
			System.out.println(item);
		}
		
		
		ArrayList<String> a2 =new ArrayList<>();
		a2.add("Devang");
		a2.add("Shimla");
		a2.add("Sanjauli");
		for(String item:a2) {
			System.out.println(item);
		}
		
		ArrayList<Student> s =new ArrayList<>();
		s.add(new Student(17,"Devang"));
		s.add(new Student(18,"Ram"));
		s.add(new Student(19,"Shyam"));
		
		for(Student item:s) {
			System.out.println("The Student "+item.getName()+" has a roll number of "+item.getRoll());
		}
	}

}

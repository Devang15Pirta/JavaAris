package Class1012;

import java.util.HashMap;
import java.util.Map;


public class Task2 {
	public static void main(String a[]) {
		HashMap<String,Employee> e = new HashMap<>();
		Employee a1 =new Employee("Rohit","001",450000);
		Employee a2 =new Employee("Rajeshwar","002",570000);
		Employee a3 =new Employee("Shyamanada","003",630000);
		e.put("1",a1);
		e.put("2",a2);
		e.put("3",a3);
		for(Map.Entry<String,Employee> me: e.entrySet()) {
			System.out.println("The "+me.getKey()+" is "+me.getValue().ename+"\nId: "+me.getValue().eid+" \nSalary: "+me.getValue().salary);
		}
		
		
		
		HashMap<String,Book> b = new HashMap<>();
		Book b1 =new Book("Immortals of Meluha","001","450");
		Book b2 =new Book("Brightside","002","570");
		Book b3 =new Book("Solar Oddesy","003","630");
		b.put("1",b1);
		b.put("2",b2);
		b.put("3",b3);
		for(Map.Entry<String,Book> me: b.entrySet()) {
			System.out.println("The "+me.getKey()+" Book is "+me.getValue().name+"\nId: "+me.getValue().id+" \nPrice: "+me.getValue().price);
		}
		
		
		
		HashMap<String,Teacher> t= new HashMap<>();
		Teacher t1 =new Teacher("Devang","001",450000);
		Teacher t2 =new Teacher("Ram","002",570000);
		Teacher t3 =new Teacher("Shyam","003",630000);
		t.put("1",t1);
		t.put("2",t2);
		t.put("3",t3);
		for(Map.Entry<String,Employee> me: e.entrySet()) {
			System.out.println("The "+me.getKey()+" Teacher is "+me.getValue().ename+"\nId: "+me.getValue().eid+" \nSalary: "+me.getValue().salary);
		}
	}


	}

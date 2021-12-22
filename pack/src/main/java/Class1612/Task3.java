package Class1612;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Task3 {
	public static void main(String a[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Employeedata.xml");
		Employee e  =(Employee)context.getBean("emp");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter employee name");
		e.setName(sc.next());
		System.out.print("Enter employee days");
		e.setDays(sc.nextInt());
		e.getSalary();
	}

}

package pack;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("MyBeans.xml");

	    Employee s2= (Employee)context.getBean("s3");
//	    System.out.println("Enter the name of employee");
//	    Scanner sc = new Scanner(System.in);
//	    String name = sc.next();
//	    System.out.println("Enter the id of employee");
//	    String id = sc.next();
//	    System.out.println("Enter the Address of employee");
//	    String add = sc.next();
//	    System.out.println("Enter the Salary of employee");
//	    String sal = sc.next();
//	    s2(id,add,sal,name);
	    s2.display();

}
}

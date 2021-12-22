package Class1612;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Task1 {
public static void main(String a[]) {
	ApplicationContext context=new ClassPathXmlApplicationContext("NewFile.xml");
	MessagePass s2= (MessagePass)context.getBean("msgpass");
	s2.displayMsg();
}
}

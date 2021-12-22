package Class1612;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Task2 {
	public static void main(String a[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("NewFile.xml");
		Student s2= (Student)context.getBean("stu");
		s2.dispAdd();
	}
}

package Class1612;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
int days;
Salary s;
String name;

public void setName(String name) {
	this.name = name;
}
public Salary getS() {
	return s;
}
@Autowired
public void setS(Salary s) {
	this.s = s;
}
void getSalary() {
	System.out.println("Employee name : "+this.name);
	System.out.println("Employee Salary : "+s.salary(days));
	
	
}
public void setDays(int days) {
	this.days = days;
}

}

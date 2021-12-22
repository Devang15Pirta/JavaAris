package Class1012;

public class Employee {
	String ename;
	String eid;
	int salary;
	public Employee(String ename, String eid, int salary) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.salary = salary;
	}
	public String getEname() {
		return ename;
	}
	public String getEid() {
		return eid;
	}
	public int getSalary() {
		return salary;
	}


}

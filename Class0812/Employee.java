package Class0812;

public class Employee {
	String ename;
	String eid;
	String dob;
	int salary;
	public Employee(String ename, String eid, String dob, int salary) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.dob = dob;
		this.salary = salary;
	}
	public String getEname() {
		return ename;
	}
	public String getEid() {
		return eid;
	}
	public String getDob() {
		return dob;
	}
	public int getSalary() {
		return salary;
	}

}

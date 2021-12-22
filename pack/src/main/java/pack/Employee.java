package pack;

public class Employee {
	String id,salary,address,name;
	public Employee() {
		
	}

	public Employee(String id, String salary, String address, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.address = address;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	void display() {
		System.out.println("Employee id : "+id+"\nEmployee Salary : Rs"+salary+"\nEmployee Address : "+address+"\nEmployee Name : "+name);
	}
	}


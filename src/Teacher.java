
public class Teacher {
	private int id;
	private String name;
	private int salary;
	/*
	 * Responsible for creating new teacher object
	*/
	public Teacher(int id, String name, int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	/*
	 * Return the  ID, Name and Salary
	*/
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public int getsalary() {
		return salary;
	}
	
	/*
	 * Set the salary only because of the change on it
	*/
	public void setSalary(int salary) {
		this.salary=salary;
	}
}

package EmployeeSecond;

public class Employee {
	
	int id;
	String name;
	int age;
	String department;
	String city;
	double salary;
	String gender;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getDepartment() {
		return department;
	}
	public String getCity() {
		return city;
	}
	public double getSalary() {
		return salary;
	}
	public String getGender() {
		return gender;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee(int id, String name, int age, String department, String city, double salary, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
		this.city = city;
		this.salary = salary;
		this.gender = gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", department=" + department + ", city="
				+ city + ", salary=" + salary + ", gender=" + gender + "]";
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}

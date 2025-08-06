package EmployeeSecond;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee(1, "Ramesh", 29, "IT", "Mumbai", 100, "Male"));
		emp.add(new Employee(2, "Suresh", 27, "Sales","Chennai",200, "Female"));
		emp.add(new Employee(3, "Naresh", 28, "IT", "Chennai", 300, "Male"));
		emp.add(new Employee(4, "Mahesh", 29, "Sales", "Gurgaon", 400, "Male"));
		emp.add(new Employee(5, "Hesh", 25, "Sales", "Banglore", 600, "Female"));
		emp.add(new Employee(6, "Sushmita", 27, "Admin", "Mumbai", 800, "Female"));
		emp.add(new Employee(7, "Queen", 30, "Research", "Kochi", 900, "Female"));
		
		//Find the second highest salary from employeel
		
		Employee secondHighest = emp.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst().orElse(null);
		
		Employee yash = emp.stream().
		        sorted((x,y)->(int)y.salary-(int)x.salary).skip(1).findFirst().orElse(null);
		
		
		System.out.println(secondHighest);
		System.out.println(yash);
		
		
		System.out.println();
		
		//find the list of employee sort by salary
		
		//List<Employee>sortEmp = emp.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
		//System.out.println(sortEmp);
		
		//Find the Highest Salary of each department
		
		//Map<String,Optional<Employee>> hig = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
		
		//System.out.println(hig);
		
		//Find the average salary of all department
		
		Map<String,Double>aver = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(aver);
		
		//find the employee who stay in Chennai and sort them by their name
		
		List<Employee> che = emp.stream().filter(e -> e.getCity().equals("Chennai")).sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		System.out.println(che);
		
		//Find the department who is having max number of employee
		
		Map.Entry<String ,Long> maxEmp = emp.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
				.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		
		
		System.out.println(maxEmp);
		
		//find the employee whose name start with S
		
		List<Employee> NameStartWithS = emp.stream().filter(e -> e.getName().startsWith("S")).collect(Collectors.toList());
		
		System.out.println(NameStartWithS);
		
		//Group the employee with department
		
		Map<String,List<Employee>> eachDepartment = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment));
				
		System.out.println(eachDepartment);
		
		//Find the total count of employee
		long count = emp.stream().count();
		System.out.println(count);
		
		//Find the max age of Employee
		
		int maxAge = emp.stream().mapToInt(Employee::getAge).max().getAsInt();
		System.out.println(maxAge);
		
		//Find all department name
		Set<String>st = emp.stream().map(Employee::getDepartment).collect(Collectors.toSet());
		System.out.println(st);
		
		//Find the count of employee of each department 
		
		Map<String ,Long> countOf = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println(countOf);
		
		//Find the employee whose age is less than 30
		
		//find the average age of male and female employee
	}
	

}

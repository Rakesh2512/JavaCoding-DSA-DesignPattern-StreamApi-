package EmployeeStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeTest {
	
	
	public static void main(String[] args) {
		
		
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1,"Jhansi",32,"Female","HR",2011,25000.0));
		emp.add(new Employee(2,"Smith",25,"Male","Sales",2015,13500.0));
		emp.add(new Employee(3,"David",29,"Male","Infrastructure",2012,18000.0));
		emp.add(new Employee(4,"Orlean",28,"Male","Development",2014,32500.0));
		emp.add(new Employee(5,"Charles",27,"Male","HR",2013,22700.0));
		emp.add(new Employee(6,"Cathy",43,"Male","Security",2016,10500.0));
		emp.add(new Employee(7,"Ramesh",35,"Female","Finance",2010,27000.0));
		emp.add(new Employee(8,"Suresh",31,"Male","Development",2015,34500.0));
		emp.add(new Employee(9,"Gita",24,"Female","Sales",2016,11500.0));
		emp.add(new Employee(10,"Mahesh",38,"Male","Security",2015,11000.0));
		emp.add(new Employee(11,"Gouri",27,"Female","Infrastructure",2014,15700.0));
		emp.add(new Employee(12,"Nithin",25,"Male","Development",2016,28200.0));
		emp.add(new Employee(13,"Swathi",27,"Female","Finance",2013,28200.0));
		emp.add(new Employee(14,"Buttler",24,"Male","Sales",2017,10700.0));
		emp.add(new Employee(15,"Ashok",23,"Male","Infrastructure",2018,12700.0));
		emp.add(new Employee(16,"Sanvi",26,"Female","Development",2015,28900.0));
		
		//Count of Male and Female Employee
		
		Map<String,Long>genderCount = emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		
		System.out.println(genderCount);
		
		//What is the average male and female employees
		
		Map<String,Double>average = emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println(average);
		
		//Get the details of highest paid employee in the organizations
		
	   Employee highestPaidEmp = emp.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
	   System.out.println(highestPaidEmp);
	   Optional<Employee> highestPaid = emp.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
	   System.out.println(highestPaid.get());
	   
		//Employee who joined after 2015
	   
	   
		List<Employee>joinedafter = emp.stream().filter(e -> e.getYearOfJoining() >= 2015).collect(Collectors.toList());
		System.out.println(joinedafter);
		
		//count the number of employee in each department
		
		Map<String,Long>countEmployee = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		
		System.out.println(countEmployee);
		
		
		
		//What is the average salary of each department
		
		Map<String,Double>avgSalary = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println(avgSalary);
		
		//Get the details of youngest male employee in the development departments
		
		Employee youngest = emp.stream().filter(e -> e.getGender().equals("Male") && e.getDepartment().equals("Development"))
				.min(Comparator.comparingInt(Employee::getAge)).orElse(null);
		
		System.out.println(youngest);
		
		Optional<Employee>getYoungest = emp.stream()
				.filter(e -> e.getGender().equals("Male") && e.getDepartment().equals("Development"))
				.min(Comparator.comparingInt(Employee::getAge));
		
		System.out.println(getYoungest.get());
				
		
		//Who has the most working experience in the organization?
		
		Employee mostExp = emp.stream().min(Comparator.comparingInt(Employee::getYearOfJoining)).orElse(null);
		System.out.println(mostExp);
		
		Optional<Employee>mostWorking = emp
				.stream().min(Comparator.comparingInt(Employee::getYearOfJoining));
		System.out.println(mostWorking);
		
		
		
		//How many male and female in sales department
		
		Map<String,Long> countInSales = emp.stream().filter(e -> e.getDepartment().equals("Sales")).collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		
		System.out.println(countInSales);
		
		//What is average and total salary of all organizations
		
		Double avgSalaryOfEmp = emp.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println(avgSalaryOfEmp);
		
		Double acgsal = emp.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
		
		System.out.println(acgsal);
		
		Double totalSal = emp.stream().mapToDouble(Employee::getSalary).sum();
		
		System.out.println(totalSal);
		
		
		//Separate the employee who are younger or equal to 25 years from those employee who are older than 25 years?
		
		
		
		//Who is the oldest employee in the organization
		
	}
	
	

}

package com.gourabix;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeApplicationMain {

	public static void main(String[] args) {
		List<Employee> listOfEmployees = new ArrayList<Employee>();
		listOfEmployees.add(new Employee(-1, "Gourab Sarkar"));
		listOfEmployees.add(new Employee(2, "Gourab Sarkar"));
		listOfEmployees.add(new Employee(3, "Gourab Sarkar"));
		listOfEmployees.add(new Employee(4, "Gaurab Sarkar"));
		listOfEmployees.add(new Employee(5, "Gourab Sarkar"));

		// Get max employee Id
		Optional<Integer> maxEmployeeId = listOfEmployees.stream().map(employee -> employee.getEmployeeId())
				.max(Comparator.comparing(Integer::valueOf));
		System.out.println("Max. Employee ID: " + maxEmployeeId.get());

		// Get min employee ID
		Optional<Integer> minEmployeeId = listOfEmployees.stream().map(employee -> employee.getEmployeeId())
				.min(Comparator.comparing(Integer::valueOf));
		System.out.println("Min. Employee ID: " + minEmployeeId.get());

		// Get list and count of employees with ID > 2
		List<Integer> collectedList = listOfEmployees.stream().map(employee -> employee.getEmployeeId())
				.filter(employeeId -> employeeId > 2).collect(Collectors.toList());
		long count = listOfEmployees.stream().map(employee -> employee.getEmployeeId())
				.filter(employeeId -> employeeId > 2).count();
		System.out.println(collectedList + " :: " + count);

		// Print names of employees with name starting with "Gou"
		listOfEmployees.stream().map(employee -> employee.getEmployeeName())
				.filter(employeeName -> employeeName.startsWith("Gou")).forEach(System.out::println);
	}

}

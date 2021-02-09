package com.gourabix.java8;

import java.time.LocalDate;

public class Developer {

	private String name;

	private String email;

	private Long salary;

	private LocalDate startDate;

	public Developer() {
		// Required for developerFactory(Developer::new);
	}

	// required for Lambda expressions:
	// developerFactory(() -> new Developer("Gourab"));
	public Developer(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Long getSalary() {
		return salary;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	@Override
	public String toString() {
		return "Developer [name=" + name + ", email=" + email + ", salary=" + salary + ", startDate=" + startDate + "]";
	}

}

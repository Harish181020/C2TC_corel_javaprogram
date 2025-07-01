package com.Harishkumar.Assignment.Employees;

public class Developer extends Employee {
	 private String programmingLanguage;

	    public Developer(String name, String id, double salary, String programmingLanguage) {
	        super(name, id, salary);
	        this.programmingLanguage = programmingLanguage;
	    }

	    public String getProgrammingLanguage() {
	        return programmingLanguage;
	    }

	    public void setProgrammingLanguage(String programmingLanguage) {
	        this.programmingLanguage = programmingLanguage;
	    }
	}

package com.example.intro.Model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Model {
    public Model(int i, String name2, long salary2) {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	private int id;
    private String name;
    private long salary;
}
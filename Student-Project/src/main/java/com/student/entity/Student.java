package com.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*@AllArgsConstructor
@NoArgsConstructor
@Data*/
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private int age;
	
	private String studGroup;

	
	
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStudGroup() {
		return studGroup;
	}

	public void setStudGroup(String studGroup) {
		this.studGroup = studGroup;
	}

	public Student(int id, String name, int age, String studGroup) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.studGroup = studGroup;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", studGroup=" + studGroup + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

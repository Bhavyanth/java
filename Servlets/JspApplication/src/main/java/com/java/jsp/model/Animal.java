package com.java.jsp.model;

public class Animal {

	private String id;

	private String name;
	private int age;
	private String breed;
	
	public Animal() {
	}

	public Animal(String id, String name, int age, String breed) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.breed = breed;
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

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Animal{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", age=" + age +
				", breed='" + breed + '\'' +
				'}';
	}
}

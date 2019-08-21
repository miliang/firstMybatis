package com.pojo;

public class User {
	private int id;
	private String name;
	private int age;
	private double money;
	public User() {
	
	}
	public User(int id, String name, int age, double money) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.money = money;
	}
	
	public User(String name, int age, double money) {
		this.name = name;
		this.age = age;
		this.money = money;
	}
	
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", money=" + money + "]";
	}

}

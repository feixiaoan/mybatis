package com.xiaofei.po;

public class Person {
	private Integer id;
	private String name;
	private Integer age;
	private Idcard card;
	public Person() {
		super();
	}
	public Person(Integer id, String name, Integer age, Idcard card) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.card = card;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Idcard getCard() {
		return card;
	}
	public void setCard(Idcard card) {
		this.card = card;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", card=" + card + "]";
	}
	
}
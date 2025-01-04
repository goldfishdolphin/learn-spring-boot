package com.in28min.springboot.learn_spring_boot;

public class Course {
	private long id;
	private String name;
	private String author;
	
	//constructor
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	
	//Getter
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}
	//toString
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

	
	
	


	

}
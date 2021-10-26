package by.epam.ForeignLanguageCourses;

import java.util.ArrayList;

public class CatalogOfCourses
{
	private int id;
	private String title;
	private int duration;
	private int price;
	private String level;

	public CatalogOfCourses(int id, String title, int duration, int price, String level)
	{
		this.id = id;
		this.title = title;
		this.duration = duration;
		this.price = price;
		this.level = level;
	}
}

class Person
{
	private String name;
	private String phone;
	private String level;

	public Person(String name, String phone, String level)
	{
		this.name = name;
		this.phone = phone;
		this.level = level;
	}
}

class Course
{
	ArrayList <Person> group;
	ArrayList <Course> course;

	public Course(ArrayList<Person> group, ArrayList<Course> course)
	{
		this.group = group;
		this.course = course;
	}
}

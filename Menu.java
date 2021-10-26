package by.epam.deliveryOfReadyMeals;

import java.util.ArrayList;

public class MenuOfMeels
{
	private int id;
	private String item;
	private int price;

	public MenuOfMeels(int id, String item, int price)
	{
		this.id = id;
		this.item = item;
		this.price = price;
	}
}


class Person
{
	private String name;
	private String address;
	private String phone;

	public Person(String name, String address, String phone)
	{
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
}

class Order
{
	private int count;
	Person person;
	ArrayList <MenuOfMeels> order;

	public Order(int count, Person person, ArrayList<MenuOfMeels> order)
	{
		this.count = count;
		this.person = person;
		this.order = order;
	}
}

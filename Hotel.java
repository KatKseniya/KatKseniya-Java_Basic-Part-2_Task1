package by.epam.Hotel;
import java.util.ArrayList;


class Room
{

	private int id;
	private String level; // e.g. Economy, Luxury, Standart
	private int numberOfBeds;
	private int Price;

	public Room(int id, String level, int numberOfBeds, int price)
	{
		this.id = id;
		this.level = level;
		this.numberOfBeds = numberOfBeds;
		Price = price;
	}
}

class Person
{
	private String name;
	private int roomId;

	public Person(String name, int roomId)
	{
		this.name = name;
		this.roomId = roomId;
	}
}


class Order
{
	private Room room;
	private Person person;
	private int numberOfDays;

	public Order(Room room, Person person, int numberOfDays)
	{
		this.room = room;
		this.person = person;
		this.numberOfDays = numberOfDays;
	}
}

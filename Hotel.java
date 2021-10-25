package by.epam.Hotel;
import java.util.ArrayList;


public class Hotel
{
	public int stars;
	public int floors;
	public int numberOfRooms;

	public static ArrayList <Room> addRoom (Room room)
	{
		ArrayList <Room> rooms = new ArrayList<Room>();
		rooms.add(room);
		return rooms;
}
}

class Room
{
	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

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
	private int numberOfDays;
	private int roomId;

	public Person(String name, int numberOfDays, int roomId)
	{
		this.name = name;
		this.numberOfDays = numberOfDays;
		this.roomId = roomId;
	}
}

class CreateDataBaseOfRooms { // class for creating a database of hotel rooms
	Hotel barselo = new Hotel();
	ArrayList <Room> rooms = new ArrayList<Room>(new Hotel().addRoom(new Room(1, "Economy", 2, 50)));
}

class Order
{
	public static  ArrayList <Order> addRoom (Person men, Room room)
	{

		// method for adding the appropriate room to the customer

		return addRoom(men, room);

	}
}

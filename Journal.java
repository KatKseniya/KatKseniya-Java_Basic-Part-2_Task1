package by.epam.electronicVisitLog;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Journal
{
	public Date arrivalDate;
	public Date departureDate;
	
	public static void main(String[] args)
	{
	ArrayList <Person> personList = new ArrayList<Person>();
	personList.add(new Person("Men1", 1));
	}
}

class Person
{
	private String name;
	private int id; // id of the pass

	public Person(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
}

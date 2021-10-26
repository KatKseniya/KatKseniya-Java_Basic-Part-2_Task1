package by.epam.electronicVisitLog;
import java.util.Date;

public class Journal
{
	private Person person;
	private Person day;

	public Journal(Person person, Person day)
	{
		this.person = person;
		this.day = day;
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

class Period
{
	private Date arrivalDate;
	private Date departureDate;

	public Period(Date arrivalDate, Date departureDate)
	{
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
	}
}


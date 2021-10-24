package by.epam.electronicVisitLog;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Journal
{
	public Date arrivalDate;
	public Date departureDate;
	private List <Person> personList = new ArrayList<Person>();

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

package by.epam.electronicVisitLog;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Journal
{
	public Date arrivalDate;
	public Date departureDate;
	private List <Person> personList = new ArrayList<Person>();
	Person men1 = new Person("Men1", 1);
	personList.add(men1);

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

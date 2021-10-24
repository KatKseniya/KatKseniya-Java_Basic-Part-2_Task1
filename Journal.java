package by.epam.electronicVisitLog;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Journal
{


	public static void main(String[] args)
	{
		Calendar calendar = new GregorianCalendar(2021, 10 , 25);
		ArrayList <Person> personList = new ArrayList<Person>();
		Person men1 = new Person("Men1", 1, calendar.getTime(), null);
		personList.add(men1);
	}

}

class Person
{
	private String name;
	private int id; // id of the pass
	private Date arrivalDate;
	private Date departureDate;

	public Person(String name, int id, Date arrivalDate, Date departureDate)
	{
		this.name = name;
		this.id = id;
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
	}
}

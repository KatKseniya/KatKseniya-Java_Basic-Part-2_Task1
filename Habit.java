package by.epam.HabitTracker;
import java.util.ArrayList;

public class Habit
{
	private String name;
	private String coverType;


	public static ArrayList <HabitTracker> listOfHabits (HabitTracker habit)
	{
		ArrayList <HabitTracker> listOfHabits = new ArrayList<HabitTracker>();
		listOfHabits.add(habit);
		return listOfHabits;
	}
}

class HabitTracker
{
	private String habitsPeriod;
	private String habitName;
	private String description;
	private int day;
	private boolean isDone;

	public HabitTracker(String habitsPeriod, String habitName, String description, int day, boolean isDone)
	{
		this.habitsPeriod = habitsPeriod;
		this.habitName = habitName;
		this.description = description;
		this.day = day;
		this.isDone = isDone;
	}
}

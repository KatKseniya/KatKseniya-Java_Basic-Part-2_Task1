package by.epam.HabitTracker;
import java.util.ArrayList;

public class Habit
{
	private String habirName;
	private String description;

	public Habit(String habirName, String description)
	{
		this.habirName = habirName;
		this.description = description;
	}
}

class Period {
	private int day;

	public Period(int day)
	{
		this.day = day;
	}
}

class HabitTracker
{
	private boolean isDone;
	private ArrayList <Habit> habit;
	private Period day;

	public HabitTracker(boolean isDone, ArrayList<Habit> habit, Period day)
	{
		this.isDone = isDone;
		this.habit = habit;
		this.day = day;
	}
}

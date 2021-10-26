package by.epam.Scheduler;
import java.util.ArrayList;

public class Scheduler
{

	private ArrayList <Week> dayOfWeek;
	private Note note;

	public Scheduler(ArrayList<Week> dayOfWeek, Note note)
	{
		this.dayOfWeek = dayOfWeek;
		this.note = note;
	}
}

class Week {
	private String dayOfWeek;

	public Week(String dayOfWeek)
	{
		this.dayOfWeek = dayOfWeek;
	}
}


class Note {
	private String note;

	public Note(String note)
	{
		this.note = note;
	}
}

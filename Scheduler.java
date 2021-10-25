package by.epam.Scheduler;

import java.util.ArrayList;

public class Scheduler
{
	private String owner;
	private String month;

	public Scheduler(String owner, String month)
	{
		this.owner = owner;
		this.month = month;
	}

	private static ArrayList <Scheduler> addNotetoWeek (ArrayList <Week> week, Note note) {

		// method for adding note to day

		return addNotetoWeek(week, note);
	}
}

class Week {
	private static ArrayList <String> addDaysToWeek () {
		ArrayList<String> week = new ArrayList<>();
		week.add("Monday");
		week.add("Tuesday");
		return week;
	}
}

class Note {
	private String note;

	public Note(String note)
	{
		this.note = note;
	}
}

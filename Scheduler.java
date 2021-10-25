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
	private static ArrayList <WeekDays> addDaysToWeek (WeekDays days) {
		ArrayList<WeekDays> week = new ArrayList<WeekDays>();
		week.add(days);
		return week;
	}

}

class WeekDays
{
	private String monday;
	private String tuesday;
	private String wednesday;
	private String thursday;
	private String friday;
	private String saturday;
	private String sunday;

	public WeekDays() {
		super();
	}

	public WeekDays(String monday, String tuesday, String wednesday, String thursday, String friday, String saturday,
			String sunday)
	{
		super();
		this.monday = monday;
		this.tuesday = tuesday;
		this.wednesday = wednesday;
		this.thursday = thursday;
		this.friday = friday;
		this.saturday = saturday;
		this.sunday = sunday;
	}

}

class Note {
	private String note;

	public Note(String note)
	{
		this.note = note;
	}
}

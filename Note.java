package by.epam.Note;

import java.util.ArrayList;
import java.util.Date;

class NoteBook
{
	private int id;
	private String owner;
	private ArrayList <Note> note;

	public NoteBook(int id, String owner, ArrayList<Note> note)
	{
		this.id = id;
		this.owner = owner;
		this.note = note;
	}

	public static ArrayList<Note> addNote (Note note)
	{
		ArrayList <Note> notes = new ArrayList<Note>();
		notes.add(note);
		return notes;
	}


	public static  ArrayList<Note> removeNote (Note note, int idOfNote)
{
	ArrayList <Note> notes = new ArrayList<Note>();
	notes.remove(idOfNote);
	return notes;
}

}

public class Note
{
	private Date createDate;
	private String text;
	private boolean actual;

	public Note(Date createDate, String text, boolean actual)
	{
		this.createDate = createDate;
		this.text = text;
		this.actual = actual;
	}
}




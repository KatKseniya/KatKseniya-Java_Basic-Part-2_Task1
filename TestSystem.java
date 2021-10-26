package by.epam.TestSystem;

public class TestSystem
{
	private boolean correctAnswere;
	private Questions question;
	private Answere answere;

	public TestSystem(boolean correctAnswere, Questions question, Answere answere)
	{
		this.correctAnswere = correctAnswere;
		this.question = question;
		this.answere = answere;
	}
}

class Questions
{
	private String question;

	public Questions(String question)
	{
		this.question = question;
	}
}

class Answere
{
	private String answere;

	public Answere(String answere)
	{
		this.answere = answere;
	}
}



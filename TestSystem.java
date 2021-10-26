package by.epam.TestSystem;

public class TestSystem
{
	private Questions question;
	private Answere answere;
	private boolean correctAnswere;

	public TestSystem(Questions question, Answere answere, boolean correctAnswere)
	{
		this.question = question;
		this.answere = answere;
		this.correctAnswere = correctAnswere;
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



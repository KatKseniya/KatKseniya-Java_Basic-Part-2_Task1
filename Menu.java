package by.epam.deliveryOfReadyMeals;
import java.util.ArrayList;

public class Menu
{
	private int id;
	private String item;
	private int price;

	public Menu(int id, String item, int price)
	{
		this.id = id;
		this.item = item;
		this.price = price;
	}

}

class CreateDataBaseOfMenu { // class for creating a database of menu items
	Shop food = new Shop();
	ArrayList <Menu> menuDB = new ArrayList<Menu>(new Shop().addItem(new Menu(1, "Water", 10)));
}

class Shop {

	public static ArrayList <Menu> addItem (Menu menu)
	{
		ArrayList <Menu> menuDB = new ArrayList<Menu>();
		menuDB.add(menu);
		return menuDB;
	}
}


class Person
{
	private String name;
	private String address;
	private String phone;

	public Person(String name, String address, String phone)
	{
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
}

class Order
{
	private int count;

	public static  ArrayList <Order> addMenuItem (Person men, Menu item)
	{
		// method for adding the appropriate menu items to the customer

		return addMenuItem (men, item);
	}
}

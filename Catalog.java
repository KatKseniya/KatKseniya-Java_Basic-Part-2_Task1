package by.epam.eCommerce;
import java.util.ArrayList;

public class Catalog
{
	private int id;
	private String item;
	private int price;
	private int size;
	private boolean delivery;

	public Catalog(int id, String item, int price, int size, boolean delivery)
	{
		this.id = id;
		this.item = item;
		this.price = price;
		this.size = size;
		this.delivery = delivery;
	}

}


class CreateDataBaseOfGoods { // class for creating a database of goods
	eCommerce goods = new eCommerce();
	ArrayList <Catalog> menuDB = new ArrayList<Catalog>(new eCommerce().addItem(new Catalog(1, "T-Shot", 50, 42, true)));
}

class eCommerce {

	public static ArrayList <Catalog> addItem (Catalog goods)
	{
		ArrayList <Catalog> goodsDB = new ArrayList<Catalog>();
		goodsDB.add(goods);
		return goodsDB;
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

	public static  ArrayList <Order> addMenuItem (Person men, Catalog goods)
	{
		// method for adding the appropriate goods to the customer

		return addMenuItem (men, goods);
	}
}

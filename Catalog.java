package by.epam.eCommerce;
import java.util.ArrayList;

public class CatalogofOnlineStore
{
	private int id;
	private String item;
	private int price;
	private int size;
	private boolean delivery;

	public CatalogofOnlineStore(int id, String item, int price, int size, boolean delivery)
	{
		this.id = id;
		this.item = item;
		this.price = price;
		this.size = size;
		this.delivery = delivery;
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
	private Person person;
	private ArrayList <CatalogofOnlineStore> goods;

	public Order(int count, Person person, ArrayList<CatalogofOnlineStore> goods)
	{
		this.count = count;
		this.person = person;
		this.goods = goods;
	}
}

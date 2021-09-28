package ConstructorDemo;

class product {
	private String itemno;
	private String name;
	private double price;
	private int quantity;
	public product(String itemno)
	{
		this.itemno=itemno;
	}
	public product(String itemno,String name)
	{
		this.itemno=itemno;
		this.name=name;
	}
	public product(String itemno, String name, double price, int quantity) {
		this.itemno = itemno;
		this.name = name;
		setPrice(price);
		setQuantity(quantity);
	}
	public String getItemno() {
		return itemno;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}

class Customer {
	private String cusid;
	private String name;
	private String address;
	private String phoneno;
	public Customer(String cusid,String name)
    {
        this.cusid=cusid;
        this.name=name;
    }
	public Customer(String cusid, String name, String address, String phoneno) {
		this.cusid = cusid;
		this.name = name;
		setAddress(address);
		setPhoneno(phoneno);
	}
	public String toString() {
		return "\n Customer Id:"+cusid+"\n Customer Name:"+name+"\n Customer Address:"+address+"\n Customer Phoneno:"+phoneno;
	}
	public String getCusid() {
		return cusid;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setAddress(String a) {
		address = a;
	}

	public void setPhoneno(String ph) {
		phoneno = ph;
	}

	
}

public class Product_Customer {

	public static void main(String[] args) {
		Customer cus=new Customer("As123","Ashiq","Erode","903487320");
		System.out.println(cus.getCusid());
		System.out.println(cus.getName());
		System.out.println(cus.getAddress());
		System.out.println(cus.getPhoneno());
		
		
		product pro =new product("KN456", "Pepsi",30,2);
		System.out.println(pro.getItemno());
		System.out.println(pro.getName());
		System.out.println(pro.getPrice());
		System.out.println(pro.getQuantity());
		
	}
}

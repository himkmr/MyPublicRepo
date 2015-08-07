
public class Book{
private String book_code;
private String title;
private String author;
private String description;
private double price;
private boolean isInStock;


public void set_Title(String t)
{
	title = t;
}
public void set_Book_Code(String t)
{
	book_code = t;;
}


public void set_Author(String auth)
{
	author = auth;
}

public void set_Description(String s)
{
	description = s;
}

public void set_Price(double p)
{
	price = p;
}


public void set_isInStock(boolean bool)
{
	isInStock = bool;
}

public String get_Book_Code()
{
	return book_code;
}

public String get_Title()
{
	return title;
}

public String get_Author()
{
	return author;
}

public String get_Description()
{
	return description;
}

public double get_Price()
{
	return price;
}


public boolean get_isInStock()
{
	return isInStock;
}

public double order_books(int number)
{
	double price = this.get_Price();	//get the price of the book
	if(this.isInStock)
	{
		return price*number;
		
	}

	return 0;	//if not oin Stock

}

}
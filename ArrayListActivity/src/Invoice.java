
import java.text.NumberFormat;
import java.util.ArrayList;


public class Invoice {
double total;	
ArrayList<LineItem> item_list;

public Invoice()
{
	total = 0;
	item_list = new ArrayList<LineItem>();

}


public void add_Item(String code, int quantity, double price)
{
	
	item_list.add(LineItem.getLineItem(code, quantity, price));
	total+=quantity*price;

}
public void  printInvoice()
{

	 String fmt2 = "%1$10s %2$25s %3$15s %4$15s  %5$15s";
	 String fmt = "%1$10s %2$25s %3$15s %4$15d  %5$15s";
	 System.out.format(fmt2, "Code", "Description", "Price", "Quantity", "Total");
	 System.out.println("");
	 System.out.format(fmt2, "------", "-------------------", "------------", "-------", "----------");
	 System.out.println("");
	for(LineItem elem:item_list)
	{
		System.out.format(fmt, elem.p.getCode(), elem.p.getDescription(), format_price(elem.p.getPrice()),
				elem.quantity,format_price(elem.totalPrice));
		System.out.println("");
		
	}
}
public String format_price(double price)
{
	NumberFormat currency = NumberFormat.getCurrencyInstance();
	 String priceString = currency.format(price);
	 return priceString;
	
	
}


public double getInvoiceTotal()
{
	return this.total;
}
}

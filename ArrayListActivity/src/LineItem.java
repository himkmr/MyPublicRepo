
public class LineItem {
int quantity;
Product p;
double totalPrice;

public static LineItem getLineItem(String code, int quantity, double price)
{	
	LineItem item = new LineItem();
	item.p = ProductDB.getProduct(code, price);
	item.quantity = quantity;
	item.totalPrice = quantity*price;
	return item;
}
}

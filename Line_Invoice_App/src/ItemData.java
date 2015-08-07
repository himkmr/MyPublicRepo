import java.text.NumberFormat;


/* this is our Item Data class, It holds the item data, price and taxable or not?
 * It doesn't do anything else
 */

public class ItemData {

	private String item_code;
	private double price;
	private boolean isTaxable;
	
	public String getItem_code() {
		return item_code;
	}
	public void setItem_code(String item_code) {
		this.item_code = item_code;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isTaxable() {
		return isTaxable;
	}
	public void setTaxable(boolean isTaxable) {
		this.isTaxable = isTaxable;
	}
	
	public static String formatPrice(double d)
	{
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		 String priceString = currency.format(d);
		 return priceString;
	}
	public static String formatQuantity(double quantity_array)
	{
		NumberFormat number = NumberFormat.getNumberInstance();
		 String quantityString = number.format(quantity_array);
		 return quantityString;
	}
	
	
}

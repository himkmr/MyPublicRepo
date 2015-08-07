/*
This class creates ItemData Object and uses its setters methods to set Data
*/
public class Item_Invoice {

	public static ItemData getItem(String code, boolean taxable, double price)
	{
		ItemData d = new ItemData();		// creating new ItemData class
		if(code.equals("book"))
		{		
			d.setPrice(100);				//setting fields using getter and setters methods
			d.setTaxable(taxable);
			d.setItem_code("Book");
		}
		if(code.equals("pen"))
		{
			d.setPrice(10);
			d.setTaxable(taxable);
			d.setItem_code("pen");	
					
		}
		if(code.equals("tv"))
		{
			d.setPrice(350);
			d.setTaxable(taxable);
			d.setItem_code("Television");	
					
		}
		else
		{
			d.setPrice(1000);
			d.setTaxable(taxable);
			d.setItem_code("Unknown Item");
		}
	
		return d;	
		
	}
	
}

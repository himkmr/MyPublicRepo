
/* 
 * This is our main InviceApp class that calls Item_invoice class's static method to get ItemData Object
 * It then stores it in an array bArray
 * Item quantity is stored in quantity array
 * Taxes and totals are computed later on
 * Everything uses setters and getter methods
 */

import java.util.Scanner;
public class InvoiceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double quantity_array[] = new double[20];
		ItemData []bArray = new ItemData[20];
		
		Scanner sc = new Scanner(System.in);
		double taxablesubtotal = 0;
		double untaxablesubtotal = 0;
		double tax = 0;

		boolean taxable = false;
		int index = 0;
		while(true)
		{
			taxable = false;
			System.out.println("Enter Item Code: book / pen / tv");
			String itemcode = sc.nextLine();
			if(itemcode.equals("") || itemcode.equals(" ") || itemcode.equals(null) || itemcode.length() < 2 ||itemcode.equals("\n"))
				break;
			
			
			System.out.println("Enter Item Quantity:  ");
			int qu = sc.nextInt();
			while(qu < 0 || qu >49 )
			{
				System.out.println("Out of Range Enter again");
				qu = sc.nextInt();
				
			}
			sc.nextLine();//trash
			quantity_array[index] = qu;
			System.out.println("Is it Taxable : (y/n)");
			String token = sc.nextLine();
			if(token.equalsIgnoreCase("y"))
				taxable = true;
			
			bArray[index] = Item_Invoice.getItem(itemcode, taxable);		
			index++;
		}
		
		//     Generate Invoice
		{
			int i = 0;
			for(i=0;i<index;i++)		//finds tax and prints out each Item
			{
				
				System.out.println("Item : " +bArray[i].getItem_code());
				System.out.println("price per item : " +ItemData.formatPrice(bArray[i].getPrice()));
				System.out.println("Quantity  : " +ItemData.formatQuantity(quantity_array[i]));
				if(bArray[i].isTaxable() == true)			//if Taxable calculate tax at 5%
				{
					taxablesubtotal += bArray[i].getPrice();
					double newtax = (5*bArray[i].getPrice())/100;
					System.out.println("Tax on this Item : "+ItemData.formatPrice(newtax));
					tax+=newtax;
					
				}
				else		//Not Taxable
				{
					untaxablesubtotal += bArray[i].getPrice();	
					System.out.println("Tax on this Item : $0");
				}				
				System.out.println("-------------------\n");			}
			
			//Print out final Totals
			
			System.out.println("Taxable Subtotal :"+ItemData.formatPrice(taxablesubtotal));
			System.out.println("UnTaxable Subtotal :"+ItemData.formatPrice(untaxablesubtotal));
			System.out.println("Tax: "+ItemData.formatPrice(tax));
			System.out.println("Grand Total :"+ItemData.formatPrice((taxablesubtotal +untaxablesubtotal+tax)));
					
		}
		
		
		sc.close();
		

	}

}

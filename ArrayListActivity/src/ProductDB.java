
public class ProductDB {
public static Product getProduct(String code, double price)
{
	Product p = new Product();
	p.setCode(code);
	p.setPrice(price);
	
	if(code.equalsIgnoreCase("java"))
		p.setDescription("Java for Beginnners");
	else if(code.equals("jsp"))
		p.setDescription("Java Servlet Programming");
	
	return p;
}
}

import java.text.NumberFormat;

public abstract class Product
{
    protected String code;
    protected String description;
    protected double price;
    protected static int count = 0;   // a protected 
    
    public Product()
    {
        code = "";
        description = "";
        price = 0;
    }
   
  
    public abstract String toString();
    public abstract boolean equals(Product p);  
 
    public String getFormattedPrice() {
    	
  	  NumberFormat currency = 
  	            NumberFormat.getCurrencyInstance();
  	        return currency.format(price);
		
	} 
    protected String getCode() {
		return code;
	}

    protected void setCode(String code) {
		this.code = code;
	}

    protected String getDescription() {
		return description;
	}

    protected void setDescription(String description) {
		this.description = description;
	}

    protected double getPrice() {
		return price;
	}

    protected void setPrice(double price) {
		this.price = price;
	}
 
    
    //Static methods
    public static void setCount(int count) {
		Product.count = count;
	}
	 public static int getCount()   
	 {                              
	      return count;
	 }

	public String getName() {
			return this.getClass().getName();
	}
      


}
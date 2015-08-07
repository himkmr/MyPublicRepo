

public class Software extends Product {
	
	private String programmer;
    private String platform; //linux, mac, or pc
    private String os; 
	
    public String getProgrammer() {
		return programmer;
	}
	public void setProgrammer(String programmer) {
		this.programmer = programmer;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}

	public String toString() {
		return "Code:        " + code + "\n" +
	               "Description: " + description + "\n" +
	               "Price:       " + price +"\n"+
	               "Programm:    " + programmer +"\n"+
	               "Platform:    " + platform +"\n"+
	               "OS:          " + os +"\n"+
	               this.getFormattedPrice() + "\n";
	}
	
	

	public boolean equals(Product p) {
		if(this.getDescription().equals(p.getDescription()))
			return true;
		else 
			return false;
	}

    
}
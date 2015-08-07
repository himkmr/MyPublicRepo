
public class Book extends Product {
    private String author;
    private int pages;
    public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	@Override
	public String toString() {
		return "Code:        " + code + "\n" +
	               "Description: " + description + "\n" +
	               "Price:       " + price +"\n"+
	               "Author:      " + author +"\n"+
	               this.getFormattedPrice() + "\n";
	}

	@Override
	public String getName() {
		return this.getClass().getName();
	}
	@Override
	public boolean equals(Product p) {
		return(this.getDescription().equals(p.getDescription()));
	}


}
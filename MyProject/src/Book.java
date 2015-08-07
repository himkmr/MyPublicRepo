public class Book extends Product
{
    private String author;

    public Book()
    {
    	super();
        count++;
        setCode("book");
        setDescription("Its a book");
        setPrice(100);
    }
    
    
    

    public void setAuthor(String author)
    {
        this.author = author;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Author:      " +
            author + "\n";
    }

    public String toString(String str)
    {
    	if(str.equals("simple"))
            return super.toString();
    	else//
    		 return super.toString()+ "Author:      " +
             author + "\n";
        
    }
    
    
}

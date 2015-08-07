public class Software extends Product
{
    private String version;

    public void setVersion(String version) {
		this.version = version;
	}

	public Software()
    {
        super();
        setCode("Software");
        setDescription("Its a Software");
        setPrice(50);
        count++;
    }
	
	
    public String getVersion()
    {
        return version;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Version:     " +
            version + "\n";
        
    }

    public String toString(String str)
    {
    	if(str.equals("simple"))
            return super.toString();
    	else//
    		 return super.toString()+ "Version: " +
            version + "\n";
        
    }
    
    

}
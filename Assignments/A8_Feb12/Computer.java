package support;

class Computer{
    String brand, color;
    int hddSize, ramSize, iD;
 
    Computer(int iD , String brand, String color, int hddSize, int ramSize){
        this.brand = brand;
        this.color = color;
        this.hddSize = hddSize;
        this.ramSize = ramSize;
        this.iD = iD;
    }
 	
 	public Integer getId()
 	{
 		return this.iD;
 	}

    public String getColor(){
        return this.color;
    }
 
    public String getBrand(){
        return this.brand;
    }
 
    public Integer getHddSize(){
        return this.hddSize;
    }
     
    public Integer getRamSize(){
        return this.ramSize;
    }
 

 	public void setColor(String color){
 		this.color = color;
 	}

 	public void setBrand(String brand){
 		this.brand = brand;
 	}

 	public void setHddSize(int hddSize)
 	{
 		this.hddSize = hddSize;
 	}

 	public void setRamSize(int ramSize){
 		this.ramSize = ramSize;
 		
 	}

 	

    @Override
    public String toString(){
        return "Computer : (" + this.getId()
        	+ ", " + this.getBrand()
            + ", " + this.getColor()
            + ", " + this.getHddSize()
            + ", " + this.getRamSize()
            + ")";
    }

 
}
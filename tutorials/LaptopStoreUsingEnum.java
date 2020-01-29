enum LaptopStyles{ LENOVO(35000),HP(45000),DELL(42000);

	private int cost;

	LaptopStyles(int cost)
	{
		this.cost = cost;
	}

	public int getLaptopStyles()
	{
		return this.cost;
	}
	
}

class LaptopStoreUsingEnum{
	public static void main(String[] args) {
		System.out.println("Dear customer Welcome to the store!!\n");

		System.out.println("These are the available laptops in our store :\n");
		for (LaptopStyles l : LaptopStyles.values() ) {
			System.out.println( l + " Laptop "+" with the price: $" + l.getLaptopStyles());
		}
	}
}
// Using an inheritance hierarchy, design a Java program to model items at a library (books, journal
// articles, videos and CDs.) Have an abstract superclass called Item and include common
// information that the library must have for every item (such as unique identification number, title,
// and number of copies). No actual objects of type Item will be created - each actual item will be
// an object of a (non-abstract) subclass. Place item-type-specific behavior in subclasses (such as
// a video's year of release, a CD's musical genre, or a book's author).
// More in detail:


abstract class Item{
		int iDNumber;
		String title;
		int copies;

		// abstract Item(int, String, int);

		abstract String getTitle();

		abstract void setTitle(String title);

		abstract int getIdentificationNumber();

		abstract void setIDNumber(int iDNumber);

		abstract int getCopies();

		abstract void setCopies(int copies);

}

class Books extends Item{

	String authorName;
	
	Books(int iDNumber, String title, int copies)
	{
		this.iDNumber = iDNumber;
		this.title = title;
		this.copies = copies;
	}

	@Override
	String getTitle()
	{
		return this.title;
	}


	@Override
	void setTitle(String title)
	{
		this.title = title;
	}
	@Override
	int getCopies()
	{
		return this.copies;
	}

	@Override
	void setCopies(int copies)
	{
		this.copies = copies;
	}

	@Override
	int getIDnumber()
	{
		return this.iDNumber;
	}

	@Override
	void setIDNumber(int iDNumber)
	{
		this.iDNumber = iDNumber;
	}

	void setAuthorName(String authorName)
	{
		this.authorName = authorName;
	}

	String getAuthorName()
	{
		return this.authorName;
	}
}

class Journals extends Item{

	
	Journals(int iDNumber, String title, int copies)
	{
		this.iDNumber = iDNumber;
		this.title = title;
		this.copies = copies;
	}

	@Override
	String getTitle()
	{
		return this.title;
	}

	@Override
	void setTitle(String title)
	{
		this.title = title;
	}
	@Override
	int getTCopies()
	{
		return this.copies;
	}

	@Override
	void setTCopies(int copies)
	{
		this.copies = copies;
	}

	@Override
	int getIDnumber()
	{
		return this.iDNumber;
	}

	@Override
	void setIDNumber(int iDNumber)
	{
		this.iDNumber = iDNumber;
	}

}

class CDs extends Item{

	int yearOfReleasing;
	
	CDs(int iDNumber, String title, int copies)
	{
		this.iDNumber = iDNumber;
		this.title = title;
		this.copies = copies;
	}

	@Override
	String getTitle()
	{
		return this.title;
	}

	@Override
	void setTitle(String title)
	{
		this.title = title;
	}
	@Override
	int getTCopies()
	{
		return this.copies;
	}

	@Override
	void setTCopies(int copies)
	{
		this.copies = copies;
	}

	@Override
	int getIDnumber()
	{
		return this.iDNumber;
	}

	@Override
	void setIDNumber(int iDNumber)
	{
		this.iDNumber = iDNumber;
	}

}

class Articles extends Item{

	int yearOfReleasing;
	Articles(int iDNumber, String title, int copies)
	{
		this.iDNumber = iDNumber;
		this.title = title;
		this.copies = copies;
	}

	@Override
	String getTitle()
	{
		return this.title;
	}

	@Override
	void setTitle(String title)
	{
		this.title = title;
	}
	@Override
	int getTCopies()
	{
		return this.copies;
	}

	@Override
	void setTCopies(int copies)
	{
		this.copies = copies;
	}

	@Override
	int getIDnumber()
	{
		return this.iDNumber;
	}

	@Override
	void setIDNumber(int iDNumber)
	{
		this.iDNumber = iDNumber;
	}

	void setYearOfReleasing(int yearOfReleasing)
	{
		this.yearOfReleasing = yearOfReleasing;
	}

	int getYearOfReleasing()
	{
		return this.yearOfReleasing;
	}

}

class Videos extends Item{

	Videos(int iDNumber, String title, int copies)
	{
		this.iDNumber = iDNumber;
		this.title = title;
		this.copies = copies;
	}

	@Override
	String getTitle()
	{
		return this.title;
	}

	@Override
	void setTitle(String title)
	{
		this.title = title;
	}
	@Override
	int getTCopies()
	{
		return this.copies;
	}

	@Override
	void setTCopies(int copies)
	{
		this.copies = copies;
	}

	@Override
	int getIDnumber()
	{
		return this.iDNumber;
	}

	@Override
	void setIDNumber(int iDNumber)
	{
		this.iDNumber = iDNumber;
	}

}

class Library{
	public static void main(String[] args) {
		Books a = new Books(12,"apple", 100);
		System.out.println(a.getTitle());
	}
}

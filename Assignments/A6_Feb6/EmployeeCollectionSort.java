

// 1. Add new emplyee
// 	- Enter Name
// 	- Enter Age

// 	So you want to add more?

// 	no, Sort?
// 		1. First name
// 		2. Last name
// 		3. age


import java.util.Scanner;

class EmployeeCollectionSort{

	int age;
    String name;
    String secondName;
    public static Scanner in = new Scanner(System.in);
	public static java.util.List EmployeeCollectionSortList = new java.util.ArrayList();
 
	    EmployeeCollectionSort(String name, String secondName, int age)
	    {
	        this.name = name;
	        this.secondName = secondName;
	        this.age = age;
	    }
 
   

	public static void main(String[] args) {
		
		details();
		System.out.println("List before sorting : " + EmployeeCollectionSortList);
		System.out.println("Do you want to sort the list?\n press 1: for YES \n press 2: for NO");
		int r = in.nextInt();
		if(r == 1)
			{
				in.nextLine();
				_sort();
				System.out.println("List After sorting : " + EmployeeCollectionSortList);

			}
		System.out.println("\nProgram is ended!...");
	}

		public static void details()
		{
			
			in.nextLine();
			System.out.println("Enter your Name");
			String name = in.nextLine();
			String[] a = name.split("\\s");
			String secondname = a[1];
			

			System.out.println("Enter your age");
			int age = in.nextInt();

			EmployeeCollectionSortList.add(new EmployeeCollectionSort(name,secondname,age));
			System.out.println("Do you want to add more EmployeeCollectionSorts in the list?? \n press 1: for YES \n press 2: for NO");
			int response = in.nextInt();
			if(response == 1)
				details();
			else
				System.out.println("EmployeeCollectionSorts are added to the list");
		}

		public static void _sort()
		{
			System.out.println("Press 1 for sorting by first name \n Press 2 for sorting by second name\n Press 3 for sorting by age");
			int response = in.nextInt();
			if(response == 1)
			{
				java.util.Collections.sort(EmployeeCollectionSortList, new sortFirstname());
				System.out.println("Do you want to continue?? \nPress 1: for YES \nPress 2: for NO");
				int r = in.nextInt();
				if(r == 1)
					details();
				
			}
			else if(response == 2)
			{
				java.util.Collections.sort(EmployeeCollectionSortList, new sortSecondname());
			}
			else
				java.util.Collections.sort(EmployeeCollectionSortList, new sortAge());
		}

		public Integer getAge()
		{
	        return this.age;
	    }
	 
	    public String getName()
	    {
	        return this.name;
	    }

	    public String getSecondname()
	    {
	        return this.secondName;
	    }
	 
	    @Override
	    public String toString()
	    {
	        return this.getName();
	    }

}





class sortFirstname implements java.util.Comparator{
	@Override 
	public int compare(Object firstObj, Object secondObj)
		{
			return (((EmployeeCollectionSort)firstObj).getName()).compareTo(((EmployeeCollectionSort)secondObj).getName());
		}
}

class sortSecondname implements java.util.Comparator{


	@Override 
	public int compare(Object firstObj, Object secondObj)
		{
			return (((EmployeeCollectionSort)firstObj).getSecondname()).compareTo(((EmployeeCollectionSort)secondObj).getSecondname());
		}
}

class sortAge implements java.util.Comparator{
	@Override 
	public int compare(Object firstObj, Object secondObj)
		{
			return (((EmployeeCollectionSort)firstObj).getAge()).compareTo(((EmployeeCollectionSort)secondObj).getAge());
		}
}
  

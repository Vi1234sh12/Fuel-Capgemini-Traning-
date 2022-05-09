// Java program to illustrate Custom ArrayList

// Importing ArrayList class from java.util package
import java.util.ArrayList;
import java.util.*;


// Class 1
// Outer class
// Main class
// CustomArrayList
class GFG {

	// Custom class which has data type class has
	// defined the type of data ArrayList
	// size of input 4
	int n = 4;

	// Class 2
	// Inner class
	// The custom datatype class
	class EmployeeData {

		// Global variables of the class
		int id;
		String name;
		String address;
		double sal;

		// Constructor has type of data that is required
		EmployeeData(int id, String name, String address, double sal)
		{

			// Initialize the input variable from main
			// function to the global variable of the class

			// this keyword refers to current instance
			this.id = id;
			this.name = name;
			this.address = address;
			this.sal = sal;
		}
	}

	// Method 1
	// Main driver method
	public static void main(String args[])
	{

		// Custom input data
		int id[] = { 101, 201, 301, 401 };
		String name[]
			= { "Shubham", "Atul", "Ayush", "Rupesh" };
		String address[] = { "xyz","abc","asd","dfg" };
		double  sal[] = {1200.00, 1100.00,
						600.00, 900.00 };

		// Creating an object of the class
		GFG custom = new GFG();

		// Now calling function to add the values to the
		// arraylist
		custom.addValues(id, name, address,sal);
            
            
	}

	public void addValues(int id[], String name[],
						String address[], double sal[])
	{
		// local custom arraylist of data type
		// Data having (int, String, String, double) type
		// from the class
		ArrayList<EmployeeData> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			// create an object and send values to the
			// constructor to be saved in the Data class
			list.add(new EmployeeData(id[i], name[i], address[i],sal[i]));
		}

		// after adding values printing the values to test
		// the custom arraylist
		printValues(list);
      
	}

	// Method 2
	// To print the values
	public void printValues(ArrayList<EmployeeData> list)
	{

		// list- the custom arraylist is sent from
		// previous function

		for (int i = 0; i < n; i++) {

			// Data received from arraylist is of Data type
			// which is custom (int, String, String, double)
			// based on class Data
			EmployeeData data = list.get(i);

			// Print and display custom ArrayList elements
			// that holds for Employee attribute

			// Data variable of type Data has four primitive
			// datatypes id -int name- String address- String
			// sal- double
         System.out.println("Enter the Employee ID : ");
         Scanner sc = new Scanner(System.in);
         int ids = sc.nextInt();
         
         if(ids == data.id )
         {
         
			System.out.println(data.id + " " + data.name
							+ " " + data.address + " "
							+ data.sal);
                     
          }else {
          
          System.out.println("Sorry! , Employee Details are not available ");
          }
		}
      
      
      
	}
}

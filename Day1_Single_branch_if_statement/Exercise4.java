import java.io.*;

public class Exercise4 
{ 
	
		public static void main (String[] args) throws IOException
	{ 
		
		System.out.println("****************************"); 
      System.out.println("How long should you heat it?"); 
      System.out.println("****************************"); 
		
		//creates a buffered reader
		InputStreamReader inStream = new InputStreamReader (System.in);
        BufferedReader stdin = new BufferedReader (inStream);
        
		//declares variables
      String inData, inData2;
		int items, time1, time4;
		double time, time2, time3;
		time2 = 1.25; //assigns value to variables
		time3 = 1.5;
		time4 = 2;
		
		System.out.println("Enter number of items in the microwave:");
		inData = stdin.readLine (); //gets user input as a string
		items = Integer.parseInt(inData);//changes string value to integer
		
		System.out.println("Enter time (in seconds) to heat 1 item in the microwave:");
		inData2 = stdin.readLine (); //gets user input as a string
		time1 = Integer.parseInt(inData2);//changes string value to integer
		
		switch (items) {
            case 1://if number of items is 1  
			time = time1;
			System.out.println("Heat total items for: " + time + " seconds");
                     break;
            case 2://if number of items is 2
			time = time1 * time2;
			System.out.println("Heat total items for: " + time + " seconds");
                     break;
            case 3: //if number of items is 3 
			time = time1 * time3;
			System.out.println("Heat total items for: " + time + " seconds");
                     break;
			default: //if number of items is greater than 3
			System.out.println("WARNING: Heating more than four items at once is not recommended!");
                     break;
        }
	}
}
/*

A student portal provides user to register their profile. During registration the system needs to validate 
the user should be located in India. If not the system should throw an exception. Step 1: Create a user 
defined exception class named �InvalidCountryException�. Step 2: Overload the respective constructors. 
Step 3: Create a main class �UserRegistration�, add the following method, registerUser� The parameter 
are String username,String userCountry and add the following logic, � if userCountry is not equal to 
�India� throw a InvalidCountryException with the message �User Outside India cannot be registered� � if 
userCountry is equal to �India�, print the message �User registration done successfully� Invoke the 
method registerUser from the main method with the data specified and see how the program behaves, 
Name Country Expected Output Mickey US InvalidCountryException should be thrown. The message 
should be �User Outside India cannot be registered� Mini India The message should be �User 
registration done successfully� Sample Input and Output
Exception Handling: User Defined Exception & throw


*/

import java.util.*;  // import java.util.function 

public class InvalidCountryException extends Exception {
	public InvalidCountryException() {
		System.out.println("InvalidCountryException occured");
		System.out.println("User Outside India  cannot be registered");
	}
}

public class UserRegistration  {
public static void main(String[] args)
{

 public void registerUser(String username, String userCountry) throws InvalidCountryException {
		if (!userCountry.equals("India"))
			throw new InvalidCountryException();
		else
			System.out.println("User registration done successfully");
         	
	} //End registerUser  Method 

}  // End main Method 
} // End Class 

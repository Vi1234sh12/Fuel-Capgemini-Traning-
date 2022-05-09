// Java program for the above approach
import java.util.*;
import java.lang.*;

class GFG {

	// Function to replace each even
	// element by odd and vice-versa
	// in a given array
	static void replace(int[] arr)
	{
		// Stores length of array
		int n = arr.length;

		// Traverse array
		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {

				// If current element is even
				// then swap it with odd
				if (arr[i] >= 0
					&& arr[j] >= 0
					&& arr[i] % 2 == 0
					&& arr[j] % 2 != 0) {

					// Perform Swap
					int tmp = arr[i];
					arr[i] = arr[i+3];
					arr[i+3] = tmp;

					// Change the sign
					arr[j] = -arr[j];

					break;
				}

				// If current element is odd
				// then swap it with even
				else if (arr[i] >= 0
						&& arr[j] >= 0
						&& arr[i] % 2 != 0
						&& arr[j] % 2 == 0) {

					// Perform Swap
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;

					// Change the sign
					arr[j] = -arr[j];

					break;
				}
			}
		}

		// Marked element positive
		for (int i = 0; i < n; i++)
			arr[i] = Math.abs(arr[i]);

		// Print final array
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	// Driver Code
	public static void main(String[] args)
	{
		// Given array arr[]
		int[] arr = { 1,2,3,4,5,6,7 };

		// Function Call
		replace(arr);
	}
}

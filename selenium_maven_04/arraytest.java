package selenium_maven_04;



public class arraytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//second largest element from an array
		int arr[] = { 14, 46, 50, 80, 92, 50, 48, 36, 66, 85 };
		int largest = arr[0];
		int secondLargest = arr[0];
		System.out.println("The given array is:" );
		for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+"\n");
		}
		for (int i = 0; i < arr.length; i++) {
		if (arr[i] > largest) {
		secondLargest = largest;
		largest = arr[i];
		} 
		else if (arr[i] > secondLargest) {
		secondLargest = arr[i];
		}
		}
		System.out.println("\nSecond largest number is:" + secondLargest);
		}	}



import java.util.Arrays;

public class Challenges {
    public static void main(String[] args) {
        int[] arr = {23, 12, 65, 78, 56};
         // int[] arr = {11, 12, 66, 78, 96};
        int num = 78;
        int delNum = 65;
        int sumOfArray = SUM(arr);
        double avgOfArray = AVG(arr);
        int occurence = OCCELEM(arr, num);
        int findMinNum = findMin(arr);
        int findMaxNum = findMax(arr);
        boolean checkArrayOrder = checkArray(arr);
        int[] arrayAfterDel = deleteElem(arr, delNum);
        int reverseArray = reverseArr(arr);


        System.out.println("The sum of your array is " + sumOfArray);
        System.out.println("The average of your array is " + avgOfArray);  
        System.out.println("Your chosen number occurred " + occurence + " times");  
        System.out.println("The min element is: " + findMinNum + " and the max element is "+findMaxNum);  
        System.out.println("Your array is Sorted  = "+ checkArrayOrder);
      System.out.println("Your array after deletation  = " + Arrays.toString(arrayAfterDel));
      System.out.println("Your reversed array is "+reverseArray);

    }

    // Task 1: Sum of elements in array
    public static int SUM(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum; 
    }

    // Task 2: Average of elements in array
    public static double AVG(int[] arr) {
        int avg = 0;
        for(int i = 0; i < arr.length; i++) {
            avg += arr[i];
        }
        return avg / (double)arr.length; 
    }

    // Task 3: Number of occurrences of an element in array
    public static int OCCELEM(int[] arr, int num) {
        int count = 0;
        boolean found = false;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                count++;
                found = true;
            } 
        }
        if(!found) {
            System.out.println("There is no occurrence of your chosen number");
        }
        return count;
    }

    // Task 4: Find minimum element
    public static int findMin(int[] arr) {
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

     // Task 4: Find minimum element
    public static int findMax(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

  

    // Task 5: Check array is sorted or not

    public static boolean checkArray(int[] arr){
    	boolean isSorted = true;

    	for(int i = 0; i < arr.length - 1; i++){
    		if(arr[i] > arr[i+1]){
    			isSorted = false;
    			break;
    		}
    	}
    	return isSorted;
    }

   // Task 6: delete a specific element 

public static int[] deleteElem(int[] arr, int delNum) {
    // First, find if element exists and its position
    int count = 0;
    for (int value : arr) {
            if (value == delNum) {
                count++;
            }
        }
    
     if (count == 0) {
            return arr;  
        }
    
   int[] newArr = new int[arr.length - count];
   int newIndex = 0;
    
 for (int value : arr) {
            if (value != delNum) {
                newArr[newIndex] = value;
                newIndex++;
            }
        }

        return newArr;
    }
 

   // Task 7: reverse an array  

    public static int reverseArr(int[] arr){
    	int[] reverseArr;

        for(int i = 0 ; i < arr.length; i++){
        	reverseArr[i] = arr[arr.length-i-1]
        }

        return reverseArr;
    	


    }













}
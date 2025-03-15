import java.util.Arrays;

public class Challenges {
    public static void main(String[] args) {
        int[] arr = {11, 12, 66, 78, 96};
        int[] arr1 = {11, 12, 13};
        int[] arr2 = {15, 16, 17};
        int[][] arr3 = {
        	{15, 16, 18}, 
        	{34, 54, 12}, 
        	{10, 22, 12}};
        int findNum = 34;
        int num = 78;
        int delNum = 65;

        int sumOfArray = SUM(arr);
        double avgOfArray = AVG(arr);
        int occurence = OCCELEM(arr, num);
        int findMinNum = findMin(arr);
        int findMaxNum = findMax(arr);
        boolean checkArrayOrder = checkArray(arr);
        int[] arrayAfterDel = deleteElem(arr, delNum);
        int[] reverseArray = reverseArr(arr);
        boolean checkPalindromeStatus = checkPalindrome(arr);
        int[] mergedArray = mergeTwoSortedArrays(arr1, arr2);
        int[] result = SearchElemIn2D(arr3, findNum);
        int[] Average2DArray = Average2D(arr3);
        int[] DiagonalSum2D = DiagonalSum2D(arr3);

        System.out.println("The sum of your array is " + sumOfArray);
        System.out.println("The average of your array is " + avgOfArray);
        System.out.println("Your chosen number occurred " + occurence + " times");
        System.out.println("The min element is: " + findMinNum + " and the max element is " + findMaxNum);
        System.out.println("Your array is Sorted  = " + checkArrayOrder);
        System.out.println("Your array after deletation  = " + Arrays.toString(arrayAfterDel));
        System.out.println("Your reversed array is " + Arrays.toString(reverseArray));
        System.out.println("Your array is Palindrome  = " + checkPalindromeStatus);
        System.out.println("Merged array: " + Arrays.toString(mergedArray));

        if (result[0] != -1) {
            System.out.println("Element " + findNum + " found at row: " + result[0] + ", column: " + result[1]);
        } else {
            System.out.println("Element " + findNum + " was not found");
        }

      System.out.println("Sum of 2D array: " + Average2DArray[0]);
       System.out.println("Sum of two diagnolal elements: " + Arrays.toString(DiagonalSum2D));
    }

    // Task 1: Sum of elements in array
    public static int SUM(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    // Task 2: Average of elements in array
    public static double AVG(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return (double) sum / arr.length;
    }

    // Task 3: Number of occurrences of an element in array
    public static int OCCELEM(int[] arr, int num) {
        int count = 0;
        for (int value : arr) {
            if (value == num) {
                count++;
            }
        }
        return count;
    }

    // Task 4: Find minimum element
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    // Task 4: Find maximum element
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    // Task 5: Check array is sorted or not
    public static boolean checkArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Task 6: delete a specific element
    public static int[] deleteElem(int[] arr, int delNum) {
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
                newArr[newIndex++] = value;
            }
        }
        return newArr;
    }

    // Task 7: reverse an array
    public static int[] reverseArr(int[] arr) {
        int[] reverseArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverseArr[i] = arr[arr.length - i - 1];
        }
        return reverseArr;
    }

    // Task 8: check array is isPalindrome or not
    public static boolean checkPalindrome(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    // Task 9: merge two sorted arrays
    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        int[] mergedArr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                mergedArr[k++] = arr1[i++];
            } else {
                mergedArr[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            mergedArr[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            mergedArr[k++] = arr2[j++];
        }
        return mergedArr;
    }

    // Task 10: Search an element in 2D array
    public static int[] SearchElemIn2D(int[][] arr3, int findNum) {
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                if (arr3[i][j] == findNum) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }



    // Task 11:  average and Sum of all element in a 2D array
     public static int[] Average2D(int[][] arr3) {
     	int sum = 0;
     	int count = 0;
     	for(int[] value : arr3){
     		for(int values : value){
     			sum += values;
     			count++;
     		}
     	}
    return new int[]{sum, sum/count}; 
    }


 // Task 12: sum of two diagnolal elements
    public static int[] DiagonalSum2D(int[][] arr3) {
    int primaryDiagonal = 0;   
    int secondaryDiagonal = 0;  
    
    for(int i = 0; i < arr3.length; i++) {
        primaryDiagonal += arr3[i][i];                     
        secondaryDiagonal += arr3[i][arr3.length-1-i];   
    }
    
    return new int[]{primaryDiagonal, secondaryDiagonal};
}



}
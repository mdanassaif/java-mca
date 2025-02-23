import java.util.Scanner;

public class Sort{
    public static void main(String args[]){
        int[] a = new int[6];

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            a[i] = scan.nextInt();
        }

        System.out.println("Before sorting \n");
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);;
        }

        System.out.println("After Sorting");
        int temp;
        for(int i=0; i < a.length; i++){
            for(int j=i+1; j < a.length; j++){
            if(a[i] > a[j]){
                temp = a[i]; 
                a[i] = a[j];
                a[j] = temp;

            }
        }
        }
      for(int i=0; i < a.length; i ++){
        System.out.println(a[i]);;
      }
    }
}
public class PrintODDandEVEN{
    public static void main(String args[]){
        int[] arr = new int[20];

        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }

        System.out.println("The EVEN Numbers are :");

        for(int i=0; i < arr.length; i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }

        System.out.println("The ODD Numbers are :");

        for(int i=0; i < arr.length; i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }





    }
}
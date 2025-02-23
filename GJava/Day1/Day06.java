 
public class Day06{
    public static void main(String[] args){
        

        // Declare and intitializing an array of strings

        String[] names = {"Anas","Mahtab","Hamid"};

        // loping throught the array and prnting each name
        // for(int i=0; i< names.length; i++){
        //     System.out.println(names[i]);
        // }

        // Enhanced for loop ( for-each loop)
        for(String name : names){
            System.out.println(name);

        }
    }
}
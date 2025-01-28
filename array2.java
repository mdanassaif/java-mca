import java.util.*;

class ArrayTwo{
    public static void main(String arg[]) {
        List<String> names = new ArrayList(); 
        names.add("Mahtab");
        names.add("Yassar");
        names.add("Hamid");
        names.add("Anas");
        names.add("King");
        
        System.out.println("My Names: " + names);  
        
        Collections.sort(names); 
        
        System.out.println("Sorted names list: " + names);  
    }
}

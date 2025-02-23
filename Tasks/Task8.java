//Command Line Argument Program.

public class Task8 {
    public static void main(String args[]) {
       
        System.out.println("--------------");        
        System.out.println("CMDL Args are ");
        System.out.println("--------------");

        for (int i = 0; i < args.length; i++) {
            System.out.println("args " + (i + 1) + " = " + args[i]);
        }
    }
}

// Nested Classes (local, static, non-static, Anonymous)

public class Task16 {

    private int outerVariable = 10;
    private static int staticOuterVariable = 20;

    // Static Nested Class
    static class StaticNested {
        void display() {
            System.out.println("Static Nested Class: staticOuterVariable = " + staticOuterVariable);
            // Cannot access outerVariable directly (non-static)
            // System.out.println("Static Nested Class: outerVariable = " + outerVariable); // Error
        }
    }

    // Non-Static Nested Class (Inner Class)
    class NonStaticNested {
        void display() {
            System.out.println("Non-Static Nested Class: outerVariable = " + outerVariable);
            System.out.println("Non-Static Nested Class: staticOuterVariable = " + staticOuterVariable);
        }
    }

    void outerMethod() {
        // Local Class
        class LocalClass {
            void display() {
                System.out.println("Local Class: outerVariable = " + outerVariable);
                System.out.println("Local Class: staticOuterVariable = " + staticOuterVariable);
            }
        }

        LocalClass local = new LocalClass();
        local.display();

        // Anonymous Class (Implementation of an interface or extending a class)
        Runnable anonymousRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Runnable: outerVariable = " + outerVariable);
                System.out.println("Anonymous Runnable: staticOuterVariable = " + staticOuterVariable);
            }
        };

        anonymousRunnable.run();
    }

    public static void main(String args[]) {
        System.out.println("HelloWorld");

        Task16 outer = new Task16();

        // Static Nested Class Usage
        Task16.StaticNested staticNested = new Task16.StaticNested();
        staticNested.display();

        // Non-Static Nested Class Usage
        Task16.NonStaticNested nonStaticNested = outer.new NonStaticNested(); // Need an outer instance
        nonStaticNested.display();

        // Local and Anonymous Class usages
        outer.outerMethod();
    }
}
public class Hello {
    public static void countDown(int num) {
        // Stop when num is 0
        if (num == 0) {
            System.out.println("Finished!");
            return;
        }
        // Show the number and ask again with a smaller number
        System.out.println(num);
        countDown(num - 1); // Call myself with num - 1
    }

    public static void main(String[] args) {
        countDown(3); // Start with 3
    }
}
// lets make an array in ascending order with using bubble sorting method

class SortAscending {
    public static void main(String[] args) {
        int[] arrBoi = new int[] {225, 23, 80, 17, 13}; 
        int tempValue = 0;

        System.out.println("Original Array ");
        for (int i = 0; i < arrBoi.length; i++) {
            System.out.print(arrBoi[i] + " ");
        }
        System.out.println();
 
        for (int i = 0; i < arrBoi.length; i++) {
            for (int j = i + 1; j < arrBoi.length; j++) {
                if (arrBoi[i] > arrBoi[j]) {
                    tempValue = arrBoi[i];
                    arrBoi[i] = arrBoi[j];
                    arrBoi[j] = tempValue;
                }
            }
        }

        System.out.println("Array with ascending ordered");
        for (int i = 0; i < arrBoi.length; i++) {
            System.out.println(arrBoi[i]);  
        }
    }
}

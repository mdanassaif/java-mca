class MatrixAddition {
    public static void main(String[] args) {
		
        int[][] matr1= { { 1, 2, 3}, { 12, 11, 10 }, { 12, 5, 5} };
        int[][] matr2= { { 6, 5, 4}, { 7, 8, 9 }, { 3, 12, 10} };
        int rows = matr1.length;
        int cols = matr1[0].length;
        int[][] addMatrix = new int[rows][cols];


        for (int i = 0; i < rows; i++) {
           for (int j = 0; j < cols; j++) {
                addMatrix[i][j] = matr1[i][j] + matr2[i][j];

            }
         }
        System.out.println("Addition (matr1 + matr2):");
        for (int i = 0; i < rows; i++) {
          for (int j = 0; j < cols; j++) {
                System.out.print(addMatrix[i][j] + " ");
          }
         System.out.println();
}
}
}
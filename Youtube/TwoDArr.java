public class TwoDArr{
	public static void main(String[] args){


	int[][] arrD1 = new int[3][2];
	int[][] arrDValue = {{12,43}, {34, 15}, {4, 5, 6}};


int i = 0;
while(i < arrDValue.length){
	int j = 0;
	while(j < arrDValue[i].length){
		System.out.print(arrDValue[i][j] + " ");
		j++;
	}
	System.out.println();
	i++;
	}
}
}
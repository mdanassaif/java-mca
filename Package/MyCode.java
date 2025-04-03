import myPack.Add;
import myPack.Minus;

public class MyCode{
	public static void main(String[] args){
		Add addNum = new Add();
		Minus minusNum = new Minus();

		int sum = addNum.add(2,5);
		int diff = minusNum.minus(6,5);

		System.out.println("Sum:"+sum);
		System.out.println("Minus: "+diff);
	}
}
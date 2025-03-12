// Local Nested Class:
package programs2025;
public class OuterClassFour
{
	private int data=30;
	void display()
	{
		class LocalNestedClass // Local Nested class cann't be private, public or protected.
		{
			void message()
			{
				System.out.println(data);
			}
		}
		LocalNestedClass lnc=new LocalNestedClass();
		lnc.message();
	}
	public static void main(String args[])
	{
		OuterClassFour ocf=new OuterClassFour();
		ocf.display();		
	}
}

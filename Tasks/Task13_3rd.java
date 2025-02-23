
// Hierarchical Inheritance 
// Multiple child classes inherit from the same parent class.


class Education{
	void doStudy(){
		System.out.println("Study make you educated");
	}
}

class OnlineClass extends Education{
	void attendOnlineClass(){
		System.out.println("Online classes make you less educated");
	}
}

class OfflineClass extends Education{
	void goOfflineClass(){
		System.out.println("Offline classes make your more educated");
	}
}





class Task13_3rd{
	public static void main(String args[]){

		OnlineClass class1 = new OnlineClass();
		class1.doStudy();
		class1.attendOnlineClass();

		OfflineClass class2 = new OfflineClass();
		class2.doStudy();
		class2.goOfflineClass();

	}
}
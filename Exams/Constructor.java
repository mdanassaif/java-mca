class BoysData {
	int number;
	String name;

	// Default Constructor
	BoysData(){
		System.out.println("From default Constructor");
		this.number = 101;
		this.name = "Mohd";
	}
    
    // Parentherized Constructor
	BoysData(int number, String name){
		System.out.println("From parameterized Constructor");
		this.number = number;
		this.name = name;
	}
}


class Constructor{
	public static void main(String args[]){
		BoysData obj1 = new BoysData();
		System.out.println(obj1.number);
		System.out.println(obj1.name);

		BoysData obj2 = new BoysData(20, "Mohd");
		System.out.println("parameterized number is "+obj1.number);
		System.out.println("parameterized name is "+obj1.name);


	}
}
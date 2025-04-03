public class Lesson1{
	public static void main(String args[]){
		System.out.println("Yes");
	}
}


/////////////////////////////////////////////////////////////

/*
Process when we compling and executing the java source code

first we need to use javac command 

like : javac Lesson1.java ( JAVA COMPILER)

then Lesson1.class will be created which known as "Byte Code"

and then need to write "java Lesson1" which will run the code ( IT WILL EXECUTE ON JVM)

*/

/////////////////////////////////////////////////////////////

/*
public class Lesson1{

	public static void main(String[] args){

		System.out.println("Yes");
	}
}

public - everyone can access it ( JVM CAN ACCESS TO RUN IT)
class - it is class
Lesson1 - name of class

static - 
void - the return type, void means there is no "return value"
main - the name of this method

why main ?
...................................................................
Main method has a fixed signature: public static void main ( String[ args])
It's the entry point of a java program wheer the executaion starts without 
the main method. the java virtual machone does not know where to begin running the code.
```````````````````````````````````````````````````````````````````

String[] - arguments to the method, this method must be given an array of Strings and the array called as args


System.out.println - this says print to standard output ( defaults to command line)

semicolons are the end of any statements, keep in mind it.


*/

/////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////
///////////////////////JDK VS JVM VS JRE ////////////////////
/////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////


/*

JDK - Java Development Kit
```````````````````````````
1) It's a software development kit required to develop java applications.
2) Includes the JRE, an interpreter/loader (Java), a compiler( javac ), a ( javadoc) and other tools needed for java developement.
3) Essentially, JDK is superset of JRE.

JRE - Java Runtime Environemnt
```````````````````````````````
1) its a part of the JDK but can be downloaded seprately.
2) Provides the libraries. the JVM and other componnets to run applications.
3) Does not have toold and utilities afor developers like compilers or debuggers.


JVM - Java Virtual Machine
```````````````````````````
1) It's a part of JRE and responsible for executing the bytecode.
2) Ensures Java's write-once-run-anywhere capability
3) Not platform independent : a different JVM is needed for each type of OS


*/











































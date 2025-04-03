// Data Types, Variables and Input

/*

1. Variable
`````````````
Variables are like containers used for storing data values. 

What exactly are containers? 

First of all, variables are represented as 0s and 1s. 

When storing variables, the computer reserves a memory spot 

where the data is encoded in binary,

making it easy to retrieve or update.

-----------------------------------
| int age = 20;                    |
|                                  |
| Data_Type variable_name = value; |
|                                  |
-----------------------------------

Reserverd memeory for variable = 20 in RAM



2. Data Types
```````````````
  _______________|_______
  |                     |
  Primitive           Non-Primitive
  _____|_______            _____|________
 |            |            |||-> Strings, arrays, objects etc     
 Boolearn     Numeric
  |         ______|_____
 boolearn   |           |
         Character   Integral
           |        ______|________________
          char     |                      |
                 Integer            Floatting Point
         ___________|___________        ______|________
         |     |        |      |       |              |
        Byte  Short    Int    Long    Float         Double


*/


public class Lesson2{
	public static void main(String[] args){
		int myNumber = 324;
		int yourNumber = 909;
		System.out.println(yourNumber); // output : 909
		yourNumber = 564;
		System.out.println(yourNumber); // output : 564

		float myFloat = 5;
	    System.out.println(myFloat); // output : 5.0
		double myDouble = 6.8463;
		System.out.println(myDouble); // output : 6.8463

		boolearn isAlive = true;
	    System.out.println(isAlive); // output : true

	    String expressions = "Hurray, Daleem is yum!";
	    System.out.println(expressions); // output : Hurray, Daleem is yum!


	}
}


/*

3. naming Converntions
```````````````````````
a) camelCase --> eg: myVariableName
b) snake_case --> eg: my_variable_name
c) kebab-case --> eg: my-variable-name

Keep a Good and Short Name

JAVA IDENTIFIER RULES
~~~~~~~~~~~~~~~~~~~~~~
a) all alphanumeric char : A-Z, a-z , 0-9, $ and _ .
b) cant use keywords or reserved words
c) Identifiers should not start with digits[0-9]
d) Java Identifiers are case sensitive
e) there is no limit on the length of the identifier but it is 
   advisable to use an optimum length of 4-15 letters only.




4. Literlas
~~~~~~~~~~~~
Integer literlas -> 10, 5, -8 etc
FLoating-point literlas -> 1,2, 0.25, -1.999 etc
Boolearn literlas --> true, false
Character literlas --> 'a', 'A', 'N', 'U' etc
String literlas --> "Hi", "Hello", "World" etc


int age = 19;
datatype identifier = literlas;



5. Keywords
~~~~~~~~~~~~~~

You cannot use any of the following as identifiers in your programs.
The keywords const and goto are reserved, even though they are not currently used.

abstract	continue	for	new	switch
assert***	default	goto*	package	synchronized
boolean	do	if	private	this
break	double	implements	protected	throw
byte	else	import	public	throws
case	enum****	instanceof	return	transient
catch	extends	int	short	try
char	final	interface	static	void
class	finally	long	strictfp**	volatile
const*	float	native	super	while



6. Escape Sequences
~~~~~~~~~~~~~~~~~~~~~

\t --> insert a tab in the text at the point
\b --> insert a backspace in the text at this point
\n--> Insert a newline in the text at this point
\' --> insert a signle quote character in the text at this point
\" --> insert a double quote character in the text at this point
\\ --> insert a backslash character in the text at this point 



7. User Input 
~~~~~~~~~~~~~~~

Scanner --> java.util.Scanner ( supporting class in JRE )

Scanner input = new Scanner(System.in);
(refrence of Scanner class )

String name = input.nextLine();

System.out.println("Your name is "+name);


8. Type Conversion and casting
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


Automatic type conversation widening - implicit 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

_____________________________________________________
byte --> short --> int --> lomg --> float --> double
-----------------------------------------------------

float myFloat = 5 ; ✅ | big box can contain small box
float myFloat = 5d ; ❌ | small box can't contain big box
int myInt = 5.0f; ❌ | small box can't contain big box


Narrowing ( explicit )
~~~~~~~~~~~~~~~~~~~~~~

int myInt = 5.0f; ❌ | small box can't contain big box

to make this possible we can do 

int myInt = (int) 5.0f; ✅



_____________________________________________________
byte <-- short <-- int <-- long <-- float <-- double
-----------------------------------------------------




*/
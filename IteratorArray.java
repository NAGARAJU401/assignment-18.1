package iterator;
//Package is a grouping of related types providing access protection and name

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorArray {
	//public : members which can access as public,public members are visible to all other classes.
			//class : is a context of java that are used to create objects and to define object data types and methods.
			//classes are the basics of opps(object oriented programming)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
		//static used to prepare a field,method or inner classes as a class field.
		//void: it is void if the method does not return a value.
	//main:it is a function name When a program starts running, it has to start execution from somewhere.
		//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.

		//here I'm creating an array list to add String elements so I made it of string type 
	      
				//ArrayList<String>() : this will create an empty list with initial capacity of 5.
				
				ArrayList<String> studentList = new ArrayList<String>();
				
				studentList.add("nag"); //here I'm adding 5 elements to the array list 
				studentList.add("priya");          //  we are using the add method to add objects to the array list:
				studentList.add("sudha");
				studentList.add("srujan");
				studentList.add("tarini");
				
				 Iterator <String> listIterator = studentList.iterator();//getting Iterator from array list to traverse elements  
			   
				 while (listIterator.hasNext()){       // object next() :it returns the element and moves the cursor pointer to next element.
					
					 String student = (String)listIterator.next(); //traversing elements of ArrayList object  
					
					 if (student.equals("priya")){
						 listIterator.remove();
				//remove(int index) method of arraylist removes the element at the specified position(index) in the list.
						 System.out.println("priya is removed");//here in the output it shows supriya instead of we removed it after this interation it will be removed
						//system : system is a class in java language.lang package
						  	//out : out is the static member of system class.It's type PrintStream
						  	//println: which is used to print the output.

					 }
					 
			       System.out.println(student);  
			       //system is final class
				      //out is a static member of system class and type printStream
				      //println is method of printStream class.ln means nextline
			  }
	}

}

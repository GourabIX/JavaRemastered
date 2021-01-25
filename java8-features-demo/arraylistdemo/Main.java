/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

class Student {
    int rollNo;
    String name;
    
    Student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
        
    }
}

public class Main
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(101,"Gourab");
		Student s2 = new Student(102,"Himanshu");
		
		List<Student> batch = new ArrayList<Student>();
		
		batch.add(s1);
		batch.add(s2);
		
		List<String> stringList = new ArrayList<String>();
		stringList.add("Gourab");
		stringList.add("Himanshu");
		stringList.add("clone");
		
		// printing of elements of an arrayList using for loop
		
		for(Student student: batch)
		{
		    System.out.println(student.rollNo + " -- " + student.name);
		}
		
		// printing of elements of an arrayList using iterator
	
		Iterator itr = batch.iterator();
		while(itr.hasNext())
		{
		    Student student = (Student) itr.next();                         // prints hashCode for user-defined classes
		    System.out.println(student.rollNo + " || " + student.name);
		}
		
		Iterator itr2 = stringList.iterator();
		while(itr2.hasNext())
		{
		    System.out.println(itr2.next());                // prints actual data for pre-defined classes
		}
		
		batch.forEach((student) ->{System.out.println(student.name+" "+student.rollNo);});
		
	
		
		
		((ArrayList<String>) stringList).ensureCapacity(2);      // sets stringList length = 10
	    stringList.add("clone1");
	    stringList.set(1, "Himanshu2");
	    stringList.add(1,"gh");
		System.out.println(stringList.size());
		
		stringList.forEach((studentName)->{
		   System.out.println(studentName); 
		});
	    
	    batch.forEach((student)->{System.out.println(student.name+" "+student.rollNo);});	
	}
}


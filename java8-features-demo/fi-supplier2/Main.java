import java.util.*;
import java.util.function.Supplier;

class Person
{
    int personId;
    String name;
    
    public Person(int personId, String name)
    {
        this.personId = personId;
        this.name = name;
    }
}

public class Main
{
	public static void main(String[] args) 
	{
	   // Person person1 = new Person(101, "Gourab");
	   // Person person2 = new Person(102, "Himanshu");
	    
	    Supplier<Person> personSupplier1 = () -> {
	        return new Person(101, "Gourab");
	    };
	    
	    Supplier<Person> personSupplier2 = () -> {
	        return new Person(102, "Himanshu");
	    };
	    
	    System.out.println(personSupplier1.get().personId + " --> " + personSupplier1.get().name);
	    System.out.println(personSupplier2.get().personId + " --> " + personSupplier2.get().name);
	}
}

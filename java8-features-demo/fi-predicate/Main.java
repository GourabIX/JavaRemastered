import java.util.*;
import java.util.function.*;

public class Main
{
    
    public static boolean checkAge(int age)
    {
        if (age < 18)
        {
            return true;
        }
        return false;
    }
    
	public static void main(String[] args) 
	{
	    Predicate<Integer> integerTest = (num) -> (num > 17);       // integerTest's test() method now refers to this lambda function
	    System.out.println(integerTest.test(25));
	    System.out.println(integerTest.test(14));
	    
	    Predicate<Integer> ageTest = Main::checkAge;
	    System.out.println(ageTest.test(25));
	    System.out.println(ageTest.test(14));
	}
}


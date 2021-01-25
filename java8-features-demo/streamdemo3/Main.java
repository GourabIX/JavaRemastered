import java.util.stream.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		List<String> listOfStrings = new ArrayList<String>();
		listOfStrings.add("This ");
		listOfStrings.add("is ");
		listOfStrings.add("a ");
		listOfStrings.add("list ");
		listOfStrings.add("of Strings.");
		
		String concatenatedString = listOfStrings.stream()
		                                         .reduce("", String::concat);
		System.out.println(concatenatedString);
		
		List<Integer> listOfNumbers = Arrays.asList(2, 4, -1, 3, 7, 5, 9, 6, 8);
		Optional<Integer> maxNumber = listOfNumbers.stream()
		                                           .max((num1, num2) -> num1.compareTo(num2));
		System.out.println("Max Number: " + maxNumber.get());
		
		Optional<Integer> minNumber = listOfNumbers.stream()
		                                           .min((num1, num2) -> num1.compareTo(num2));
		System.out.println("Min Number: " + minNumber.get());
	}
}

import java.util.function.*;
import java.util.*;

public class Main
{
    public static void printMessage(String message)
    {
        System.out.println("Hello "+ message);
    }
    
    public static void printValue(int val)
    {
        System.out.println(val);
    }
    
    public static void printSum(List<Integer> listOfValues)
    {
        int sumTotal = listOfValues.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum is: " + sumTotal);
    }
    
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Consumer<String> consumer = Main::printMessage;
		consumer.accept("Clone");
		
		Consumer<Integer> consumer1 = Main::printValue;
		consumer1.accept(15);
		
		List<Integer> listOfIntegers = new ArrayList<Integer>();
		listOfIntegers.add(10);
		listOfIntegers.add(20);
		listOfIntegers.add(30);
		listOfIntegers.add(40);
		listOfIntegers.add(50);
		listOfIntegers.add(60);
		
		Consumer<List<Integer>> listConsumer = Main::printSum;
		listConsumer.accept(listOfIntegers);

	}
}

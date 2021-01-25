import java.util.*;
import java.util.function.*;

public class Main
{
    public static void getNames(Supplier<String> supplier)
    {
        System.out.println(supplier.get());
    }
    
	public static void main(String[] args)
	{
		Supplier<Double> randomValue = () -> (Math.random());       // Math.random() returns Double value.
		System.out.println(randomValue.get());
		
		List<String> nameList = new ArrayList<String>();
		nameList.add("Gourab");
		nameList.add("Himanshu");
		
		nameList.stream().forEach((name) -> {
		    getNames(() -> name);
		});
	}
}


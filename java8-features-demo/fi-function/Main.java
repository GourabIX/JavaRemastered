import java.util.function.*;
import java.util.*;

public class Main
{
    static String message(String message)
    {
        return ("Hello "+message);
    }
    
    public static Integer getSumTotal(List<Integer> listOfValues)
    {
        return listOfValues.stream().mapToInt(Integer::intValue).sum();
    }
    
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		Function<String,String> display = Main::message;
		System.out.println(display.apply("Clone"));
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Function<List<Integer>, Integer> summer = Main::getSumTotal;
		System.out.println(summer.apply(list));
		
	}
}

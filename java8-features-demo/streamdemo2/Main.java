import java.util.stream.*;

public class Main
{
	public static void main(String[] args) 
	{
		Stream.iterate(5, element -> element + 1)
		      .filter(element -> element % 5 == 0)
		      .limit(6)
		      .forEach(System.out::println);
		      
		System.out.println();
		      
		Stream.iterate("a", e -> e + 1 )
		      .limit(5)
		      .forEach(System.out::println);
	}
}

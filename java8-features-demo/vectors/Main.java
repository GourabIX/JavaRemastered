import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
		Vector<String> names = new Vector<String>();
		names.add("Gourab");
		names.add("Himanshu");
		names.add("Ashwini");
		names.add("Anoop");
		names.add("Prashant");
		
		Enumeration enumerator = names.elements();
		while(enumerator.hasMoreElements())
		{
		    System.out.println(enumerator.nextElement());
		}
	}
}

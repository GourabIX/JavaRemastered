import java.util.*;

@FunctionalInterface
interface StringCapitalizer
{
    String capitalizer(String str);
}

public class Main implements StringCapitalizer
{
    public String capitalizer(String str)
    {
        if (str != null)
        {
            return str.substring(0, 1).toUpperCase() + str.substring(1);
        }
        return str;
    }
    
	public static void main(String[] args) 
	{
		List<String> listOfWords = new ArrayList<String>();
		listOfWords.add("good");
		listOfWords.add("morning");
		listOfWords.add("india");
		
		List<String> listOfCapitalizedWords = new ArrayList<String>();
		
	   // This is capitalizer through Lambda Interface
// 		listOfWords.forEach(word -> {
// 		    listOfCapitalizedWords.add(capitalizer(word));
// 		});
		
// 		listOfCapitalizedWords.forEach(word -> {
// 		    System.out.println(word);   
// 		});
		
		// This is capitalizer through Method References
		listOfWords.forEach(word -> {
		    System.out.println(Main::capitalizer);
		});
		    
		listOfCapitalizedWords.forEach(word -> {
		    System.out.println(word);   
		});
	}
}

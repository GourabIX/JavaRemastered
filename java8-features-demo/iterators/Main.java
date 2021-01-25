import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
	    List<String> wordList = new ArrayList<String>();
	    wordList.add("Random");
	    wordList.add("Scoob!");
	    wordList.add("District 9");
	    
	    System.out.println("Traversing elements with iterator: ");
	    ListIterator iterator = wordList.listIterator();
	    while(iterator.hasNext())
	    {
	        System.out.println("Index: " + iterator.nextIndex() + " Word: " + iterator.next());
	    }
	    
	    System.out.println("Traversing elements with reverse iterator: ");
	    while(iterator.hasPrevious())
	    {
	        System.out.println("Index: " + iterator.previousIndex() + " Word: " + iterator.previous());
	    }
	    
	    LinkedList<String> wordLinkedList = new LinkedList<String>();
	    wordLinkedList.add("Random");
	    wordLinkedList.add("Scoob!");
	    wordLinkedList.add("District 9");
	    
	    System.out.println("Traversing elements in a reversed manner: ");
	    Iterator iteratorDesc = wordLinkedList.descendingIterator();
	    while(iteratorDesc.hasNext())
	    {
	        System.out.println(iteratorDesc.next());
	    }
	}
}


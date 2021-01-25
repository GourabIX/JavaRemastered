import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
        Deque<String> dequeOfWords = new ArrayDeque<String>();
        dequeOfWords.add("Geralt of Rivia");
        dequeOfWords.add("Yennefer of Vengerberg");         // adds element and returns true
        dequeOfWords.offer("Triss Merigold");               // just adds element. returns nothing.
        dequeOfWords.offer("Roach");
        dequeOfWords.add("Ciri");
        dequeOfWords.offerFirst("Vesemir");                 // adds element to the front of the queue.
        
        for(String characterName: dequeOfWords)
        {
            System.out.println(characterName);
        }
        
        System.out.println("PollFirst or Poll: " + dequeOfWords.poll());
        System.out.println("PollLast: " + dequeOfWords.pollLast());
        
        Iterator itr = dequeOfWords.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
	}
}

import java.util.*;

class Game implements Comparable<Game>
{
    int id;
    String name, publisher;
    float price;
    
    public Game(int id, String name, String publisher, float price)
    {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.price = price;
    }
    
    public int compareTo(Game game)
    {
        if (id > game.id)
        {
            return 1;
        }
        return 0;
    }
}

public class Main
{
	public static void main(String[] args) 
	{
		Game g1 = new Game(101, "The Witcher 3", "CD Projekt Red", 449f);
		Game g2 = new Game(106, "Alan Wake", "Remedy Entertainment", 84f);
		Game g3 = new Game(113, "Bioshock: Infinite", "2K Games", 340f);
		Game g4 = new Game(104, "Assassin\'s Creed: Black Flag", "Ubisoft", 500.23f);
		Game g5 = new Game(102, "Max Payne 3", "Rockstar", 300f);
		
		Queue<Game> namesOfGames = new PriorityQueue<Game>();
		namesOfGames.add(g1);
		namesOfGames.add(g2);
		namesOfGames.add(g3);
		namesOfGames.add(g4);
		namesOfGames.add(g5);
        
        System.out.println("Here are the games: ");
        for(Game game: namesOfGames)
        {
            System.out.println(game.id + " - " + game.name + " - " + game.publisher + " - " + game.price);
        }
        
        System.out.println("First Game: ");
        System.out.println(namesOfGames.poll().name);
        
        System.out.println("Second Game: ");
        System.out.println(namesOfGames.remove().name);
        
        System.out.println("Third Game: ");
        System.out.println(namesOfGames.remove().name);

	}
}
